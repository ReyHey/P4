using Simpleton.AST;
using Simpleton.SymTable;

namespace Simpleton
{
    public class TopLevelDeclaration : ASTVisitor<object>
    {
        public TopLevelDeclaration(SymbolTable symbolTable)
        {
            this.symbolTable = symbolTable;
        }
        SymbolTable symbolTable { get; }

        public object VariableCallNode(VariableCallNode node)
        {
            return null;
        }

        public object Visit(ASTNode node)
        {
            return node.Accept(this);
        }

        public object VisitProgramNode(ProgramNode node)
        {
            foreach (var declaration in node.declarations)
            {
                Visit(declaration);
            }
            return null;
        }


        public object VisitStructNode(StructNode node)
        {
            symbolTable.PutSymbol(node.name, new Symbol(node.name, node));
            return null;
        }

        public object VisitEnumNode(EnumNode node)
        {
            symbolTable.PutSymbol(node.name, new Symbol(node.name, node));
            return null;
        }

        public object VisitFunctionDeclNode(FunctionDeclNode node)
        {
            symbolTable.PutSymbol(node.name, new Symbol(node.name, node));
            return null;
        }

        public object VisitAdditionNode(AdditionNode node)
        {
            return null;
        }

        public object VisitANDNode(ANDNode node)
        {
            return null;
        }

        public object VisitAssignStmtNode(AssignStmtNode node)
        {
            return null;
        }

        public object VisitBlock(Block node)
        {
            return null;
        }

        public object VisitBooleanLiteral(BooleanLiteral node)
        {
            return null;
        }

        public object VisitBreak(Break node)
        {
            return null;
        }

        public object VisitCase(Case node)
        {
            return null;
        }

        public object VisitConditionBlock(ConditionBlock node)
        {
            return null;
        }

        public object VisitContinue(Continue node)
        {
            return null;
        }

        public object VisitDIVISIONEQNode(DIVISIONEQNode node)
        {
            return null;
        }

        public object VisitDivisionNode(DivisionNode node)
        {
            return null;
        }

        public object VisitDotReferencingNode(DotReferencingNode node)
        {
            return null;
        }

        public object VisitEnumMemberNode(EnumMemberNode node)
        {
            return null;
        }


        public object VisitEQEQNode(EQEQNode node)
        {
            return null;
        }

        public object VisitFieldNode(Field node)
        {
            return null;
        }

        public object VisitForeachNode(ForeachNode node)
        {
            return null;
        }

        public object VisitFormalParameter(FormalParameter node)
        {
            return null;
        }

        public object VisitFunctionCallNode(FunctionCallNode node)
        {


            return null;
        }



        public object VisitGreaterEQNode(GreaterEQNode node)
        {
            return null;
        }

        public object VisitGreaterNode(GreaterNode node)
        {
            return null;
        }

        public object VisitIfNode(IfNode node)
        {
            return null;
        }

        public object VisitInitialization(Initialization node)
        {
            return null;
        }

        public object VisitLessEQNode(LessEQNode node)
        {
            return null;
        }

        public object VisitLessNode(LessNode node)
        {
            return null;
        }

        public object VisitListDeclNode(ListDeclNode node)
        {
            return null;
        }

        public object VisitMethodNode(Method node)
        {
            return null;
        }

        public object VisitMINUSEQNode(MINUSEQNode node)
        {
            return null;
        }

        public object VisitModNode(ModNode node)
        {
            return null;
        }

        public object VisitMULTIEQNode(MULTIEQNode node)
        {
            return null;
        }

        public object VisitMultiplicationNode(MultiplicationNode node)
        {
            return null;
        }

        public object VisitNaNExpressionNode(NaNExpressionNode node)
        {
            return null;
        }

        public object VisitNegativeExpressionNode(NegativeExpressionNode node)
        {
            return null;
        }

        public object VisitNOTEQNode(NOTEQNode node)
        {
            return null;
        }

        public object VisitNotExpressionNode(NotExpressionNode node)
        {
            return null;
        }

        public object VisitNumberLiteral(NumberLiteral node)
        {
            return null;
        }

        public object VisitORNode(ORNode node)
        {
            return null;
        }

        public object VisitPLUSEQNode(PLUSEQNode node)
        {
            return null;
        }

        public object VisitPowNode(PowNode node)
        {
            return null;
        }



        public object VisitReturn(Return node)
        {
            return null;
        }

        public object VisitStructMemberNode(StructMemberNode node)
        {
            return null;
        }

        public object VisitSubscriptCallNode(SubscriptCallNode node)
        {
            return null;
        }

        public object VisitSubscriptMemberNode(SubscriptMember node)
        {
            return null;
        }

        public object VisitSubtractionNode(SubtractionNode node)
        {
            return null;
        }

        public object VisitSwitchNode(SwitchNode node)
        {
            return null;
        }

        public object VisitTernaryNode(TernaryNode node)
        {
            return null;
        }

        public object VisitTextLiteral(TextLiteral node)
        {
            return null;
        }

        public object VisitVariableDeclNode(VariableDeclNode node)
        {
            return null;
        }

        public object VisitWhileNode(WhileNode node)
        {
            return null;
        }
    }
}
