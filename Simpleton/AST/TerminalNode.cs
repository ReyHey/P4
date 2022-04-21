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

        public string typeName { get; set; }
        public bool listType { get; set; }
        public bool userDefinedType { get; set; }

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