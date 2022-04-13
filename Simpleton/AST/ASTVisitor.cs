namespace Simpleton.AST
{
    public interface ASTVisitor<T>
    {
        T Visit(ASTNode node);
        T VisitProgramNode(ProgramNode node);
        T VisitFunctionDeclNode(FunctionDeclNode node);
        T VisitFormalParameter(FormalParameter node);
        T VisitStructNode(StructNode node);
        T VisitStructMemberNode(StructMemberNode node);
        T VisitEnumNode(EnumNode node);
        T VisitEnumMemberNode(EnumMemberNode node);
        T VisitConstantDeclNode(ConstantDeclNode node);
        T VisitAdditionNode(AdditionNode node);
        T VisitSubtractionNode(SubtractionNode node);
        T VisitMultiplicationNode(MultiplicationNode node);
        T VisitDivisionNode(DivisionNode node);
        T VisitPowNode(PowNode node);
        T VisitModNode(ModNode node);
        T VisitEQEQNode(EQEQNode node);
        T VisitNOTEQNode(NOTEQNode node);
        T VisitLessEQNode(LessEQNode node);

        T VisitGreaterEQNode(GreaterEQNode node);
        T VisitGreaterNode(GreaterNode node);
        T VisitLessNode(LessNode node);
        T VisitANDNode(ANDNode node);
        T VisitORNode(ORNode node);
        T VisitNotExpressionNode(NotExpressionNode node);
        T VisitNegativeExpressionNode(NegativeExpressionNode node);
        T VisitNaNExpressionNode(NaNExpressionNode node);
        T VisitFunctionCallNode(FunctionCallNode node);
        T VisitListIndexerNode(ListIndexerNode node);
        T VisitIdentifierCall(IdentifierCall node);
        T VisitAssignStmtNode(AssignStmtNode node);
        T VisitIfNode(IfNode node);
        T VisitConditionBlock(ConditionBlock node);
        T VisitBlock(Block node);

        T VisitSwitchNode(SwitchNode node);
        T VisitCase(Case node);
        T VisitForeachNode(ForeachNode node);
        T VisitWhileNode(WhileNode node);
        T VisitVariableDeclNode(VariableDeclNode node);
        T VisitListDeclNode(ListDeclNode node);
        T VisitInitialization(Initialization node);
        T VisitBreak(Break node);
        T VisitContinue(Continue node);
        T VisitReturn(Return node);
        T VisitPLUSEQNode(PLUSEQNode node);
        T VisitMINUSEQNode(MINUSEQNode node);
        T VisitMULTIEQNode(MULTIEQNode node);
        T VisitDIVISIONEQNode(DIVISIONEQNode node);
        T VisitTernaryNode(TernaryNode node);
        T VisitNumberLiteral(NumberLiteral node);
        T VisitTextLiteral(TextLiteral node);
        T VisitBooleanLiteral(BooleanLiteral node);


        T VisitDotReferencingNode(DotReferencingNode node);
    }
}