using System.Collections.Generic;

namespace Simpleton.AST
{
    public abstract class ExpressionNode : StmtNode
    {
        public Type type;

        public abstract T Accept<T>(ASTVisitor<T> v);
        public LineInfo Line { get; set; }

    }

    public abstract class InfixExpressionNode : ExpressionNode
    {
        public ExpressionNode Left { get; set; }
        public ExpressionNode Right { get; set; }
    }

    public class AdditionNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitAdditionNode(this);
        }
    }

    public class SubtractionNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitSubtractionNode(this);
        }
    }

    public class MultiplicationNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitMultiplicationNode(this);
        }
    }

    public class DivisionNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitDivisionNode(this);
        }
    }

    public class ModNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitModNode(this);
        }
    }

    public class PowNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitPowNode(this);
        }
    }

    public class EQEQNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitEQEQNode(this);
        }
    }

    public class NOTEQNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitNOTEQNode(this);
        }
    }

    public class LessEQNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitLessEQNode(this);
        }
    }

    public class GreaterEQNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitGreaterEQNode(this);
        }
    }

    public class GreaterNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitGreaterNode(this);
        }
    }
    public class LessNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitLessNode(this);
        }
    }

    public class ANDNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitANDNode(this);
        }
    }

    public class ORNode : InfixExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitORNode(this);
        }
    }

    public abstract class UnaryExpressionNode : ExpressionNode
    {
        public ExpressionNode expr { get; set; }
    }

    public class NotExpressionNode : UnaryExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitNotExpressionNode(this);
        }
    }

    public class NegativeExpressionNode : UnaryExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitNegativeExpressionNode(this);
        }
    }

    public class NaNExpressionNode : ExpressionNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitNaNExpressionNode(this);
        }
    }


    public class FunctionCallNode : ExpressionNode
    {
        public string identifier { get; set; }
        public List<ExpressionNode> actualParameters { get; set; } = new List<ExpressionNode>();
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitFunctionCallNode(this);
        }
    }


    public class Member : ASTNode
    {
        public Member(string identifier)
        {
            this.identifier = identifier;
        }

        public Member(FunctionCallNode functionCall)
        {
            this.functionCall = functionCall;
        }
        public string identifier { get; set; }
        public FunctionCallNode functionCall { get; set; }

        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitMember(this);
        }
        public LineInfo Line { get; set; }

    }


    public class IdentifierCall : ExpressionNode
    {
        public string identifier { get; set; }
        public ExpressionNode index { get; set; }
        public List<Member> members { get; set; } = new List<Member>();
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitIdentifierCall(this);
        }
    }

}

