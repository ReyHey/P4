using System.Linq;
using Simpleton.AST;

namespace Simpleton
{
    class PrettyPrint : ASTVisitor<string>
    {
        int indent = 0;

        string PrintIndent { get => string.Concat(Enumerable.Repeat(" ", indent * 4)); }

        public string Visit(ASTNode node)
        {
            return node.Accept(this);
        }

        public string VisitProgramNode(ProgramNode node)
        {
            string s = "";
            foreach (var d in node.declarations)
            {
                s += Visit(d) + "\n";
            }
            return s;
        }
        public string VisitFunctionDeclNode(FunctionDeclNode node)
        {
            string s = "function";
            s += node.returnType.ToString() + " " + node.name + "(";

            for (int i = 0; i < node.formalParameters.Count; i++)
            {
                s += Visit(node.formalParameters[i]);

                if (i < node.formalParameters.Count - 1)
                    s += ", ";
            }
            s += ")";
            s += Visit(node.block);
            return s;
        }
        public string VisitFormalParameter(FormalParameter node)
        {
            return node.type.ToString() + " " + node.name;
        }

        public string VisitStructNode(StructNode node)
        {
            string s = "struct " + node.name + "{\n";
            indent++;
            foreach (var member in node.structMembers)
            {
                s += PrintIndent + Visit(member) + "\n";
            }
            indent--;
            return s + "}\n";
        }
        public string VisitStructMemberNode(StructMemberNode node)
        {
            return node.type + " " + node.name;
        }

        public string VisitEnumNode(EnumNode node)
        {
            string s = "enum " + node.name + "{\n";
            indent++;
            foreach (var member in node.EnumMembers)
            {
                s += PrintIndent + Visit(member) + "\n";
            }
            indent--;
            return s + "}\n";
        }

        public string VisitEnumMemberNode(EnumMemberNode node)
        {
            if (node.value != null)
                return node.name + "=" + Visit(node.value);
            else
                return node.name;
        }
        public string VisitConstantDeclNode(ConstantDeclNode node)
        {
            return "constant" + Visit((VariableDeclNode)node);
        }

        public string VisitAdditionNode(AdditionNode node)
        {
            return Visit(node.Left) + " + " + Visit(node.Right);
        }
        public string VisitSubtractionNode(SubtractionNode node)
        {
            return Visit(node.Left) + " - " + Visit(node.Right);
        }
        public string VisitMultiplicationNode(MultiplicationNode node)
        {
            return Visit(node.Left) + " * " + Visit(node.Right);
        }
        public string VisitDivisionNode(DivisionNode node)
        {
            return Visit(node.Left) + " / " + Visit(node.Right);
        }
        public string VisitPowNode(PowNode node)
        {
            return Visit(node.Left) + " ^ " + Visit(node.Right);
        }
        public string VisitModNode(ModNode node)
        {
            return Visit(node.Left) + " mod " + Visit(node.Right);
        }
        public string VisitEQEQNode(EQEQNode node)
        {
            return Visit(node.Left) + " == " + Visit(node.Right);
        }
        public string VisitNOTEQNode(NOTEQNode node)
        {
            return Visit(node.Left) + " != " + Visit(node.Right);
        }
        public string VisitLessEQNode(LessEQNode node)
        {
            return Visit(node.Left) + " <= " + Visit(node.Right);
        }

        public string VisitGreaterEQNode(GreaterEQNode node)
        {
            return Visit(node.Left) + " >= " + Visit(node.Right);
        }
        public string VisitGreaterNode(GreaterNode node)
        {
            return Visit(node.Left) + " > " + Visit(node.Right);
        }
        public string VisitLessNode(LessNode node)
        {
            return Visit(node.Left) + " < " + Visit(node.Right);
        }
        public string VisitANDNode(ANDNode node)
        {
            return Visit(node.Left) + " and " + Visit(node.Right);
        }
        public string VisitORNode(ORNode node)
        {
            return Visit(node.Left) + " or " + Visit(node.Right);
        }
        public string VisitNotExpressionNode(NotExpressionNode node)
        {
            return "! " + Visit(node.expr);
        }
        public string VisitNegativeExpressionNode(NegativeExpressionNode node)
        {
            return "- " + Visit(node.expr);
        }
        public string VisitNaNExpressionNode(NaNExpressionNode node)
        {
            return "NaN";
        }
        public string VisitFunctionCallNode(FunctionCallNode node)
        {
            string s = $"{node.identifier}(";
            if (node.actualParameters != null)
                for (int i = 0; i < node.actualParameters.Count; i++)
                {
                    if (i < node.actualParameters.Count - 1)
                    {
                        s += Visit(node.actualParameters[i]) + ", ";
                    }
                    else
                    {
                        s += Visit(node.actualParameters[i]);
                    }
                }
            s += ")";
            return s;
        }
        public string VisitMember(Member node)
        {
            if (node.identifier != null)
            {
                return "." + node.identifier;
            }
            return "." + Visit(node.functionCall);

        }
        public string VisitIdentifierCall(IdentifierCall node)
        {
            string s = "";
            foreach (var item in node.members)
            {
                s += Visit(item);
            }


            if (node.index != null)
                return node.identifier + "[" + Visit(node.index) + "]" + s;
            else
                return node.identifier + s;


        }
        public string VisitAssignStmtNode(AssignStmtNode node)
        {
            return Visit(node.identifier) + " = " + Visit(node.expression);
        }
        public string VisitIfNode(IfNode node)
        {
            string s = "";

            for (int i = 0; i < node.conditionBlocks.Count; i++)
            {
                if (i == 0)
                    s += "if " + Visit(node.conditionBlocks[i].condition) + Visit(node.conditionBlocks[i].block);
                else
                    s += PrintIndent + "else if " + Visit(node.conditionBlocks[i].condition) + Visit(node.conditionBlocks[i].block);
            }

            if (node.elseBlock != null)
            {
                s += PrintIndent + "else " + Visit(node.elseBlock);
            }

            return s;
        }
        public string VisitConditionBlock(ConditionBlock node)
        {
            return Visit(node);
        }
        public string VisitBlock(Block node)
        {
            string s = "";
            indent++;
            foreach (var stmt in node.statements)
            {
                s += PrintIndent + Visit(stmt) + "\n";
            }
            indent--;

            return "\n" + PrintIndent + "{\n" + s + PrintIndent + "}\n";
        }


        public string VisitSwitchNode(SwitchNode node)
        {
            string s = $"switch {Visit(node.condition)} {{\n";
            indent++;
            foreach (Case switchcase in node.cases)
            {
                s += PrintIndent + $"{VisitCase(switchcase)}\n";
            }
            s += PrintIndent + "default: \n";
            indent++;
            foreach (StmtNode stmt in node.defaultCase)
            {
                s += PrintIndent + Visit(stmt) + "\n";
            }
            s += PrintIndent + "break\n";
            indent--;
            indent--;
            s += PrintIndent + "}";
            return s;
        }
        public string VisitCase(Case node)
        {
            string s = $"case {Visit(node.CaseExpr)}:\n";
            indent++;
            foreach (StmtNode stmt in node.block)
            {
                s += PrintIndent + Visit(stmt) + "\n";
            }
            indent--;
            return s + PrintIndent + "break";

        }
        public string VisitForeachNode(ForeachNode node)
        {
            return PrintIndent + $"foreach {node.type} {node.element} in {VisitIdentifierCall(node.list)} {Visit(node.block)}";
        }
        public string VisitWhileNode(WhileNode node)
        {
            return $"while {Visit(node.condition)} {Visit(node.block)}";
        }
        public string VisitVariableDeclNode(VariableDeclNode node)
        {
            return $"{node.type} {node.name} {(node.initialization != null ? " = " + Visit(node.initialization) : "")}";
        }
        public string VisitListDeclNode(ListDeclNode node)
        {
            return $"List<{node.type}> {node.name} {(node.initialization != null ? Visit(node.initialization) : "")}";
        }
        public string VisitInitialization(Initialization node)
        {
            string s = "[";
            int i = 0;
            foreach (ExpressionNode exprNode in node.elements)
            {
                i++;
                s += Visit(exprNode);
                if (i != node.elements.Count)
                    s += ", ";
            }
            return s + "]";
        }
        public string VisitBreak(Break node)
        {
            return "Break\n";
        }
        public string VisitContinue(Continue node)
        {
            return "Continue\n";
        }
        public string VisitReturn(Return node)
        {
            return $"Return {Visit(node.returnValue)}\n";
        }
        public string VisitPLUSEQNode(PLUSEQNode node)
        {
            return $"{Visit(node.identifier)} += {Visit(node.expression)}";
        }
        public string VisitMINUSEQNode(MINUSEQNode node)
        {
            return $"{Visit(node.identifier)} -= {Visit(node.expression)}";
        }
        public string VisitMULTIEQNode(MULTIEQNode node)
        {
            return $"{Visit(node.identifier)} *= {Visit(node.expression)}";
        }
        public string VisitDIVISIONEQNode(DIVISIONEQNode node)
        {
            return $"{Visit(node.identifier)} /= {Visit(node.expression)}";
        }
        public string VisitTernaryNode(TernaryNode node)
        {
            return Visit(node.identifier) + " = " + Visit(node.ifClause) + " if " + Visit(node.condition) + " else " + Visit(node.elseClause);
        }
        public string VisitNumberLiteral(NumberLiteral node)
        {
            return node.value;
        }
        public string VisitTextLiteral(TextLiteral node)
        {
            return node.value;
        }
        public string VisitBooleanLiteral(BooleanLiteral node)
        {
            return node.value;
        }


    }



}
