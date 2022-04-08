//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Simpleton.g4 by ANTLR 4.9.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="SimpletonParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.CLSCompliant(false)]
public interface ISimpletonListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProgram([NotNull] SimpletonParser.ProgramContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProgram([NotNull] SimpletonParser.ProgramContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDeclaration([NotNull] SimpletonParser.DeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDeclaration([NotNull] SimpletonParser.DeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.primitiv_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrimitiv_type([NotNull] SimpletonParser.Primitiv_typeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.primitiv_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrimitiv_type([NotNull] SimpletonParser.Primitiv_typeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterType([NotNull] SimpletonParser.TypeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitType([NotNull] SimpletonParser.TypeContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>FuncCall</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFuncCall([NotNull] SimpletonParser.FuncCallContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>FuncCall</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFuncCall([NotNull] SimpletonParser.FuncCallContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>Identifier</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIdentifier([NotNull] SimpletonParser.IdentifierContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>Identifier</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIdentifier([NotNull] SimpletonParser.IdentifierContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ConstantLiteral</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConstantLiteral([NotNull] SimpletonParser.ConstantLiteralContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ConstantLiteral</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConstantLiteral([NotNull] SimpletonParser.ConstantLiteralContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>NaNExpr</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNaNExpr([NotNull] SimpletonParser.NaNExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>NaNExpr</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNaNExpr([NotNull] SimpletonParser.NaNExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ParensExpr</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterParensExpr([NotNull] SimpletonParser.ParensExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ParensExpr</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitParensExpr([NotNull] SimpletonParser.ParensExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>InfixExpr</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInfixExpr([NotNull] SimpletonParser.InfixExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>InfixExpr</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInfixExpr([NotNull] SimpletonParser.InfixExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>UnaryExpr</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUnaryExpr([NotNull] SimpletonParser.UnaryExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>UnaryExpr</c>
	/// labeled alternative in <see cref="SimpletonParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUnaryExpr([NotNull] SimpletonParser.UnaryExprContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.member"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMember([NotNull] SimpletonParser.MemberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.member"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMember([NotNull] SimpletonParser.MemberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.constant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConstant([NotNull] SimpletonParser.ConstantContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.constant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConstant([NotNull] SimpletonParser.ConstantContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.variable_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariable_decl([NotNull] SimpletonParser.Variable_declContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.variable_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariable_decl([NotNull] SimpletonParser.Variable_declContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.const_variable_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConst_variable_decl([NotNull] SimpletonParser.Const_variable_declContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.const_variable_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConst_variable_decl([NotNull] SimpletonParser.Const_variable_declContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.list_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterList_decl([NotNull] SimpletonParser.List_declContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.list_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitList_decl([NotNull] SimpletonParser.List_declContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.list_initialize"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterList_initialize([NotNull] SimpletonParser.List_initializeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.list_initialize"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitList_initialize([NotNull] SimpletonParser.List_initializeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.struct_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStruct_decl([NotNull] SimpletonParser.Struct_declContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.struct_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStruct_decl([NotNull] SimpletonParser.Struct_declContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.struct_member"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStruct_member([NotNull] SimpletonParser.Struct_memberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.struct_member"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStruct_member([NotNull] SimpletonParser.Struct_memberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.enum_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEnum_decl([NotNull] SimpletonParser.Enum_declContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.enum_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEnum_decl([NotNull] SimpletonParser.Enum_declContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.enum_member"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEnum_member([NotNull] SimpletonParser.Enum_memberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.enum_member"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEnum_member([NotNull] SimpletonParser.Enum_memberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.function_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunction_decl([NotNull] SimpletonParser.Function_declContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.function_decl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunction_decl([NotNull] SimpletonParser.Function_declContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.return_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterReturn_type([NotNull] SimpletonParser.Return_typeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.return_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitReturn_type([NotNull] SimpletonParser.Return_typeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.formal_parameter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFormal_parameter([NotNull] SimpletonParser.Formal_parameterContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.formal_parameter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFormal_parameter([NotNull] SimpletonParser.Formal_parameterContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmt([NotNull] SimpletonParser.StmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmt([NotNull] SimpletonParser.StmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.jump_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterJump_stmt([NotNull] SimpletonParser.Jump_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.jump_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitJump_stmt([NotNull] SimpletonParser.Jump_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.return_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterReturn_stmt([NotNull] SimpletonParser.Return_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.return_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitReturn_stmt([NotNull] SimpletonParser.Return_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.switch_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSwitch_stmt([NotNull] SimpletonParser.Switch_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.switch_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSwitch_stmt([NotNull] SimpletonParser.Switch_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.switch_case"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSwitch_case([NotNull] SimpletonParser.Switch_caseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.switch_case"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSwitch_case([NotNull] SimpletonParser.Switch_caseContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.switch_case_default"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSwitch_case_default([NotNull] SimpletonParser.Switch_case_defaultContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.switch_case_default"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSwitch_case_default([NotNull] SimpletonParser.Switch_case_defaultContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.if_else_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIf_else_stmt([NotNull] SimpletonParser.If_else_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.if_else_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIf_else_stmt([NotNull] SimpletonParser.If_else_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.else_if_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElse_if_stmt([NotNull] SimpletonParser.Else_if_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.else_if_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElse_if_stmt([NotNull] SimpletonParser.Else_if_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.else_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElse_stmt([NotNull] SimpletonParser.Else_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.else_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElse_stmt([NotNull] SimpletonParser.Else_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.while_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhile_stmt([NotNull] SimpletonParser.While_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.while_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhile_stmt([NotNull] SimpletonParser.While_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.foreach_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForeach_stmt([NotNull] SimpletonParser.Foreach_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.foreach_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForeach_stmt([NotNull] SimpletonParser.Foreach_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBlock([NotNull] SimpletonParser.BlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBlock([NotNull] SimpletonParser.BlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.assign_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssign_stmt([NotNull] SimpletonParser.Assign_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.assign_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssign_stmt([NotNull] SimpletonParser.Assign_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.ternary_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTernary_stmt([NotNull] SimpletonParser.Ternary_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.ternary_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTernary_stmt([NotNull] SimpletonParser.Ternary_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.compound_assign_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCompound_assign_stmt([NotNull] SimpletonParser.Compound_assign_stmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.compound_assign_stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCompound_assign_stmt([NotNull] SimpletonParser.Compound_assign_stmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.func_call"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunc_call([NotNull] SimpletonParser.Func_callContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.func_call"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunc_call([NotNull] SimpletonParser.Func_callContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SimpletonParser.actual_parameter_list"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterActual_parameter_list([NotNull] SimpletonParser.Actual_parameter_listContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SimpletonParser.actual_parameter_list"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitActual_parameter_list([NotNull] SimpletonParser.Actual_parameter_listContext context);
}
