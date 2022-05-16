using System.Collections.Generic;

namespace Simpleton.AST
{
    public interface Declaration : ASTNode
    {


    }

    public class FunctionDeclNode : Declaration
    {
        public FunctionDeclNode()
        {

        }
        public FunctionDeclNode(Type returnType, string name, List<FormalParameter> formalParameters)
        {
            this.returnType = returnType;
            this.name = name;
            this.formalParameters = formalParameters;
        }

        public Type returnType { get; set; }
        public string name { get; set; }
        public List<FormalParameter> formalParameters { get; set; } = new List<FormalParameter>();
        public Block block { get; set; }
        public LineInfo Line { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitFunctionDeclNode(this);
        }
    }

    public class FormalParameter : Variable, ASTNode
    {
        public FormalParameter()
        {

        }

        public FormalParameter(Type type, string name)
        {
            this.type = type;
            this.name = name;
        }

        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitFormalParameter(this);
        }
    }

    public class StructNode : Declaration
    {
        public string name { get; set; }
        public List<StructMemberNode> structMembers { get; set; } = new List<StructMemberNode>();

        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitStructNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class StructMemberNode : ASTNode
    {
        public Type type { get; set; }
        public string name { get; set; }
        public StructNode club { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitStructMemberNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class EnumNode : Declaration
    {
        public string name { get; set; }
        public List<EnumMemberNode> EnumMembers { get; set; } = new List<EnumMemberNode>();

        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitEnumNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class EnumMemberNode : ASTNode
    {
        public string name { get; set; }
        public NumberLiteral value { get; set; }

        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitEnumMemberNode(this);
        }
        public LineInfo Line { get; set; }

    }

}

