namespace Simpleton.AST
{


    //public class Identifier : ASTNode
    //{
    //    public Identifier(string spelling)
    //    {
    //        this.spelling = spelling;
    //    }
    //    public string spelling { get; set; }

    //    public T Accept<T>(ASTVisitor<T> v)
    //    {
    //        return v.VisitIdentifier(this);
    //    }
    //}

    public abstract class ConstantNode : ExpressionNode, ASTNode
    {
        public ConstantNode(string value)
        {
            this.value = value;
        }
        public string value { get; set; }
    }


    public class NumberLiteral : ConstantNode
    {
        public NumberLiteral(string value) : base(value)
        {
        }

        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitNumberLiteral(this);
        }
    }

    public class TextLiteral : ConstantNode
    {
        public TextLiteral(string value) : base(value)
        {
        }
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitTextLiteral(this);
        }
    }

    public class BooleanLiteral : ConstantNode
    {
        public BooleanLiteral(string value) : base(value)
        {
        }
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitBooleanLiteral(this);
        }
    }

    public class Type
    {
        public Type(string type, bool listType, bool userDefinedType)
        {
            this.typeName = type;
            this.listType = listType;
            this.userDefinedType = userDefinedType;
        }

        public static Type NumberType() => new Type("number", false, false);
        public static Type BooleanType() => new Type("boolean", false, false);
        public static Type TextType() => new Type("text", false, false);
        public static Type VoidType() => new Type("void", false, false);
        public static Type ListType(string type) => new Type(type, true, false);
        public static Type UserDefinedType(string type) => new Type(type, false, true);
        public static Type ListWithUserDefinedType(string type) => new Type(type, true, true);
        public static Type WellTyped() => new Type("well-typed", false, false);
        public static Type NaNTyped() => new Type("NaN", false, false);

        public string typeName { get; set; }
        public bool listType { get; set; }
        public bool userDefinedType { get; set; }


        public override bool Equals(object obj)
        {
            Type objType = obj as Type;

            if (objType == null)
            {
                return false;
            }

            if (typeName == objType.typeName &&
                listType == objType.listType &&
                userDefinedType == objType.userDefinedType)
                return true;
            else
                return false;
        }


        public override string ToString()
        {
            if (listType)
            {
                return "list<" + typeName + ">";
            }
            else
                return typeName;
        }
    }




}