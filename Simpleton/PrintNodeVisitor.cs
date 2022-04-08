using Simpleton.AST;

namespace Simpleton.AST
{
    class PrintNodeVisitor : ASTVisitor<PrintNode>
    {
        public PrintNode Visit(ASTNode node)
        {
            return node.Accept(this);
        }

        public PrintNode VisitAdditionNode(AdditionNode node)
        {
            PrintNode p = new PrintNode("+", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitANDNode(ANDNode node)
        {
            PrintNode p = new PrintNode("and", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitAssignStmtNode(AssignStmtNode node)
        {
            PrintNode p = new PrintNode("AssignNode", node.Line);
            p.AddChild(Visit(node.identifier));
            p.AddChild(Visit(node.expression));
            return p;
        }

        public PrintNode VisitBlock(Block node)
        {
            PrintNode p = new PrintNode("Block", node.Line);
            foreach (var stmt in node.statements)
            {
                p.AddChild(Visit(stmt));
            }

            return p;
        }

        public PrintNode VisitBooleanLiteral(BooleanLiteral node)
        {
            return new PrintNode("Boolean", node.value, node.Line);
        }

        public PrintNode VisitBreak(Break node)
        {
            return new PrintNode("Break", node.Line);
        }

        public PrintNode VisitCase(Case node)
        {
            PrintNode p = new PrintNode("Case", node.Line);
            p.AddChild(Visit(node.CaseExpr));
            foreach (var stmt in node.block)
            {
                p.AddChild(Visit(stmt));
            }

            return p;
        }

        public PrintNode VisitConditionBlock(ConditionBlock node)
        {
            PrintNode p = new PrintNode("ConditionBlock", node.Line);
            p.AddChild(Visit(node.condition));
            p.AddChild(Visit(node.block));
            return p;
        }

        public PrintNode VisitConstantDeclNode(ConstantDeclNode node)
        {
            PrintNode p = new PrintNode("ConstantDeclNode", node.name, node.Line);
            p.AddChild(Visit(node.initialization));
            return p;
        }

        public PrintNode VisitContinue(Continue node)
        {
            return new PrintNode("Continue", node.Line);
        }

        public PrintNode VisitDIVISIONEQNode(DIVISIONEQNode node)
        {
            PrintNode p = new PrintNode("DIVISIONEQNode", node.Line);
            p.AddChild(Visit(node.identifier));
            p.AddChild(Visit(node.expression));
            return p;
        }

        public PrintNode VisitDivisionNode(DivisionNode node)
        {
            PrintNode p = new PrintNode("/", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitEnumMemberNode(EnumMemberNode node)
        {
            PrintNode p = new PrintNode("EnumMember", node.name, node.Line);
            if (node.value != null)
                p.AddChild(Visit(node.value));
            return p;
        }

        public PrintNode VisitEnumNode(EnumNode node)
        {
            PrintNode p = new PrintNode("Enum", node.name, node.Line);
            foreach (var m in node.EnumMembers)
            {
                p.AddChild(Visit(m));
            }
            return p;
        }

        public PrintNode VisitEQEQNode(EQEQNode node)
        {
            PrintNode p = new PrintNode("==", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitForeachNode(ForeachNode node)
        {
            PrintNode p = new PrintNode("Foreach", node.element, node.Line);
            p.AddChild(Visit(node.list));
            p.AddChild(Visit(node.block));
            return p;
        }

        public PrintNode VisitFormalParameter(FormalParameter node)
        {
            return new PrintNode("Formal", node.type.ToString() + " " + node.name, node.Line);
        }

        public PrintNode VisitFunctionCallNode(FunctionCallNode node)
        {
            PrintNode p = new PrintNode("FunctionCall", node.identifier, node.Line);
            if (node.actualParameters != null)
                foreach (var a in node.actualParameters)
                {
                    p.AddChild(Visit(a));
                }


            return p;
        }

        public PrintNode VisitFunctionDeclNode(FunctionDeclNode node)
        {
            PrintNode p = new PrintNode("FunctionDecl", node.returnType.ToString() + " " + node.name, node.Line);
            foreach (var f in node.formalParameters)
            {
                p.AddChild(Visit(f));
            }
            p.AddChild(Visit(node.block));
            return p;
        }

        public PrintNode VisitGreaterEQNode(GreaterEQNode node)
        {
            PrintNode p = new PrintNode(">=", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitGreaterNode(GreaterNode node)
        {
            PrintNode p = new PrintNode(">", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitIdentifierCall(IdentifierCall node)
        {
            PrintNode p = new PrintNode("IdentifierCall", node.identifier, node.Line);
            if (node.index != null)
                p.AddChild(Visit(node.index));
            if (node.members != null)
                foreach (var m in node.members)
                {
                    p.AddChild(Visit(m));
                }
            return p;
        }

        public PrintNode VisitIfNode(IfNode node)
        {
            PrintNode p = new PrintNode("Ifelse", node.Line);
            foreach (var c in node.conditionBlocks)
            {
                p.AddChild(Visit(c));
            }
            if (node.elseBlock != null)
                p.AddChild(Visit(node.elseBlock));
            return p;
        }

        public PrintNode VisitInitialization(Initialization node)
        {
            PrintNode p = new PrintNode("Initialization", node.Line);
            if (node.initialization != null)
            {
                p.AddChild(Visit(node.initialization));
            }
            if (node.elements != null)
            {
                foreach (var element in node.elements)
                {
                    p.AddChild(Visit(element));
                }
            }
            return p;
        }

        public PrintNode VisitLessEQNode(LessEQNode node)
        {
            PrintNode p = new PrintNode("<=", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitLessNode(LessNode node)
        {
            PrintNode p = new PrintNode("<", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitListDeclNode(ListDeclNode node)
        {
            PrintNode p = new PrintNode("ListDecl", node.type.ToString() + " " + node.name, node.Line);
            if (node.initialization != null)
                p.AddChild(Visit(node.initialization));
            return p;
        }

        public PrintNode VisitMember(Member node)
        {

            if (node.identifier != null)
                return new PrintNode("Member", node.identifier, node.Line);
            else
            {
                PrintNode p = new PrintNode("Member", node.Line);
                p.AddChild(Visit(node.functionCall));
                return p;
            }

        }

        public PrintNode VisitMINUSEQNode(MINUSEQNode node)
        {
            PrintNode p = new PrintNode("MINUSEQNode", node.Line);
            p.AddChild(Visit(node.identifier));
            p.AddChild(Visit(node.expression));
            return p;
        }

        public PrintNode VisitModNode(ModNode node)
        {
            PrintNode p = new PrintNode("mod", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitMULTIEQNode(MULTIEQNode node)
        {
            PrintNode p = new PrintNode("MULTIEQNode", node.Line);
            p.AddChild(Visit(node.identifier));
            p.AddChild(Visit(node.expression));
            return p;
        }

        public PrintNode VisitMultiplicationNode(MultiplicationNode node)
        {
            PrintNode p = new PrintNode("*", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitNaNExpressionNode(NaNExpressionNode node)
        {
            PrintNode p = new PrintNode("NaN", node.Line);
            return p;
        }

        public PrintNode VisitNegativeExpressionNode(NegativeExpressionNode node)
        {
            PrintNode p = new PrintNode("NegativeExpression", node.Line);
            p.AddChild(Visit(node.expr));
            return p;
        }

        public PrintNode VisitNOTEQNode(NOTEQNode node)
        {
            PrintNode p = new PrintNode("!=", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitNotExpressionNode(NotExpressionNode node)
        {
            PrintNode p = new PrintNode("NotExpression", node.Line);
            p.AddChild(Visit(node.expr));
            return p;
        }

        public PrintNode VisitNumberLiteral(NumberLiteral node)
        {
            return new PrintNode("Number", node.value, node.Line);
        }

        public PrintNode VisitORNode(ORNode node)
        {
            PrintNode p = new PrintNode("or", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitPLUSEQNode(PLUSEQNode node)
        {
            PrintNode p = new PrintNode("+=", node.Line);
            p.AddChild(Visit(node.identifier));
            p.AddChild(Visit(node.expression));
            return p;
        }

        public PrintNode VisitPowNode(PowNode node)
        {
            PrintNode p = new PrintNode("^", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitProgramNode(ProgramNode node)
        {
            PrintNode p = new PrintNode("Program", node.Line);
            foreach (var d in node.declarations)
            {
                p.AddChild(Visit(d));
            }
            return p;
        }

        public PrintNode VisitReturn(Return node)
        {
            PrintNode p = new PrintNode("Return", node.Line);

            return p;
        }

        public PrintNode VisitStructMemberNode(StructMemberNode node)
        {
            return new PrintNode("Member", node.type.ToString() + " " + node.name, node.Line);
        }

        public PrintNode VisitStructNode(StructNode node)
        {
            PrintNode p = new PrintNode("Struct", node.name, node.Line);
            foreach (var m in node.structMembers)
            {
                p.AddChild(Visit(m));
            }
            return p;
        }

        public PrintNode VisitSubtractionNode(SubtractionNode node)
        {
            PrintNode p = new PrintNode("-", node.Line);
            p.AddChild(Visit(node.Left));
            p.AddChild(Visit(node.Right));
            return p;
        }

        public PrintNode VisitSwitchNode(SwitchNode node)
        {
            PrintNode p = new PrintNode("Switch", node.Line);
            p.AddChild(Visit(node.condition));
            foreach (var c in node.cases)
            {
                p.AddChild(Visit(c));
            }
            if (node.defaultCase != null)
                foreach (var stmt in node.defaultCase)
                {
                    p.AddChild(Visit(stmt));
                }

            return p;
        }

        public PrintNode VisitTernaryNode(TernaryNode node)
        {
            PrintNode p = new PrintNode("Ternary", node.Line);
            p.AddChild(Visit(node.identifier));
            p.AddChild(Visit(node.condition));
            p.AddChild(Visit(node.ifClause));
            p.AddChild(Visit(node.elseClause));

            return p;
        }

        public PrintNode VisitTextLiteral(TextLiteral node)
        {
            return new PrintNode("Text", node.value, node.Line);
        }

        public PrintNode VisitVariableDeclNode(VariableDeclNode node)
        {
            PrintNode p = new PrintNode("VariableDecl" + node.type.ToString() + " " + node.name, node.Line);
            if (node.initialization != null)
                p.AddChild(Visit(node.initialization));


            return p;
        }

        public PrintNode VisitWhileNode(WhileNode node)
        {
            PrintNode p = new PrintNode("While", node.Line);
            p.AddChild(Visit(node.condition));
            p.AddChild(Visit(node.block));
            return p;
        }
    }
}
