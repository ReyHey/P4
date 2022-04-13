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
            Visit(node.identifier);
            Visit(node.expression);
            return new object();
        }

        public object VisitBlock(Block node)
        {
            foreach (var stmt in node.statements)
            {
                Visit(stmt);
            }
            return new object();
        }

        public object VisitBooleanLiteral(BooleanLiteral node)
        {
            return new object();
        }

        public object VisitBreak(Break node)
        {
            return new object();
        }

        public object VisitCase(Case node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitConditionBlock(ConditionBlock node)
        {
            Visit(node.condition);
            symbolTable.OpenNewScope();
            Visit(node.block);
            symbolTable.CloseNewlyCreatedScope();
            return new object();
        }

        public object VisitConstantDeclNode(ConstantDeclNode node)
        {
            symbolTable.PutSymbol(node.type, node.name, node);
            Visit(node.initialization);
            return new object();
        }

        public object VisitContinue(Continue node)
        {
            return new object();
        }

        public object VisitDIVISIONEQNode(DIVISIONEQNode node)
        {
            Visit(node.identifier);
            Visit(node.expression);
            return new object();
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
            Visit(node.Left);
            Visit(node.Right);
            return new object();
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
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitGreaterNode(GreaterNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
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
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitLessNode(LessNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitListDeclNode(ListDeclNode node)
        {
            symbolTable.PutSymbol(node.type, node.name, node);
            Visit(node.initialization);
            return new object();
        }

        public object VisitMember(Member node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitMINUSEQNode(MINUSEQNode node)
        {
            Visit(node.identifier);
            Visit(node.expression);
            return new object();
        }

        public object VisitModNode(ModNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitMULTIEQNode(MULTIEQNode node)
        {
            Visit(node.identifier);
            Visit(node.expression);
            return new object();
        }

        public object VisitMultiplicationNode(MultiplicationNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitNaNExpressionNode(NaNExpressionNode node)
        {
            return new object();
        }

        public object VisitNegativeExpressionNode(NegativeExpressionNode node)
        {
            Visit(node.expr);
            return new object();
        }

        public object VisitNOTEQNode(NOTEQNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitNotExpressionNode(NotExpressionNode node)
        {
            Visit(node.expr);
            return new object();
        }

        public object VisitNumberLiteral(NumberLiteral node)
        {
            return new object();
        }

        public object VisitORNode(ORNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitPLUSEQNode(PLUSEQNode node)
        {
            Visit(node.identifier);
            Visit(node.expression);
            return new object();
        }

        public object VisitPowNode(PowNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitProgramNode(ProgramNode node)
        {
            foreach (var declaration in node.declarations)
            {
                Visit(declaration);
            }
            return new object();
        }

        public object VisitReturn(Return node)
        {
            return new object();
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
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitSwitchNode(SwitchNode node)
        {
            throw new System.NotImplementedException();
        }

        public object VisitTernaryNode(TernaryNode node)
        {
            Visit(node.identifier);
            Visit(node.condition);
            Visit(node.ifClause);
            Visit(node.elseClause);
            return new object();
        }

        public object VisitTextLiteral(TextLiteral node)
        {
            return new object();
        }

        public object VisitVariableDeclNode(VariableDeclNode node)
        {
            symbolTable.PutSymbol(node.type, node.name, node);
            Visit(node.initialization);
            return new object();
        }

        public object VisitWhileNode(WhileNode node)
        {
            throw new Exception();
        }
    }


}
