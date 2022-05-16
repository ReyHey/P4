namespace Simpleton.AST
{
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




}