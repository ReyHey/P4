using System.Linq;
using Simpleton.AST;

namespace Simpleton
{
    class CodeGenerationVisitor : ASTVisitor<string>
    {
        int indent = 1;

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
            string s = PrintIndent + "public static ";
            s += ConvertToCSType(node.returnType) + " " + (node.name == "Main" ? "Main" : "___" + node.name) + "(";

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
            return ConvertToCSType(node.type) + " " + "___" +  node.name;
        }

        public string VisitStructNode(StructNode node)
        {
            string s = "public struct " + "___" +  node.name + "{\n";
            indent++;
            s += $"public ___{node.name}() {{}}\n";
            s += $"public ___{node.name}(___{node.name} old)\n";
            s += "{\n";
            foreach (var member in node.structMembers)
            {
                if (member.type.listType)
                {
                    s += $"{PrintIndent}___{member.name} = old.___{member.name}.ToList();\n";
                }
                else
                {
                    s += $"{PrintIndent}___{member.name} = old.___{member.name};\n";
                }
            }
            s += "}\n";
            foreach (var member in node.structMembers)
            {
                s += PrintIndent + Visit(member) + "\n";
            }
            indent--;
            return s + "}\n";
        }
        public string VisitStructMemberNode(StructMemberNode node)
        {
            string t = ConvertToCSType(node.type);
            if (t == "decimal?")
            {
                return $"public {t} ___{node.name} = 0M;";
            }
            else if (t == "string")
            {
                return $"public {t} ___{node.name} = \"\";";
            }
            else if (t == "bool")
            {
                return $"public {t} ___{node.name} = false;";
            }
            else
            {
                return $"public {t} ___{node.name} = new {t}();";
            }
        }

        public string VisitEnumNode(EnumNode node)
        {
            string s = "public enum " + "___" + node.name + "{\n";
            indent++;

            for (int i = 0; i < node.EnumMembers.Count; i++)
            {
                s += PrintIndent + Visit(node.EnumMembers[i]);

                if (i < node.EnumMembers.Count - 1)
                    s += ",";

                s += "\n";
            }
            indent--;
            return s + "}\n";
        }

        public string VisitEnumMemberNode(EnumMemberNode node)
        {
            if (node.value != null)
                return "___" + node.name + "=" + Visit(node.value);
            else
                return "___" + node.name;
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
            return "___Pow(" + Visit(node.Left) + ", " + Visit(node.Right) + ")";
        }
        public string VisitModNode(ModNode node)
        {
            return Visit(node.Left) + " % " + Visit(node.Right);
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
            return Visit(node.Left) + " && " + Visit(node.Right);
        }
        public string VisitORNode(ORNode node)
        {
            return Visit(node.Left) + " || " + Visit(node.Right);
        }
        public string VisitNotExpressionNode(NotExpressionNode node)
        {
            return "!" + Visit(node.expr);
        }
        public string VisitNegativeExpressionNode(NegativeExpressionNode node)
        {
            return $"(-{Visit(node.expr)})";
        }
        public string VisitNaNExpressionNode(NaNExpressionNode node)
        {
            return "null";
        }
        public string VisitFunctionCallNode(FunctionCallNode node)
        {
            string s = $"___{node.identifier}(";
            if (node.actualParameters != null)
                for (int i = 0; i < node.actualParameters.Count; i++)
                {
                    if (node.actualParameters[i].type.listType)
                    {
                        s += $"new List<{GetCSPrimType(node.actualParameters[i].type.typeName)}>({Visit(node.actualParameters[i])})";
                    }
                    else if (node.actualParameters[i].type.structType)
                    {
                        s += $"new ___{node.actualParameters[i].type.typeName}({Visit(node.actualParameters[i])})";
                    }
                    else
                    {
                        s += Visit(node.actualParameters[i]);
                    }

                    if (i < node.actualParameters.Count - 1)
                    {
                        s += ", ";
                    }
                }
            s += ")";
            return s;
        }


        public string VisitAssignStmtNode(AssignStmtNode node)
        {
            return Visit(node.variable) + " = " + Visit(node.expression);
        }
        public string VisitIfNode(IfNode node)
        {
            string s = "";

            for (int i = 0; i < node.conditionBlocks.Count; i++)
            {
                if (i == 0)
                    s += "if (" + Visit(node.conditionBlocks[i].condition) + ")" + Visit(node.conditionBlocks[i].block);
                else
                    s += PrintIndent + "else if (" + Visit(node.conditionBlocks[i].condition) + ")" + Visit(node.conditionBlocks[i].block);
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
                s += PrintIndent + Visit(stmt) + ";" + "\n";
            }
            indent--;



            return "\n" + PrintIndent + "{\n" + s + PrintIndent + "}\n";
        }


        public string VisitSwitchNode(SwitchNode node)
        {
            string s = $"switch ({Visit(node.condition)}) {{\n";
            indent++;
            foreach (Case switchcase in node.cases)
            {
                s += PrintIndent + $"{VisitCase(switchcase)}\n";
            }
            s += PrintIndent + "default: \n";
            indent++;
            foreach (StmtNode stmt in node.defaultCase)
            {
                s += PrintIndent + Visit(stmt) + ";" + "\n";
            }
            s += PrintIndent + "break;\n";
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
                s += PrintIndent + Visit(stmt) + ";" + "\n";
            }
            indent--;
            return s + PrintIndent + "break;";

        }
        public string VisitForeachNode(ForeachNode node)
        {
            return PrintIndent + $"foreach ({Visit(node.element)} in {Visit(node.list)}) {Visit(node.block)}";
        }
        public string VisitWhileNode(WhileNode node)
        {
            return $"while ({Visit(node.condition)}) {Visit(node.block)}";
        }
        public string VisitVariableDeclNode(VariableDeclNode node)
        {
            string constant = node.constant ? "const" : "";
            string t = ConvertToCSType(node.type);
            if (t == "decimal?" && node.constant)
            {
                return $"const {t.Substring(0, t.Length - 1)} {"___" + node.name} = {Visit(node.initialization)};";
            }
            else if (node.constant)
            {
                return $"const {t} {node.name} = {Visit(node.initialization)};";
            }
            else if (t == "decimal?" && node.shouldBeInit)
            {
                return $"{t} {"___" + node.name} = {(node.initialization != null ? Visit(node.initialization) : "0M")}";
            }
            else if (t == "string")
            {
                return $"{t} {"___" + node.name} {(node.initialization != null ? " = " + Visit(node.initialization) : "= \"\"")}";
            }
            else if (t == "bool")
            {
                return $"{t} {"___" + node.name} {(node.initialization != null ? " = " + Visit(node.initialization) : "")}";
            }
            else if (node.type.enumType)
            {
                return $"{t} {"___" + node.name}";
            }
            else if (node.type.structType)
            {
                return $"{t} {"___" + node.name} = new {t}()";
            }
            else
            {
                return $"{t} {"___" + node.name} {(node.initialization != null ? "=" + Visit(node.initialization) : "")}";
            }
        }
        public string VisitListDeclNode(ListDeclNode node)
        {
            string t = $"{ConvertToCSType(node.type)} {"___" + node.name} = ";
            if (node.initialization != null)
            {
                if (node.initialization.initialization != null)
                {
                    t += $"{Visit(node.initialization)}";
                }
                else
                {
                    t += $"new {ConvertToCSType(node.type)}() {Visit(node.initialization)}";
                }
            }
            else
            {
                t += $"new {ConvertToCSType(node.type)}()";
            }

            return t;
        }
        public string VisitInitialization(Initialization node)
        {
            if (node.initialization != null)
            {
                return Visit(node.initialization);
            }
            if (node.elements.Count == 0)
            {
                return "";
            }
            string s = " {";
            int i = 0;
            foreach (ExpressionNode exprNode in node.elements)
            {
                i++;
                s += Visit(exprNode);
                if (i != node.elements.Count)
                    s += ", ";
            }
            return s + "}";
        }
        public string VisitBreak(Break node)
        {
            return "Break\n";
        }
        public string VisitContinue(Continue node)
        {
            return "Continue;\n";
        }
        public string VisitReturn(Return node)
        {
            return $"return {Visit(node.returnValue)};\n";
        }
        public string VisitPLUSEQNode(PLUSEQNode node)
        {
            return $"{Visit(node.variable)} += {Visit(node.expression)}";
        }
        public string VisitMINUSEQNode(MINUSEQNode node)
        {
            return $"{Visit(node.variable)} -= {Visit(node.expression)}";
        }
        public string VisitMULTIEQNode(MULTIEQNode node)
        {
            return $"{Visit(node.variable)} *= {Visit(node.expression)}";
        }
        public string VisitDIVISIONEQNode(DIVISIONEQNode node)
        {
            return $"{Visit(node.variable)} /= {Visit(node.expression)}";
        }
        public string VisitTernaryNode(TernaryNode node)
        {
            return Visit(node.variable) + "=" + Visit(node.condition) + "?" + Visit(node.ifClause) + ":" +
                   Visit(node.elseClause) + ";";
        }
        public string VisitNumberLiteral(NumberLiteral node)
        {
            return node.value + "M";
        }
        public string VisitTextLiteral(TextLiteral node)
        {
            return node.value;
        }
        public string VisitBooleanLiteral(BooleanLiteral node)
        {
            return node.value;
        }

        public string VisitVariableCallNode(VariableCallNode node)
        {
            return "___" + node.identifier;
        }

        public string VisitSubscriptCallNode(SubscriptCallNode node)
        {
            return "___" + node.identifier + "[" + "(int)" + Visit(node.index) + "]";
        }

        public string VisitDotReferencingNode(DotReferencingNode node)
        {
            return Visit(node.parent) + "." + "___" + Visit(node.member);
        }

        public string VisitFieldNode(Field node)
        {
            return node.identifier;
        }

        public string VisitMethodNode(Method node)
        {
            string s = "";
            if (node.identifier == "Split")
            {
                s = "SplitCustom(";
            }
            else if (node.identifier == "Replace")
            {
                s = "ReplaceCustom(";
            }
            else
            {
                s = $"{node.identifier}(";
            }
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

        public string VisitSubscriptMemberNode(SubscriptMember node)
        {
            return node.identifier + "[" + "(int)" + Visit(node.index) + "]";
        }

        public string ConvertToCSType(Type type)
        {
            string t = "";

            if (type.listType)
            {
                t = "List<";
                if (type.userDefinedType)
                {
                    t += "___" + type.typeName + ">";
                }
                else
                {
                    t += GetCSPrimType(type.typeName) + ">";
                }
            }
            else if (type.userDefinedType)
            {
                t = "___" + type.typeName;
            }
            else
            {
                t = GetCSPrimType(type.typeName);
            }

            return t;
        }

        public string GetCSPrimType(string type)
        {
            string t = "";

            switch (type)
            {
                case "number":
                    t = "decimal?";
                    break;
                case "text":
                    t = "string";
                    break;
                case "boolean":
                    t = "bool";
                    break;
                case "void":
                    t = "void";
                    break;
            }

            return t;
        }
    }



}
