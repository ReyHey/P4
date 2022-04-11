using System;
using Simpleton.AST;
using Simpleton.SymTable;

namespace Simpleton
{
    class ScopeCheckerVisitor : ASTVisitor<object>
    {
        SymbolTable symbolTable = new SymbolTable();

        public object Visit(ASTNode node)
        {
            return node.Accept(this);
        }

        public object VisitAdditionNode(AdditionNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitANDNode(ANDNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitAssignStmtNode(AssignStmtNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitBlock(Block node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitBooleanLiteral(BooleanLiteral node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitBreak(Break node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitCase(Case node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitConditionBlock(ConditionBlock node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitConstantDeclNode(ConstantDeclNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitContinue(Continue node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitDIVISIONEQNode(DIVISIONEQNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitDivisionNode(DivisionNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitEnumMemberNode(EnumMemberNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitEnumNode(EnumNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitEQEQNode(EQEQNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitForeachNode(ForeachNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitFormalParameter(FormalParameter node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitFunctionCallNode(FunctionCallNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitFunctionDeclNode(FunctionDeclNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitGreaterEQNode(GreaterEQNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitGreaterNode(GreaterNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitIdentifierCall(IdentifierCall node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitIfNode(IfNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitInitialization(Initialization node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitLessEQNode(LessEQNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitLessNode(LessNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitListDeclNode(ListDeclNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitMember(Member node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitMINUSEQNode(MINUSEQNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitModNode(ModNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitMULTIEQNode(MULTIEQNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitMultiplicationNode(MultiplicationNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitNaNExpressionNode(NaNExpressionNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitNegativeExpressionNode(NegativeExpressionNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitNOTEQNode(NOTEQNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitNotExpressionNode(NotExpressionNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitNumberLiteral(NumberLiteral node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitORNode(ORNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitPLUSEQNode(PLUSEQNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitPowNode(PowNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitProgramNode(ProgramNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitReturn(Return node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitStructMemberNode(StructMemberNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitStructNode(StructNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitSubtractionNode(SubtractionNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitSwitchNode(SwitchNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitTernaryNode(TernaryNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitTextLiteral(TextLiteral node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitVariableDeclNode(VariableDeclNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitWhileNode(WhileNode node)
        {
            throw new System.NotImplementedException();
        }
    }


}
