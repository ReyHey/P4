﻿using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using Simpleton.AST;
using Simpleton.SymTable;
using Type = Simpleton.AST.Type;

namespace Simpleton
{
    class ScopeCheckerVisitor : ASTVisitor<object>
    {
        SymbolTable symbolTable = new SymbolTable();

        List<Symbol> TempSymbols = new List<Symbol>();

        public ScopeCheckerVisitor(ASTNode AST)
        {
            PredefinedSymbolTable();
            new TopLevelDeclaration(symbolTable).Visit(AST);
        }


        void PredefinedSymbolTable()
        {

            string[] lines = File.ReadAllLines((Program.terminal ? "" : "../../../") + "SymbolTable/PredefinedSymbol.txt");


            for (int i = 0; i < lines.Length; i++)
            {
                if (lines[i].Contains(":"))
                {
                    string name = lines[i].TrimEnd(':');
                    Dictionary<string, FunctionDeclNode> methods = new Dictionary<string, FunctionDeclNode>();

                    i++;
                    while (lines[i] != "")
                    {
                        FunctionDeclNode functionDeclNode = CreateFunctionDecl(lines[i].Trim(' '));
                        methods.Add(functionDeclNode.name, functionDeclNode);
                        i++;
                    }
                    symbolTable.PutSymbol(name, new TypeSymbol(name, methods));
                }
                else if (lines[i] != (""))
                {
                    FunctionDeclNode functionDeclNode = CreateFunctionDecl(lines[i]);
                    symbolTable.PutSymbol(functionDeclNode.name, new Symbol(functionDeclNode.name, functionDeclNode));
                }

            }
        }



        FunctionDeclNode CreateFunctionDecl(string line)
        {
            string type = line.Substring(0, line.IndexOf(" "));
            string funcName = line.Substring(line.IndexOf(" ") + 1, line.IndexOf("(") - line.IndexOf(" ") - 1);
            string parameters = line.Remove(0, line.IndexOf("("));

            return new FunctionDeclNode(CreateType(type), funcName, CreateFormalParameters(parameters));
        }

        List<FormalParameter> CreateFormalParameters(string parametersString)
        {
            List<FormalParameter> list = new List<FormalParameter>();
            if (parametersString != "()")
            {
                string[] parameters = parametersString.TrimStart('(').TrimEnd(')').Split(",");

                foreach (string parameter in parameters)
                {
                    string[] s = parameter.Split(" ");
                    list.Add(new FormalParameter(CreateType(s[0]), s[1]));
                }
            }

            return list;
        }

        Type CreateType(string type)
        {
            if (type.StartsWith("list"))
            {
                string innerType = type.Substring(type.IndexOf("<") + 1, type.IndexOf(">") - type.IndexOf("<") - 1);
                return new Type(innerType, true, false);
            }
            else
            {
                return new Type(type, false, false);
            }


        }

        public object Visit(ASTNode node)
        {
            return node.Accept(this);
        }

        public object VisitAdditionNode(AdditionNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }

        public object VisitANDNode(ANDNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }
        public object VisitDivisionNode(DivisionNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }
        public object VisitEQEQNode(EQEQNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }
        public object VisitGreaterEQNode(GreaterEQNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }

        public object VisitGreaterNode(GreaterNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }
        public object VisitLessEQNode(LessEQNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }

        public object VisitLessNode(LessNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }
        public object VisitModNode(ModNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }
        public object VisitMultiplicationNode(MultiplicationNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }
        public object VisitNOTEQNode(NOTEQNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }
        public object VisitORNode(ORNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }
        public object VisitPowNode(PowNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
        }

        public object VisitAssignStmtNode(AssignStmtNode node)
        {
            Visit(node.variable);
            Visit(node.expression);
            return null;
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
            symbolTable.OpenNewScope();

            Visit(node.CaseExpr);
            foreach (var stmt in node.block)
            {
                Visit(stmt);
            }

            symbolTable.CloseNewlyCreatedScope();
            return null;
        }

        public object VisitConditionBlock(ConditionBlock node)
        {
            Visit(node.condition);
            symbolTable.OpenNewScope();
            Visit(node.block);
            symbolTable.CloseNewlyCreatedScope();
            return null;
        }

        public object VisitConstantDeclNode(ConstantDeclNode node)
        {

            Visit(node.initialization);
            return null;
        }

        public object VisitContinue(Continue node)
        {
            return null;
        }

        public object VisitDIVISIONEQNode(DIVISIONEQNode node)
        {
            Visit(node.variable);
            Visit(node.expression);
            return null;
        }


        public object VisitEnumMemberNode(EnumMemberNode node)
        {
            return new Symbol(node.name, node);
        }

        public object VisitEnumNode(EnumNode node)
        {
            return null;
        }




        public object VisitForeachNode(ForeachNode node)
        {
            TempSymbols.Add(new Symbol(node.element.name, node.element));
            Visit(node.list);
            Visit(node.block);
            return null;
        }

        public object VisitFormalParameter(FormalParameter node)
        {
            return new Symbol(node.name, node);
        }

        public object VisitFunctionCallNode(FunctionCallNode node)
        {
            try
            {
                Symbol symbol = symbolTable.getSymbol(node.identifier);
                FunctionDeclNode functionDecl = (FunctionDeclNode)symbol.node;
                node.type = functionDecl.returnType;
            }
            catch (GetException e)
            {
                Console.WriteLine(e.Message);
                System.Environment.Exit(-1);
            }

            return null;
        }

        public object VisitFunctionDeclNode(FunctionDeclNode node)
        {
            foreach (FormalParameter parameter in node.formalParameters)
            {
                TempSymbols.Add((Symbol)Visit(parameter));
            }
            Visit(node.block);


            return null;
        }



        public object VisitIfNode(IfNode node)
        {
            foreach (ConditionBlock conditionBlock in node.conditionBlocks)
            {
                Visit(conditionBlock);
            }
            if (node.elseBlock != null)
                Visit(node.elseBlock);

            return null;
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

            return null;
        }


        public object VisitListDeclNode(ListDeclNode node)
        {
            symbolTable.PutSymbol(node.name, new Symbol(node.name, node));
            if (node.initialization != null)
                Visit(node.initialization);
            return null;
        }



        public object VisitMINUSEQNode(MINUSEQNode node)
        {
            Visit(node.variable);
            Visit(node.expression);
            return null;
        }

        public object VisitMULTIEQNode(MULTIEQNode node)
        {
            Visit(node.variable);
            Visit(node.expression);
            return null;
        }



        public object VisitNaNExpressionNode(NaNExpressionNode node)
        {
            return null;
        }

        public object VisitNegativeExpressionNode(NegativeExpressionNode node)
        {
            Visit(node.expr);
            return null;
        }



        public object VisitNotExpressionNode(NotExpressionNode node)
        {
            Visit(node.expr);
            return null;
        }

        public object VisitNumberLiteral(NumberLiteral node)
        {
            return null;
        }



        public object VisitPLUSEQNode(PLUSEQNode node)
        {
            Visit(node.variable);
            Visit(node.expression);
            return null;
        }



        public object VisitProgramNode(ProgramNode node)
        {
            foreach (var declaration in node.declarations)
            {
                Visit(declaration);
            }
            return null;
        }



        public object VisitReturn(Return node)
        {
            if (node.returnValue != null)
                Visit(node.returnValue);

            return null;
        }

        public object VisitStructMemberNode(StructMemberNode node)
        {
            throw new Exception();
        }

        public object VisitStructNode(StructNode node)
        {

            return null;
        }

        public object VisitSubtractionNode(SubtractionNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return null;
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



            return null;
        }

        public object VisitTernaryNode(TernaryNode node)
        {
            Visit(node.variable);
            Visit(node.condition);
            Visit(node.ifClause);
            Visit(node.elseClause);
            return null;
        }

        public object VisitTextLiteral(TextLiteral node)
        {
            return null;
        }

        public object VisitVariableDeclNode(VariableDeclNode node)
        {
            symbolTable.PutSymbol(node.name, new Symbol(node.name, node));
            if (node.initialization != null)
                Visit(node.initialization);
            return null;
        }

        public object VisitWhileNode(WhileNode node)
        {
            Visit(node.condition);
            Visit(node.block);
            return null;
        }


        public object VariableCallNode(VariableCallNode node)
        {
            try
            {
                Symbol symbol = symbolTable.getSymbol(node.identifier);

                if (symbol.node is ConstantDeclNode)
                {
                    ConstantDeclNode bindingOccurrence = (ConstantDeclNode)symbol.node;
                    node.type = bindingOccurrence.type;
                }

                else if (symbol.node is VariableDeclNode)
                {
                    VariableDeclNode bindingOccurrence = (VariableDeclNode)symbol.node;
                    node.type = bindingOccurrence.type;
                }
                else if (symbol.node is FormalParameter)
                {
                    FormalParameter bindingOccurrence = (FormalParameter)symbol.node;
                    node.type = bindingOccurrence.type;
                }
                else if (symbol.node is EnumNode)
                {
                    EnumNode bindingOccurrence = (EnumNode)symbol.node;
                    node.type = new Type(bindingOccurrence.name, false, true);
                }
                else
                {
                    ListDeclNode bindingOccurrence = (ListDeclNode)symbol.node;
                    node.type = bindingOccurrence.type;
                }
            }
            catch (GetException e)
            {
                Console.WriteLine(e.Message + " " + node.Line.line + " " + (node.Line.column + 1));
                System.Environment.Exit(-1);
            }


            return null;
        }

        public object VisitSubscriptCallNode(SubscriptCallNode node)
        {
            try
            {
                Symbol symbol = symbolTable.getSymbol(node.identifier);
                Variable variable = (Variable)symbol.node;

                if (variable.type.userDefinedType)
                    node.type = new Type(variable.type.typeName, false, true);
                else
                    node.type = new Type(variable.type.typeName, false, false);

                Visit(node.index);
            }
            catch (GetException e)
            {
                Console.WriteLine(e.Message);
                System.Environment.Exit(-1);
            }

            return null;
        }

        public object VisitSubscriptMemberNode(SubscriptMember node)
        {
            string structName = node.parent.type.typeName;
            string expectedFieldName = node.identifier;
            try
            {
                Symbol typeSymbol = symbolTable.getSymbol(structName);

                StructNode structNode = (StructNode)typeSymbol.node;

                string actualFieldName;
                foreach (StructMemberNode member in structNode.structMembers)
                {
                    actualFieldName = member.name;
                    if (actualFieldName == expectedFieldName)
                    {
                        node.type = member.type;
                        Visit(node.index);
                        return null;
                    }
                }
            }
            catch (GetException e)
            {
                Console.WriteLine("Field \"" + expectedFieldName + "\" is not a member of the struct " + structName);
                System.Environment.Exit(-1);
            }

            return null;
        }





        public object VisitDotReferencingNode(DotReferencingNode node)
        {
            Visit(node.parent);
            Visit(node.member);
            return null;
        }


        public object VisitFieldNode(Field node)
        {
            string structName = node.parent.type.typeName;
            string expectedFieldName = node.identifier;
            try
            {
                Symbol typeSymbol = symbolTable.getSymbol(structName);
                if (typeSymbol.node is EnumNode)
                {
                    EnumNode enumNode = (EnumNode)typeSymbol.node;


                    string actualFieldName;
                    foreach (EnumMemberNode member in enumNode.EnumMembers)
                    {
                        actualFieldName = member.name;
                        if (actualFieldName == expectedFieldName)
                        {
                            node.type = new Type("number", false, false);
                            return null;
                        }
                    }
                }
                else
                {
                    StructNode structNode = (StructNode)typeSymbol.node;


                    string actualFieldName;
                    foreach (StructMemberNode member in structNode.structMembers)
                    {
                        actualFieldName = member.name;
                        if (actualFieldName == expectedFieldName)
                        {
                            node.type = member.type;
                            return null;
                        }
                    }
                }
            }
            catch (GetException e)
            {
                Console.WriteLine("Field \"" + expectedFieldName + "\" is not a member of the struct " + structName);
                System.Environment.Exit(-1);
            }

            return null;
        }

        public object VisitMethodNode(Method node)
        {
            Type type = node.parent.type;
            string typeName = type.listType ? "list" : type.typeName;
            TypeSymbol typeSymbol = (TypeSymbol)symbolTable.getSymbol(typeName);

            if (typeSymbol.methods.ContainsKey(node.identifier))
            {
                node.type = typeSymbol.methods[node.identifier].returnType;
                foreach (ExpressionNode parameter in node.actualParameters)
                    Visit(parameter);
            }
            else
            {
                Console.WriteLine("Method \"" + node.identifier + "\" is not a method of the type " + typeName);
                System.Environment.Exit(-1);
            }
            return null;
        }


    }
}
