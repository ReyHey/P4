//using System;
//using Simpleton.AST;

//namespace Simpleton
//{
//    public class NodeVisitor : ASTVisitor<Node>
//    {
//        public Node VisitMultiplicationNode(MultiplicationNode node)
//        {
//            Node n = new Node();
//            n.Name = "*";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node Visit(ASTNode node)
//        {
//            return node.Accept(this);
//        }

//        public Node VisitAdditionNode(AdditionNode node)
//        {
//            Node n = new Node();
//            n.Name = "+";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitANDNode(ANDNode node)
//        {
//            Node n = new Node();
//            n.Name = "and";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitAssignStmtNode(AssignStmtNode node)
//        {
//            Node n = new Node();
//            n.Name = "AssignStmt";
//            n.Children.Add(Visit(node.identifier));
//            n.Children.Add(Visit(node.expression));
//            return n;
//        }

//        public Node VisitBlock(Block node)
//        {
//            Node n = new Node();
//            n.Name = "Block";
//            foreach (var stmt in node.statements)
//            {
//                n.Children.Add(Visit(stmt));
//            }
//            return n;
//        }

//        public Node VisitBooleanLiteral(BooleanLiteral node)
//        {
//            Node n = new Node();
//            n.Name = "boolean - value:" + node.value;
//            return n;
//        }

//        public Node VisitBreak(Break node)
//        {
//            Node n = new Node();
//            n.Name = "Break";
//            return n;
//        }

//        public Node VisitCase(Case node)
//        {
//            Node n = new Node();
//            n.Name = "Case";
//            n.Children.Add(Visit(node.CaseExpr));
//            n.Children.Add(Visit(node.block));
//            return n;
//        }

//        public Node VisitConditionBlock(ConditionBlock node)
//        {
//            Node n = new Node();
//            n.Name = "ConditionBlock";
//            n.Children.Add(Visit(node.condition));
//            n.Children.Add(Visit(node.block));
//            return n;
//        }

//        public Node VisitConstantDeclNode(ConstantDeclNode node)
//        {
//            Node n = new Node();
//            n.Name = "ConstantDeclNode";
//            n.Children.Add(Visit(node.name));
//            n.Children.Add(Visit(node.initialization));
//            return n;
//        }

//        public Node VisitContinue(Continue node)
//        {
//            Node n = new Node();
//            n.Name = "Continue";
//            return n;
//        }

//        public Node VisitDIVISIONEQNode(DIVISIONEQNode node)
//        {
//            Node n = new Node();
//            n.Name = "/=";
//            n.Children.Add(Visit(node.identifier));
//            n.Children.Add(Visit(node.expression));
//            return n;
//        }

//        public Node VisitDivisionNode(DivisionNode node)
//        {
//            Node n = new Node();
//            n.Name = "/";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitEnumMemberNode(EnumMemberNode node)
//        {
//            Node n = new Node();
//            n.Name = "EnumMember";
//            n.Children.Add(Visit(node.name));
//            n.Children.Add(Visit(node.value));
//            return n;
//        }

//        public Node VisitEnumNode(EnumNode node)
//        {
//            Node n = new Node();
//            n.Name = "EnumNode";
//            n.Children.Add(Visit(node.name));
//            foreach (var member in node.EnumMembers)
//            {
//                n.Children.Add(Visit(member));
//            }
//            return n;
//        }

//        public Node VisitEQEQNode(EQEQNode node)
//        {
//            Node n = new Node();
//            n.Name = "==";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitForeachNode(ForeachNode node)
//        {
//            Node n = new Node();
//            n.Name = "ForeachNode";
//            n.Children.Add(Visit(node.element));
//            n.Children.Add(Visit(node.list));
//            n.Children.Add(Visit(node.block));
//            return n;
//        }

//        public Node VisitFormalParameter(FormalParameter node)
//        {
//            Node n = new Node();
//            n.Name = "ForeachNode";
//            n.Children.Add(Visit(node.name));
//            return n;
//        }

//        public Node VisitFunctionCallNode(FunctionCallNode node)
//        {
//            Node n = new Node();
//            n.Name = "ForeachNode";
//            n.Children.Add(Visit(node.identifier));
//            if (node.actualParameters != null)
//                foreach (var parameter in node.actualParameters)
//                {
//                    n.Children.Add(Visit(parameter));
//                }
//            return n;
//        }

//        public Node VisitFunctionDeclNode(FunctionDeclNode node)
//        {
//            Node n = new Node();
//            n.Name = "ForeachNode";
//            n.Children.Add(Visit(node.name));
//            foreach (var parameter in node.formalParameters)
//            {
//                n.Children.Add(Visit(parameter));
//            }
//            n.Children.Add(Visit(node.block));
//            return n;
//        }

//        public Node VisitGreaterEQNode(GreaterEQNode node)
//        {
//            Node n = new Node();
//            n.Name = ">=";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitGreaterNode(GreaterNode node)
//        {
//            Node n = new Node();
//            n.Name = ">";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitIdentifier(Identifier node)
//        {
//            Node n = new Node();
//            n.Name = "Identifier: " + node.spelling;
//            return n;
//        }

//        public Node VisitIdentifierCall(IdentifierCall node)
//        {
//            Node n = new Node();
//            n.Name = "IdentifierCall";
//            n.Children.Add(Visit(node.identifier));
//            if (node.index != null)
//                n.Children.Add(Visit(node.index));
//            if (node.members != null)
//                foreach (var member in node.members)
//                {
//                    n.Children.Add(Visit(member));
//                }

//            return n;
//        }

//        public Node VisitIfNode(IfNode node)
//        {
//            Node n = new Node();
//            n.Name = "IfElseNode";
//            foreach (var conditionBlock in node.conditionBlocks)
//            {
//                n.Children.Add(Visit(conditionBlock));
//            }
//            if (node.elseBlock != null)
//                n.Children.Add(Visit(node.elseBlock));
//            return n;
//        }

//        public Node VisitInitialization(Initialization node)
//        {
//            Node n = new Node();
//            n.Name = "Initialization";
//            if (node.initialization != null)
//                n.Children.Add(Visit(node.initialization));
//            else
//                foreach (var element in node.elements)
//                {
//                    n.Children.Add(Visit(element));
//                }
//            return n;
//        }

//        public Node VisitLessEQNode(LessEQNode node)
//        {
//            Node n = new Node();
//            n.Name = "<=";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitLessNode(LessNode node)
//        {
//            Node n = new Node();
//            n.Name = "<";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitListDeclNode(ListDeclNode node)
//        {
//            Node n = new Node();
//            n.Name = "ListDeclNode";
//            n.Children.Add(Visit(node.name));
//            n.Children.Add(Visit(node.initialization));
//            return n;
//        }

//        public Node VisitMember(Member node)
//        {
//            Node n = new Node();
//            n.Name = "Member";
//            if (node.identifier != null)
//                n.Children.Add(Visit(node.identifier));
//            else
//                n.Children.Add(Visit(node.functionCall));
//            return n;
//        }

//        public Node VisitMINUSEQNode(MINUSEQNode node)
//        {
//            Node n = new Node();
//            n.Name = "-=";
//            n.Children.Add(Visit(node.identifier));
//            n.Children.Add(Visit(node.expression));
//            return n;
//        }

//        public Node VisitModNode(ModNode node)
//        {
//            Node n = new Node();
//            n.Name = "mod";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitMULTIEQNode(MULTIEQNode node)
//        {
//            Node n = new Node();
//            n.Name = "*=";
//            n.Children.Add(Visit(node.identifier));
//            n.Children.Add(Visit(node.expression));
//            return n;
//        }

//        public Node VisitNaNExpressionNode(NaNExpressionNode node)
//        {
//            Node n = new Node();
//            n.Name = "NaN";
//            return n;
//        }

//        public Node VisitNegativeExpressionNode(NegativeExpressionNode node)
//        {
//            Node n = new Node();
//            n.Name = "NegativeExpressionNode";
//            n.Children.Add(Visit(node.expr));
//            return n;
//        }

//        public Node VisitNOTEQNode(NOTEQNode node)
//        {
//            Node n = new Node();
//            n.Name = "!=";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitNotExpressionNode(NotExpressionNode node)
//        {
//            Node n = new Node();
//            n.Name = "NotExpressionNode";
//            n.Children.Add(Visit(node.expr));
//            return n;
//        }

//        public Node VisitNumberLiteral(NumberLiteral node)
//        {
//            Node n = new Node();
//            n.Name = "number - value:" + node.value;
//            return n;
//        }

//        public Node VisitORNode(ORNode node)
//        {
//            Node n = new Node();
//            n.Name = "or";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitPLUSEQNode(PLUSEQNode node)
//        {
//            Node n = new Node();
//            n.Name = "+=";
//            n.Children.Add(Visit(node.identifier));
//            n.Children.Add(Visit(node.expression));
//            return n;
//        }

//        public Node VisitPowNode(PowNode node)
//        {
//            Node n = new Node();
//            n.Name = "*";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitProgramNode(ProgramNode node)
//        {
//            Node n = new Node();
//            n.Name = "Program";
//            foreach (var item in node.declarations)
//            {
//                n.Children.Add(Visit(item));
//            }
//            return n;
//        }

//        public Node VisitReturn(Return node)
//        {
//            Node n = new Node();
//            n.Name = "Return";
//            if (node.returnValue != null)
//            {
//                n.Children.Add(Visit(node.returnValue));
//            }
//            return n;
//        }

//        public Node VisitStructMemberNode(StructMemberNode node)
//        {
//            Node n = new Node();
//            n.Name = "StructMemberNode";
//            n.Children.Add(Visit(node.name));
//            return n;
//        }

//        public Node VisitStructNode(StructNode node)
//        {
//            Node n = new Node();
//            n.Name = "StructNode";
//            n.Children.Add(Visit(node.name));
//            foreach (var item in node.structMembers)
//            {
//                n.Children.Add(Visit(item));
//            }
//            return n;
//        }

//        public Node VisitSubtractionNode(SubtractionNode node)
//        {
//            Node n = new Node();
//            n.Name = "*-";
//            n.Children.Add(Visit(node.Left));
//            n.Children.Add(Visit(node.Right));
//            return n;
//        }

//        public Node VisitSwitchNode(SwitchNode node)
//        {
//            Node n = new Node();
//            n.Name = "SwitchNode";
//            n.Children.Add(Visit(node.condition));
//            foreach (var item in node.cases)
//            {
//                n.Children.Add(Visit(item));
//            }
//            if (node.defaultCase != null)
//                n.Children.Add(Visit(node.defaultCase));
//            return n;
//        }

//        public Node VisitTernaryNode(TernaryNode node)
//        {
//            Node n = new Node();
//            n.Name = "TernaryNode";
//            n.Children.Add(Visit(node.identifier));
//            n.Children.Add(Visit(node.condition));
//            n.Children.Add(Visit(node.ifClause));
//            n.Children.Add(Visit(node.elseClause));
//            return n;
//        }

//        public Node VisitTextLiteral(TextLiteral node)
//        {
//            Node n = new Node();
//            n.Name = "text - value:" + node.value;
//            return n;
//        }

//        public Node VisitVariableDeclNode(VariableDeclNode node)
//        {
//            Node n = new Node();
//            n.Name = "VariableDeclNode";
//            n.Children.Add(Visit(node.name));
//            if (node.initialization != null)
//                n.Children.Add(Visit(node.initialization));

//            return n;
//        }

//        public Node VisitWhileNode(WhileNode node)
//        {
//            Node n = new Node();
//            n.Name = "WhileNode";
//            n.Children.Add(Visit(node.condition));

//            n.Children.Add(Visit(node.block));

//            return n;
//        }
//    }
//}

