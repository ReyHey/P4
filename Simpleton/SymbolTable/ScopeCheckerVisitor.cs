using System;
using System.Collections.Generic;
using Simpleton.AST;
using Simpleton.SymTable;
using Type = Simpleton.AST.Type;

namespace Simpleton
{
    class ScopeCheckerVisitor : ASTVisitor<object>
    {
        SymbolTable symbolTable = new SymbolTable();

        List<Symbol> TempSymbols = new List<Symbol>();

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
            symbolTable.OpenNewScope();

            foreach (Symbol symbol in TempSymbols)
            {
                symbolTable.PutSymbol(symbol.name, symbol);
            }
            TempSymbols.Clear();

            foreach (var stmt in node.statements)
            {
                Visit(stmt);
            }
            symbolTable.CloseNewlyCreatedScope();
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
            symbolTable.OpenNewScope();

            Visit(node.CaseExpr);
            foreach (var stmt in node.block)
            {
                Visit(stmt);
            }

            symbolTable.CloseNewlyCreatedScope();
            return new object();
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
            symbolTable.PutSymbol(node.name, new VariableSymbol(node.name, node.type, node));
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
            return new VariableSymbol(node.name, new Simpleton.AST.Type("int", false, false), node);
        }

        public object VisitEnumNode(EnumNode node)
        {
            List<VariableSymbol> symbols = new List<VariableSymbol>();
            foreach (var member in node.EnumMembers)
            {
                symbols.Add((VariableSymbol)Visit(member));
            }
            symbolTable.PutSymbol(node.name, new EnumDeclarationSymbol(node.name, symbols, node));
            return new object();

        }

        public object VisitEQEQNode(EQEQNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }



        public object VisitForeachNode(ForeachNode node)
        {
            Visit(node.list);
            Visit(node.block);
            TempSymbols.Add(new VariableSymbol(node.element, node.type, node));


            return new object();
        }

        public object VisitFormalParameter(FormalParameter node)
        {
            return new Symbol(node.name, node);
        }

        public object VisitFunctionCallNode(FunctionCallNode node)
        {
            try
            {
                symbolTable.getSymbol(node.identifier);
            }
            catch (GetException e)
            {
                Console.WriteLine(e.Message);
                System.Environment.Exit(-1);
            }

            return new object();
        }

        public object VisitFunctionDeclNode(FunctionDeclNode node)
        {
            symbolTable.PutSymbol(node.name, new Symbol(node.name, node));
            foreach (FormalParameter parameter in node.formalParameters)
            {
                TempSymbols.Add((Symbol)Visit(parameter));
            }
            Visit(node.block);

            return new object();
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


        public object VisitDotReferencingNode(DotReferencingNode node)
        {

            Visit(node.parent);



            return new object();
        }





        public object VisitMember(Member node)
        {
            if (node.club as IdentifierCall != null)
            {
                IdentifierCall club = node.club as IdentifierCall;
                StructSymbol symbolClub = (StructSymbol)symbolTable.getSymbol(club.identifier);
                if (!symbolClub.members.ContainsKey(node.identifier))
                    throw new GetException(node.identifier);



            }



            return new object();
        }


        public object VisitIdentifierCall(IdentifierCall node)
        {
            try
            {
                Type LType = node.Lidentifier.type;


            }
            catch (GetException e)
            {
                Console.WriteLine(e.Message);
                System.Environment.Exit(-1);
            }

            return new object();
        }


        //public object VisitIdentifierCall(IdentifierCall node)
        //{
        //    try
        //    {
        //        symbolTable.getSymbol(node.identifier);
        //        if (node.index != null)
        //            Visit(node.index);

        //        foreach (Member member in node.members)
        //        {
        //            Visit(member);
        //        }

        //    }
        //    catch (GetException e)
        //    {
        //        Console.WriteLine(e.Message);
        //        System.Environment.Exit(-1);
        //    }

        //    return new object();
        //}

        public object VisitIfNode(IfNode node)
        {
            foreach (ConditionBlock conditionBlock in node.conditionBlocks)
            {
                Visit(conditionBlock);
            }
            if (node.elseBlock != null)
                Visit(node.elseBlock);

            return new object();
        }

        public object VisitInitialization(Initialization node)
        {
            if (node.initialization != null)
            {
                Visit(node.initialization);
            }
            else
                foreach (ExpressionNode element in node.elements)
                {
                    Visit(element);
                }

            return new object();
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
            symbolTable.PutSymbol(node.name, new Symbol(node.name, node));
            Visit(node.initialization);
            return new object();
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
            return new VariableSymbol(node.name, node.type, node);
        }

        public object VisitStructNode(StructNode node)
        {
            List<VariableSymbol> symbols = new List<VariableSymbol>();
            foreach (var member in node.structMembers)
            {
                symbols.Add((VariableSymbol)Visit(member));
            }
            symbolTable.PutSymbol(node.name, new StructDeclarationSymbol(node.name, symbols, node));
            return new object();
        }

        public object VisitSubtractionNode(SubtractionNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return new object();
        }

        public object VisitSwitchNode(SwitchNode node)
        {
            symbolTable.OpenNewScope();
            Visit(node.condition);
            foreach (var switchCase in node.cases)
            {
                Visit(switchCase);
            }

            symbolTable.OpenNewScope();
            foreach (StmtNode stmt in node.defaultCase)
            {
                Visit(stmt);
            }
            symbolTable.CloseNewlyCreatedScope();



            return new object();
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
            if (node.type.userDefinedType)
            {
                StructDeclarationSymbol structDecl = (StructDeclarationSymbol)symbolTable.getSymbol(node.type.typeName);
                symbolTable.PutSymbol(node.name, new StructSymbol(node.type.typeName, node.name, structDecl.members, node));
            }
            else
                symbolTable.PutSymbol(node.name, new VariableSymbol(node.name, node.type, node));

            Visit(node.initialization);
            return new object();
        }

        public object VisitWhileNode(WhileNode node)
        {
            throw new Exception();
        }
    }


}
