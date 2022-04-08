using System.Collections.Generic;

namespace Simpleton.AST
{
    public class ProgramNode : ASTNode
    {
        public List<Declaration> declarations { get; set; } = new List<Declaration>();

        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitProgramNode(this);
        }
        public LineInfo Line { get; set; }
    }


}

