using System.Collections.Generic;

namespace Simpleton.AST
{
    public abstract class ExpressionNode : StmtNode
    {
        public virtual Type type { get; set; }

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



    public abstract class CallNode : ExpressionNode, ASTNode
    {

    }

    public class VariableCallNode : CallNode
    {
        public VariableCallNode(string identifier)
        {
            this.identifier = identifier;
        }

        public string identifier { get; set; }

        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VariableCallNode(this);
        }
    }

    public class SubscriptCallNode : VariableCallNode
    {
        public SubscriptCallNode(string identifier, ExpressionNode index) : base(identifier)
        {
            this.index = index;
        }
        public ExpressionNode index { get; set; }
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitSubscriptCallNode(this);
        }
    }

    public class FunctionCallNode : VariableCallNode
    {
        public FunctionCallNode(string identifier, List<ExpressionNode> actualParameters) : base(identifier)
        {
            this.actualParameters = actualParameters;
        }
        public List<ExpressionNode> actualParameters { get; set; } = new List<ExpressionNode>();
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitFunctionCallNode(this);
        }

        public FunctionDeclNode declNode { get; set; }
    }

    public class DotReferencingNode : CallNode
    {
        public override Type type
        {
            get => member.type;
            set => member.type = value;
        }
        public CallNode parent { get; set; }
        public Member member { get; set; }
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitDotReferencingNode(this);
        }
    }


    public abstract class Member : ASTNode
    {
        public Member(string identifier, CallNode parent)
        {
            this.identifier = identifier;
            this.parent = parent;
        }
        public CallNode parent { get; }
        public Type type { get; set; }
        public LineInfo Line { get; set; }
        public string identifier { get; set; }
        public abstract T Accept<T>(ASTVisitor<T> v);
    }

    public class Field : Member
    {
        public Field(string identifier, CallNode parent) : base(identifier, parent)
        {

        }
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitFieldNode(this);
        }
    }

    public class SubscriptMember : Member
    {
        public SubscriptMember(string identifier, ExpressionNode index, CallNode parent) : base(identifier, parent)
        {
            this.index = index;
        }
        public ExpressionNode index { get; set; }
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitSubscriptMemberNode(this);
        }
    }


    public class Method : Member
    {
        public Method(string identifier, List<ExpressionNode> actualParameters, CallNode parent) : base(identifier, parent)
        {
            this.actualParameters = actualParameters;
        }
        public List<ExpressionNode> actualParameters { get; set; } = new List<ExpressionNode>();
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitMethodNode(this);
        }
    }

}





//using System.Collections.Generic;

//namespace Simpleton.AST
//{
//    public abstract class ExpressionNode : StmtNode
//    {
//        public Type type;

//        public abstract T Accept<T>(ASTVisitor<T> v);
//        public LineInfo Line { get; set; }

//    }

//    public abstract class InfixExpressionNode : ExpressionNode
//    {
//        public ExpressionNode Left { get; set; }
//        public ExpressionNode Right { get; set; }
//    }

//    public class AdditionNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitAdditionNode(this);
//        }
//    }

//    public class SubtractionNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitSubtractionNode(this);
//        }
//    }

//    public class MultiplicationNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitMultiplicationNode(this);
//        }
//    }

//    public class DivisionNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitDivisionNode(this);
//        }
//    }

//    public class ModNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitModNode(this);
//        }
//    }

//    public class PowNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitPowNode(this);
//        }
//    }

//    public class EQEQNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitEQEQNode(this);
//        }
//    }

//    public class NOTEQNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitNOTEQNode(this);
//        }
//    }

//    public class LessEQNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitLessEQNode(this);
//        }
//    }

//    public class GreaterEQNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitGreaterEQNode(this);
//        }
//    }

//    public class GreaterNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitGreaterNode(this);
//        }
//    }
//    public class LessNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitLessNode(this);
//        }
//    }

//    public class ANDNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitANDNode(this);
//        }
//    }

//    public class ORNode : InfixExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitORNode(this);
//        }
//    }

//    public abstract class UnaryExpressionNode : ExpressionNode
//    {
//        public ExpressionNode expr { get; set; }
//    }

//    public class NotExpressionNode : UnaryExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitNotExpressionNode(this);
//        }
//    }

//    public class NegativeExpressionNode : UnaryExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitNegativeExpressionNode(this);
//        }
//    }

//    public class NaNExpressionNode : ExpressionNode
//    {
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitNaNExpressionNode(this);
//        }
//    }





//    //public class Member : ASTNode
//    //{
//    //    public Member(string identifier, ASTNode club)
//    //    {
//    //        this.identifier = identifier;
//    //        this.club = club;
//    //    }

//    //    public string identifier { get; set; }

//    //    public List<ExpressionNode> actualParameters { get; set; } = new List<ExpressionNode>();

//    //    public ASTNode club { get; set; }

//    //    public T Accept<T>(ASTVisitor<T> v)
//    //    {
//    //        return v.VisitMember(this);
//    //    }
//    //    public LineInfo Line { get; set; }
//    //}



//    public class ListIndexerNode : ExpressionNode
//    {
//        public string identifier { get; set; }
//        public ExpressionNode index { get; set; }
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitListIndexerNode(this);
//        }
//    }

//    public class FunctionCallNode : ExpressionNode
//    {
//        public string identifier { get; set; }
//        public List<ExpressionNode> actualParameters { get; set; } = new List<ExpressionNode>();
//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitFunctionCallNode(this);
//        }
//    }


//    public class IdentifierCall : ExpressionNode
//    {
//        List<Member> ListOperations { get; set; } = new List<Member>();

//        public override T Accept<T>(ASTVisitor<T> v)
//        {
//            return v.VisitIdentifierCall(this);
//        }
//    }

//    public class Member : ASTNode
//    {
//        public string identifier { }





//        public LineInfo Line { get => throw new System.NotImplementedException(); set => throw new System.NotImplementedException(); }

//        public T Accept<T>(ASTVisitor<T> v)
//        {
//            throw new System.NotImplementedException();
//        }
//    }

//    //public class IdentifierCall : ExpressionNode
//    //{
//    //    public ExpressionNode Lidentifier { get; set; }
//    //    public ExpressionNode Ridentifier { get; set; }

//    //    public override T Accept<T>(ASTVisitor<T> v)
//    //    {
//    //        return v.VisitIdentifierCall(this);
//    //    }
//    //}

//}


