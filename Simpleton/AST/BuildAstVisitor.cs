using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using static SimpletonParser;
using Antlr4.Runtime;

namespace Simpleton.AST
{
    public class BuildAstVisitor : ISimpletonVisitor<object>
    {
        public object Visit(IParseTree tree)
        {
            return tree.Accept(this);
        }

        public object VisitActual_parameter_list([NotNull] SimpletonParser.Actual_parameter_listContext context)
        {
            List<ExpressionNode> actualParameters = new List<ExpressionNode>();

            foreach (ExprContext parameter in context.expr())
            {
                actualParameters.Add((ExpressionNode)Visit(parameter));
            }

            return actualParameters;
        }

        public object VisitAssign_stmt([NotNull] SimpletonParser.Assign_stmtContext context)
        {
            AssignStmtNode node = new AssignStmtNode();

            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            node.variable = (CallNode)(Visit(context.id_assign()));
            node.expression = (ExpressionNode)Visit(context.expr());
            return node;
        }

        public object VisitBlock([NotNull] SimpletonParser.BlockContext context)
        {
            Block block = new Block();
            block.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            foreach (StmtContext stmt in context.stmt())
            {
                block.statements.Add((StmtNode)Visit(stmt));
            }

            return (Block)block;
        }

        public object VisitChildren(IRuleNode node)
        {
            throw new NotImplementedException();
        }

        public object VisitCompound_assign_stmt([NotNull] SimpletonParser.Compound_assign_stmtContext context)
        {
            CompoundAssignNode node;

            switch (context.compoundOP.Text)
            {
                case "+=":
                    node = new PLUSEQNode();
                    break;
                case "-=":
                    node = new MINUSEQNode();
                    break;
                case "*=":
                    node = new MULTIEQNode();
                    break;
                case "/=":
                    node = new DIVISIONEQNode();
                    break;
                default:
                    throw new NotSupportedException();
            }
            node.variable = (CallNode)Visit(context.id_assign());
            node.expression = (ExpressionNode)Visit(context.expr());
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitConstant([NotNull] SimpletonParser.ConstantContext context)
        {
            var number = context.NUMBER();
            if (number != null)
            {
                return new NumberLiteral((string)Visit(number));
            }

            var text = context.TEXT();
            if (text != null)
            {
                return new TextLiteral((string)Visit(text));
            }

            var boolean = context.BOOlEAN();
            if (boolean != null)
            {
                return new BooleanLiteral((string)Visit(boolean));
            }

            return null;

        }


        public object VisitConst_variable_decl([NotNull] SimpletonParser.Const_variable_declContext context)
        {
            VariableDeclNode node = (VariableDeclNode)Visit(context.variable_decl());
            if (node.initialization == null)
            {
                Console.WriteLine($"line {node.Line.line}: The constant variable must be initialized");
                Environment.Exit(1);
            }
            node.constant = true;
            return node;
        }

        public object VisitDeclaration([NotNull] SimpletonParser.DeclarationContext context)
        {

            var function_decl = context.function_decl();
            if (function_decl != null) return (Declaration)Visit(function_decl);

            var struct_decl = context.struct_decl();
            if (struct_decl != null) return (Declaration)Visit(struct_decl);

            var enum_decl = context.enum_decl();
            if (enum_decl != null) return (Declaration)Visit(enum_decl);

            var const_variable_decl = context.const_variable_decl();
            if (const_variable_decl != null) return (Declaration)Visit(const_variable_decl);

            return null;
        }

        public object VisitElse_if_stmt([NotNull] SimpletonParser.Else_if_stmtContext context)
        {
            return new ConditionBlock((ExpressionNode)Visit(context.expr()), (Block)Visit(context.block()));
        }

        public object VisitElse_stmt([NotNull] SimpletonParser.Else_stmtContext context)
        {
            return Visit(context.block());
        }

        public object VisitEnum_decl([NotNull] SimpletonParser.Enum_declContext context)
        {
            EnumNode node = new EnumNode();
            node.name = (string)Visit(context.IDENTIFIER());
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            Enum_memberContext[] members = context.enum_member();

            foreach (Enum_memberContext member in members)
            {
                node.EnumMembers.Add((EnumMemberNode)Visit(member));
            }

            return node;
        }

        public object VisitEnum_member([NotNull] SimpletonParser.Enum_memberContext context)
        {
            EnumMemberNode node = new EnumMemberNode();
            node.name = (string)Visit(context.IDENTIFIER());
            node.value = context.NUMBER() != null ? new NumberLiteral((string)Visit(context.NUMBER())) : null;
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitErrorNode(IErrorNode node)
        {
            throw new Exception("Error");
        }

        public object VisitForeach_stmt([NotNull] SimpletonParser.Foreach_stmtContext context)
        {
            ForeachNode node = new ForeachNode();

            node.element = new VariableDeclNode();
            node.element.name = context.element.Text;
            node.element.type = (Type)Visit(context.type());
            node.element.shouldBeInit = false;

            node.list = (CallNode)Visit(context.id());

            node.block = (Block)Visit(context.block());
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitFormal_parameter([NotNull] SimpletonParser.Formal_parameterContext context)
        {
            FormalParameter parameter = new FormalParameter();

            parameter.name = (string)Visit(context.IDENTIFIER());
            parameter.type = (Type)Visit(context.type());
            parameter.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return parameter;
        }

        FunctionDeclNode refNode;

        public object VisitFunction_decl([NotNull] SimpletonParser.Function_declContext context)
        {
            FunctionDeclNode node = new FunctionDeclNode();

            refNode = node;

            node.returnType = (Type)Visit(context.returnType);
            node.name = context.name.Text;

            foreach (Formal_parameterContext parameter in context.formal_parameter())
            {
                node.formalParameters.Add((FormalParameter)Visit(parameter));
            }

            node.block = (Block)Visit(context.block());

            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);

            refNode = null;
            return node;
        }

        LineInfo CreateLineInfo(int l, int c)
        {
            LineInfo info;
            info.line = l;
            info.column = c;
            return info;
        }

        public object VisitIf_else_stmt([NotNull] SimpletonParser.If_else_stmtContext context)
        {
            IfNode node = new IfNode();
            node.conditionBlocks.Add(new ConditionBlock((ExpressionNode)Visit(context.expr()), (Block)Visit(context.block())));
            Else_if_stmtContext[] else_If_Stmts = context.else_if_stmt();
            foreach (var else_If in else_If_Stmts)
            {
                node.conditionBlocks.Add((ConditionBlock)Visit(else_If));
            }
            var elseStmt = context.else_stmt();
            node.elseBlock = elseStmt != null ? (Block)Visit(elseStmt) : null;
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitJump_stmt([NotNull] SimpletonParser.Jump_stmtContext context)
        {
            var return_stmt = context.return_stmt();
            if (return_stmt != null)
            {
                return (Return)Visit(context.return_stmt());
            }
            else if (context.jump.Text == "break")
            {
                Break @break = new Break();
                @break.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
                return @break;
            }
            else if (context.jump.Text == "continue")
            {
                Continue @continue = new Continue();
                @continue.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
                return @continue;
            }
            return null;
        }

        public object VisitList_decl([NotNull] SimpletonParser.List_declContext context)
        {
            ListDeclNode node = new ListDeclNode();
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            if (context.innerType != null)
            {
                node.type = new Type(context.innerType.Text, true, true);
            }
            else
            {
                node.type = (Type)Visit(context.primitiv_type());
                node.type.listType = true;
            }

            node.name = context.vName.Text;


            var expr = context.expr();
            if (expr != null)
            {
                node.initialization = new Initialization();
                node.initialization.initialization = (ExpressionNode)Visit(expr);
            }
            else if (context.list_initialize() != null)
                node.initialization = (Initialization)Visit(context.list_initialize());

            return node;
        }

        public object VisitList_initialize([NotNull] SimpletonParser.List_initializeContext context)
        {
            Initialization node = new Initialization();
            node.initialization = null;
            ExprContext[] elements = context.expr();
            foreach (var element in elements)
            {
                node.elements.Add((ExpressionNode)Visit(element));
            }
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitPrimitiv_type([NotNull] SimpletonParser.Primitiv_typeContext context)
        {
            return new Type(context.primitivtType.Text, false, false);
        }

        public object VisitProgram([NotNull] SimpletonParser.ProgramContext context)
        {
            ProgramNode program = new ProgramNode();
            program.Line = CreateLineInfo(0, 0);

            foreach (DeclarationContext declaration in context.declaration())
            {
                program.declarations.Add((Declaration)Visit(declaration));
            }
            return program;
        }

        public object VisitReturn_stmt([NotNull] SimpletonParser.Return_stmtContext context)
        {
            Return node = new Return();
            var expr = context.expr();
            node.returnValue = expr != null ? (ExpressionNode)Visit(expr) : null;
            node.functionDecl = refNode;
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitReturn_type([NotNull] SimpletonParser.Return_typeContext context)
        {
            Type type;

            TypeContext tempType = context.type();

            if (tempType != null)
            {
                type = (Type)Visit(tempType);
                if (type != null)
                    return type;
            }

            ITerminalNode tempVoid = context.VOID();
            if (tempVoid != null)
            {
                type = new Type((string)Visit(tempVoid), false, false);
                if (type != null)
                    return type;
            }

            return new Type((string)Visit(context.IDENTIFIER()), false, true);
        }

        public object VisitStmt([NotNull] SimpletonParser.StmtContext context)
        {
            If_else_stmtContext if_Else_StmtContext = context.if_else_stmt();
            if (if_Else_StmtContext != null)
            {
                return (StmtNode)Visit(if_Else_StmtContext);
            }

            Switch_stmtContext switch_CaseContext = context.switch_stmt();
            if (switch_CaseContext != null)
            {
                return (StmtNode)Visit(switch_CaseContext);
            }

            var whileStmt = context.while_stmt();
            if (whileStmt != null)
            {
                return (StmtNode)Visit(whileStmt);
            }

            var foreachStmt = context.foreach_stmt();
            if (foreachStmt != null)
            {
                return (StmtNode)Visit(foreachStmt);
            }

            var variableDecl = context.variable_decl();
            if (variableDecl != null)
            {
                return (StmtNode)Visit(variableDecl);
            }

            var listDecl = context.list_decl();
            if (listDecl != null)
            {
                return (StmtNode)Visit(listDecl);
            }

            var jump = context.jump_stmt();
            if (jump != null)
            {
                return (StmtNode)Visit(jump);
            }

            var expr = context.expr();
            if (expr != null)
            {
                return (StmtNode)Visit(expr);
            }

            var assign_stmt = context.assign_stmt();
            if (assign_stmt != null)
            {
                return (StmtNode)Visit(assign_stmt);
            }

            var compound_assign_stmt = context.compound_assign_stmt();
            if (compound_assign_stmt != null)
            {
                return (StmtNode)Visit(compound_assign_stmt);
            }

            var ternary_stmt = context.ternary_stmt();
            if (ternary_stmt != null)
            {
                return (StmtNode)Visit(ternary_stmt);
            }

            var block = context.block();
            if (block != null)
            {
                return (StmtNode)Visit(block);
            }

            return null;

        }

        public object VisitStruct_decl([NotNull] SimpletonParser.Struct_declContext context)
        {
            StructNode node = new StructNode();

            node.name = (string)Visit(context.IDENTIFIER());

            Struct_memberContext[] members = context.struct_member();

            foreach (Struct_memberContext member in members)
            {
                node.structMembers.Add((StructMemberNode)Visit(member));
            }

            foreach (var structMember in node.structMembers)
            {
                structMember.club = node;
            }

            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitStruct_member([NotNull] SimpletonParser.Struct_memberContext context)
        {
            StructMemberNode node = new StructMemberNode();
            node.name = (string)Visit(context.IDENTIFIER());
            node.type = (Type)Visit(context.type());
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitSwitch_case([NotNull] SimpletonParser.Switch_caseContext context)
        {
            ExprContext exprContexts = context.expr();
            Case caseSwitch = new Case();
            caseSwitch.CaseExpr = (ExpressionNode)Visit(exprContexts);
            if (context.stmt() != null)
                foreach (StmtContext stmt in context.stmt())
                {
                    caseSwitch.block.Add((StmtNode)Visit(stmt));
                }
            caseSwitch.Line = CreateLineInfo(context.Start.Line, context.Start.Column);

            return caseSwitch;
        }




        public object VisitSwitch_case_default([NotNull] SimpletonParser.Switch_case_defaultContext context)
        {
            List<StmtNode> block = new List<StmtNode>();
            foreach (StmtContext stmt in context.stmt())
            {
                block.Add((StmtNode)Visit(stmt));
            }

            return block;
        }

        public object VisitSwitch_stmt([NotNull] SimpletonParser.Switch_stmtContext context)
        {
            SwitchNode node = new SwitchNode();
            node.condition = (ExpressionNode)Visit(context.expr());

            Switch_caseContext[] cases = context.switch_case();
            foreach (Switch_caseContext switchCase in cases)
            {
                node.cases.Add((Case)Visit(switchCase));
            }

            var defaultCase = context.switch_case_default();

            if (defaultCase != null)
            {
                node.defaultCase = (List<StmtNode>)Visit(defaultCase);
            }
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitTerminal(ITerminalNode node)
        {
            return node.Symbol.Text;
        }

        public object VisitTernary_stmt([NotNull] SimpletonParser.Ternary_stmtContext context)
        {
            TernaryNode node = new TernaryNode();

            node.variable = (CallNode)Visit(context.id_assign());

            node.condition = (ExpressionNode)Visit(context.cond);
            node.ifClause = (ExpressionNode)Visit(context.ifExpr);
            node.elseClause = (ExpressionNode)Visit(context.elseExpr);
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;

        }

        public object VisitType([NotNull] SimpletonParser.TypeContext context)
        {
            ITerminalNode list = context.LIST();
            Type primitivtType = context.primitiv_type() != null ? (Type)Visit(context.primitiv_type()) : null;
            Type userDefinedType = context.IDENTIFIER() != null ? new Type((string)Visit(context.IDENTIFIER()), false, true) : null;
            if (list != null)
            {
                if (primitivtType != null)
                {
                    primitivtType.listType = true;
                    return primitivtType;
                }
                else if (userDefinedType != null)
                {
                    userDefinedType.listType = true;
                    return userDefinedType;
                }

            }
            else
            {
                if (primitivtType != null)
                    return primitivtType;
                else if (userDefinedType != null)
                    return userDefinedType;
            }

            return null;

        }

        public object VisitVariable_decl([NotNull] SimpletonParser.Variable_declContext context)
        {
            VariableDeclNode node = new VariableDeclNode();

            if (context.primitiv_type() != null)
            {
                node.type = (Type)Visit(context.primitiv_type());
            }
            else
            {
                node.type = new Type(context.userDefinedType.Text, false, true);
            }
            node.name = context.vName.Text;
            node.initialization = context.expr() != null ? (ExpressionNode)Visit(context.expr()) : null;
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitWhile_stmt([NotNull] SimpletonParser.While_stmtContext context)
        {
            WhileNode node = new WhileNode();

            node.condition = (ExpressionNode)Visit(context.expr());
            node.block = (Block)Visit(context.block());
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitConstantLiteral([NotNull] ConstantLiteralContext context)
        {
            return Visit(context.constant());
        }

        public object VisitNaNExpr([NotNull] NaNExprContext context)
        {
            NaNExpressionNode node = new NaNExpressionNode();
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitParensExpr([NotNull] ParensExprContext context)
        {
            return Visit(context.expr());
        }

        public object VisitInfixExpr([NotNull] InfixExprContext context)
        {
            InfixExpressionNode node;

            switch (context.op.Text)
            {
                case "+":
                    node = new AdditionNode();
                    break;
                case "-":
                    node = new SubtractionNode();
                    break;
                case "*":
                    node = new MultiplicationNode();
                    break;
                case "/":
                    node = new DivisionNode();
                    break;
                case "^":
                    node = new PowNode();
                    break;
                case "mod":
                    node = new ModNode();
                    break;
                case "==":
                    node = new EQEQNode();
                    break;
                case "!=":
                    node = new NOTEQNode();
                    break;
                case "<":
                    node = new LessNode();
                    break;
                case ">":
                    node = new GreaterNode();
                    break;
                case ">=":
                    node = new GreaterEQNode();
                    break;
                case "<=":
                    node = new LessEQNode();
                    break;
                case "and":
                    node = new ANDNode();
                    break;
                case "or":
                    node = new ORNode();
                    break;
                default:
                    throw new NotSupportedException();
            }

            node.Left = (ExpressionNode)Visit(context.left);
            node.Right = (ExpressionNode)Visit(context.right);
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitUnaryExpr([NotNull] UnaryExprContext context)
        {
            UnaryExpressionNode node;

            switch (context.op.Text)
            {
                case "-":
                    node = new NegativeExpressionNode();
                    break;
                case "!":
                    node = new NotExpressionNode();
                    break;
                default:
                    throw new NotSupportedException();
            }

            node.expr = (ExpressionNode)Visit(context.expr());
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitFuncCall([NotNull] FuncCallContext context)
        {
            return Visit(context.func_call());
        }


        public object VisitFunc_call([NotNull] Func_callContext context)
        {
            string funcName = (string)Visit(context.IDENTIFIER());
            Actual_parameter_listContext actual_Parameter_List = context.actual_parameter_list();
            List<ExpressionNode> actualParameterList = actual_Parameter_List != null ? (List<ExpressionNode>)Visit(actual_Parameter_List) : new List<ExpressionNode>();
            FunctionCallNode node = new FunctionCallNode(funcName, actualParameterList);

            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }


        public object VisitIdentifierCall([NotNull] IdentifierCallContext context)
        {
            return Visit(context.id());
        }

        public object VisitSubscript([NotNull] SubscriptContext context)
        {
            SubscriptCallNode node = new SubscriptCallNode((string)Visit(context.IDENTIFIER()), (ExpressionNode)(Visit(context.expr())));
            node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
            return node;
        }

        public object VisitId([NotNull] IdContext context)
        {
            if (context.id() != null)
            {
                DotReferencingNode referencingNode = new DotReferencingNode();
                referencingNode.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
                referencingNode.parent = (CallNode)Visit(context.id());
                CallNode member = (CallNode)Visit(context.ids());
                if (member is FunctionCallNode)
                {
                    FunctionCallNode method = (FunctionCallNode)member;
                    referencingNode.member = new Method(method.identifier, method.actualParameters, referencingNode.parent);
                    referencingNode.member.Line = method.Line;
                }
                else if (member is SubscriptCallNode)
                {
                    SubscriptCallNode subscript = (SubscriptCallNode)member;
                    referencingNode.member = new SubscriptMember(subscript.identifier, subscript.index, referencingNode.parent);
                    referencingNode.member.Line = subscript.Line;
                }
                else
                {
                    VariableCallNode field = (VariableCallNode)member;
                    referencingNode.member = new Field(field.identifier, referencingNode.parent);
                    referencingNode.member.Line = field.Line;
                }
                return referencingNode;
            }
            else
            {
                return Visit(context.ids());
            }
        }

        public object VisitIds([NotNull] IdsContext context)
        {
            if (context.IDENTIFIER() != null)
            {
                VariableCallNode node = new VariableCallNode((string)Visit(context.IDENTIFIER()));
                node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
                return node;
            }
            else if (context.func_call() != null)
                return Visit(context.func_call());
            else
                return Visit(context.subscript());
        }

        public object VisitId_assign([NotNull] Id_assignContext context)
        {
            if (context.id_assign() != null)
            {
                DotReferencingNode referencingNode = new DotReferencingNode();
                referencingNode.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
                referencingNode.parent = (CallNode)Visit(context.id_assign());
                CallNode member = (CallNode)Visit(context.ids_assign());
                if (member is SubscriptCallNode)
                {
                    SubscriptCallNode subscript = (SubscriptCallNode)member;
                    referencingNode.member = new SubscriptMember(subscript.identifier, subscript.index, referencingNode.parent);
                    referencingNode.member.Line = subscript.Line;
                }
                else
                {
                    VariableCallNode field = (VariableCallNode)member;
                    referencingNode.member = new Field(field.identifier, referencingNode.parent);
                    referencingNode.member.Line = field.Line;
                }
                return referencingNode;
            }
            else
            {
                return Visit(context.ids_assign());
            }
        }

        public object VisitIds_assign([NotNull] Ids_assignContext context)
        {
            if (context.IDENTIFIER() != null)
            {
                VariableCallNode node = new VariableCallNode((string)Visit(context.IDENTIFIER()));
                node.Line = CreateLineInfo(context.Start.Line, context.Start.Column);
                return node;
            }
            else
                return Visit(context.subscript());
        }
    }
}

