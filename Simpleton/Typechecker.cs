using System;
using System.Linq.Expressions;
using Simpleton.AST;
using Type = Simpleton.AST.Type;

namespace Simpleton
{

    public class InvalidTypeException : Exception
    {
        public InvalidTypeException() : base()
        {
        }
        public InvalidTypeException(string message) : base(message)
        {

        }
    }

    public class Typechecker : ASTVisitor<Type>
    {
        public Type VariableCallNode(VariableCallNode node)
        {
            return node.type;
        }

        public Type Visit(ASTNode node)
        {
            return node.Accept(this);
        }

        public Type VisitAdditionNode(AdditionNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.TextType()) || Lnode.Equals(Type.NumberType()))
                {
                    node.type = Lnode;
                    return Lnode;
                }

                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();

        }

        public Type VisitANDNode(ANDNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.BooleanType()))
                {
                    node.type = Lnode;
                    return Lnode;
                }
                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitAssignStmtNode(AssignStmtNode node)
        {
            Type assignment = Visit(node.expression);
            Type variable = Visit(node.variable);

            if (assignment.Equals(variable))
                return Type.WellTyped();
            else
                throw new InvalidTypeException();

        }

        public Type VisitBlock(Block node)
        {
            foreach (StmtNode stmt in node.statements)
            {
                Visit(stmt);
            }
            return Type.WellTyped();
        }

        public Type VisitBooleanLiteral(BooleanLiteral node)
        {
            node.type = Type.BooleanType();
            return node.type;
        }

        public Type VisitBreak(Break node)
        {
            return Type.WellTyped();
        }

        public Type VisitCase(Case node)
        {
            foreach (var stmt in node.block)
            {
                Visit(stmt);
            }
            Type caseExpr = Visit(node.CaseExpr);
            if (caseExpr.Equals(Type.NumberType()) || caseExpr.Equals(Type.TextType()))
                return caseExpr;
            else
                throw new InvalidTypeException();
        }

        public Type VisitConditionBlock(ConditionBlock node)
        {

            if (Visit(node.condition).Equals(Type.BooleanType()) &&
                Visit(node.block).Equals(Type.WellTyped()))
                return Type.WellTyped();
            else
                throw new InvalidTypeException();
        }

        public Type VisitContinue(Continue node)
        {
            return Type.WellTyped();
        }

        public Type VisitDIVISIONEQNode(DIVISIONEQNode node)
        {
            Type assignment = Visit(node.expression);
            Type variable = Visit(node.variable);

            if (assignment.Equals(variable))
                return Type.WellTyped();
            else
                throw new InvalidTypeException();
        }

        public Type VisitDivisionNode(DivisionNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.NumberType()))
                {
                    node.type = Lnode;
                    return Lnode;
                }
                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitDotReferencingNode(DotReferencingNode node)
        {
            Visit(node.parent);
            node.type = Visit(node.member);
            return node.type;
        }

        public Type VisitEnumMemberNode(EnumMemberNode node)
        {
            if (node.value != null)
            {
                if (Visit(node.value).Equals(Type.NumberType()))
                    return Type.NumberType();
                else
                    throw new InvalidTypeException();
            }
            return Type.NumberType();
        }

        public Type VisitEnumNode(EnumNode node)
        {
            foreach (EnumMemberNode member in node.EnumMembers)
            {
                Visit(member);
            }
            return null;
        }

        public Type VisitEQEQNode(EQEQNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode) || Lnode.Equals(Type.NaNTyped()) || Rnode.Equals(Type.NaNTyped()))
            {
                if (Lnode.Equals(Type.NumberType()) || Lnode.Equals(Type.TextType()) || Lnode.Equals(Type.BooleanType()))
                {
                    node.type = Type.BooleanType();
                    return node.type;
                }

                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitFieldNode(Field node)
        {
            return node.type;
        }

        public Type VisitForeachNode(ForeachNode node)
        {
            Type element = node.element.type;

            Type list = Visit(node.list);

            if (element.typeName.Equals(list.typeName) && Visit(node.block).Equals(Type.WellTyped()))
            {
                return Type.WellTyped();
            }
            else
                throw new InvalidTypeException();


        }

        public Type VisitFormalParameter(FormalParameter node)
        {
            return null;
        }

        public Type VisitFunctionCallNode(FunctionCallNode node)
        {
            foreach (var parameter in node.actualParameters)
            {
                Visit(parameter);
            }
            return node.type;
        }

        public Type VisitFunctionDeclNode(FunctionDeclNode node)
        {
            Visit(node.block);
            return Type.WellTyped();
        }

        public Type VisitGreaterEQNode(GreaterEQNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.NumberType()))
                {
                    node.type = Type.BooleanType();
                    return node.type;
                }

                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitGreaterNode(GreaterNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.NumberType()))
                {
                    node.type = Type.BooleanType();
                    return node.type;
                }

                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitIfNode(IfNode node)
        {
            foreach (ConditionBlock conditionBlock in node.conditionBlocks)
            {
                Visit(conditionBlock);
            }
            if (node.elseBlock != null)
                Visit(node.elseBlock);

            return Type.WellTyped();
        }

        public Type VisitInitialization(Initialization node)
        {
            if (node.initialization != null)
            {
                return Visit(node.initialization);
            }
            else
            {
                Type type = Visit(node.elements[0]);
                for (int i = 1; i < node.elements.Count; i++)
                {
                    if (!type.Equals(Visit(node.elements[i])))
                        throw new InvalidTypeException();
                }
                if (type.userDefinedType)
                    return Type.ListWithUserDefinedType(type.typeName);
                else
                    return Type.ListType(type.typeName);
            }
        }

        public Type VisitLessEQNode(LessEQNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.NumberType()))
                {
                    node.type = Type.BooleanType();
                    return node.type;
                }

                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitLessNode(LessNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.NumberType()))
                {
                    node.type = Type.BooleanType();
                    return node.type;
                }
                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitListDeclNode(ListDeclNode node)
        {
            Type declaredType = node.type;
            if (node.initialization != null)
            {
                Type initializationType = Visit(node.initialization);
                if (!initializationType.Equals(declaredType))
                    throw new InvalidTypeException();
            }

            return null;
        }

        public Type VisitMethodNode(Method node)
        {
            foreach (var parameter in node.actualParameters)
            {
                Visit(parameter);
            }
            return node.type;
        }

        public Type VisitMINUSEQNode(MINUSEQNode node)
        {
            Type assignment = Visit(node.expression);
            Type variable = Visit(node.variable);

            if (assignment.Equals(variable))
                return Type.WellTyped();
            else
                throw new InvalidTypeException();
        }

        public Type VisitModNode(ModNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.NumberType()))
                {
                    node.type = Lnode;
                    return Lnode;
                }
                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitMULTIEQNode(MULTIEQNode node)
        {
            Type assignment = Visit(node.expression);
            Type variable = Visit(node.variable);

            if (assignment.Equals(variable))
                return Type.WellTyped();
            else
                throw new InvalidTypeException();
        }

        public Type VisitMultiplicationNode(MultiplicationNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.NumberType()))
                {
                    node.type = Lnode;
                    return Lnode;
                }
                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitNaNExpressionNode(NaNExpressionNode node)
        {
            node.type = Type.NaNTyped();
            return node.type;
        }

        public Type VisitNegativeExpressionNode(NegativeExpressionNode node)
        {
            Type exprType = Visit(node.expr);

            if (exprType.Equals(Type.NumberType()))
            {
                node.type = exprType;
                return exprType;
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitNOTEQNode(NOTEQNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode) || Lnode.Equals(Type.NaNTyped()) || Rnode.Equals(Type.NaNTyped()))
            {
                if (Lnode.Equals(Type.NumberType()) || Lnode.Equals(Type.TextType()) || Lnode.Equals(Type.BooleanType()))
                {
                    node.type = Type.BooleanType();
                    return node.type;
                }

                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitNotExpressionNode(NotExpressionNode node)
        {
            Type exprType = Visit(node.expr);

            if (exprType.Equals(Type.BooleanType()))
            {
                node.type = exprType;
                return exprType;
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitNumberLiteral(NumberLiteral node)
        {
            node.type = Type.NumberType();
            return node.type;
        }

        public Type VisitORNode(ORNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.BooleanType()))
                {
                    node.type = Lnode;
                    return Lnode;
                }
                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitPLUSEQNode(PLUSEQNode node)
        {
            Type assignment = Visit(node.expression);
            Type variable = Visit(node.variable);

            if (assignment.Equals(variable))
                return Type.WellTyped();
            else
                throw new InvalidTypeException();
        }

        public Type VisitPowNode(PowNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.NumberType()))
                {
                    node.type = Lnode;
                    return Lnode;
                }
                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitProgramNode(ProgramNode node)
        {
            foreach (Declaration declaration in node.declarations)
            {
                Visit(declaration);
            }
            return null;
        }

        public Type VisitReturn(Return node)
        {
            if (node.returnValue != null)
            {
                Type returnValueType = Visit(node.returnValue);
                if (returnValueType.Equals(node.functionDecl.returnType))
                    return null;
            }
            else
            {
                if (Type.VoidType().Equals(node.functionDecl.returnType))
                    return null;
            }

            throw new InvalidTypeException();
        }

        public Type VisitStructMemberNode(StructMemberNode node)
        {
            return null;
        }

        public Type VisitStructNode(StructNode node)
        {
            return null;
        }

        public Type VisitSubscriptCallNode(SubscriptCallNode node)
        {
            if (Visit(node.index).Equals(Type.NumberType()))
                return node.type;
            throw new InvalidTypeException();
        }

        public Type VisitSubscriptMemberNode(SubscriptMember node)
        {
            if (Visit(node.index).Equals(Type.NumberType()))
                return node.type;
            throw new InvalidTypeException();
        }

        public Type VisitSubtractionNode(SubtractionNode node)
        {
            Type Lnode = Visit(node.Left);
            Type Rnode = Visit(node.Right);

            if (Lnode.Equals(Rnode))
            {
                if (Lnode.Equals(Type.NumberType()))
                {
                    node.type = Lnode;
                    return Lnode;
                }
                else
                    throw new InvalidTypeException();
            }
            else
                throw new InvalidTypeException();
        }

        public Type VisitSwitchNode(SwitchNode node)
        {
            Type conditionType = Visit(node.condition);

            foreach (Case switchCase in node.cases)
            {
                if (!Visit(switchCase).Equals(conditionType))
                    throw new InvalidTypeException();
            }

            foreach (StmtNode stmt in node.defaultCase)
            {
                Visit(stmt);
            }
            return null;
        }

        public Type VisitTernaryNode(TernaryNode node)
        {
            Type variableType = Visit(node.variable);

            if (!Visit(node.condition).Equals(Type.BooleanType()))
                throw new InvalidTypeException();

            if (!Visit(node.ifClause).Equals(variableType))
                throw new InvalidTypeException();

            if (!Visit(node.elseClause).Equals(variableType))
                throw new InvalidTypeException();

            return null;
        }

        public Type VisitTextLiteral(TextLiteral node)
        {
            node.type = Type.TextType();
            return node.type;
        }

        public Type VisitVariableDeclNode(VariableDeclNode node)
        {
            if (node.initialization != null)
            {
                if (Visit(node.initialization).Equals(node.type))
                    return null;
                else
                    throw new InvalidTypeException();
            }
            return null;
        }

        public Type VisitWhileNode(WhileNode node)
        {
            Type condtion = Visit(node.condition);
            Type block = Visit(node.block);

            if (condtion.Equals(Type.BooleanType()) && block.Equals(Type.WellTyped()))
                return Type.WellTyped();
            else
                throw new InvalidTypeException();
        }
    }
}