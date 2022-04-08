﻿using System.Collections.Generic;
using System.Linq.Expressions;

namespace Simpleton.AST
{
    public interface StmtNode : ASTNode
    {

    }

    public class AssignStmtNode : StmtNode
    {
        public IdentifierCall identifier { get; set; }
        public ExpressionNode expression { get; set; }

        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitAssignStmtNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class IfNode : StmtNode
    {
        public List<ConditionBlock> conditionBlocks { get; set; } = new List<ConditionBlock>();
        public Block elseBlock { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitIfNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class ConditionBlock : ASTNode
    {
        public ConditionBlock(ExpressionNode condition, Block block)
        {
            this.condition = condition;
            this.block = block;
        }

        public ExpressionNode condition { get; set; }
        public Block block { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitConditionBlock(this);
        }
        public LineInfo Line { get; set; }

    }

    public class Block : ASTNode
    {
        public List<StmtNode> statements { get; set; } = new List<StmtNode>();
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitBlock(this);
        }
        public LineInfo Line { get; set; }

    }

    public class SwitchNode : StmtNode
    {
        public ExpressionNode condition { get; set; }
        public List<Case> cases { get; set; } = new List<Case>();
        public Block defaultCase { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitSwitchNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class Case : ASTNode
    {
        public ExpressionNode CaseExpr { get; set; }
        public Block block { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitCase(this);
        }
        public LineInfo Line { get; set; }

    }

    public class ForeachNode : StmtNode
    {
        public string element { get; set; }
        public IdentifierCall list { get; set; }
        public Block block { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitForeachNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class WhileNode : StmtNode
    {
        public ExpressionNode condition { get; set; }
        public Block block { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitWhileNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class VariableDeclNode : StmtNode
    {
        public Type type { get; set; }
        public string name { get; set; }
        public ExpressionNode initialization { get; set; }
        public virtual T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitVariableDeclNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class ListDeclNode : StmtNode
    {
        public Type type { get; set; }
        public string name { get; set; }
        /*?*/
        public Initialization initialization { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitListDeclNode(this);
        }
        public LineInfo Line { get; set; }

    }

    public class Initialization : ASTNode
    {
        public ExpressionNode initialization { get; set; }
        public List<ExpressionNode> elements { get; set; } = new List<ExpressionNode>(); public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitInitialization(this);
        }
        public LineInfo Line { get; set; }

    }


    public abstract class JumpStmtNode : StmtNode
    {
        public abstract T Accept<T>(ASTVisitor<T> v);
        public LineInfo Line { get; set; }

    }

    public class Break : JumpStmtNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitBreak(this);
        }
    }

    public class Continue : JumpStmtNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitContinue(this);
        }
    }

    public class Return : JumpStmtNode
    {
        public ExpressionNode returnValue { get; set; }
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitReturn(this);
        }
    }

    public abstract class CompoundAssignNode : StmtNode
    {
        public IdentifierCall identifier { get; set; }
        public ExpressionNode expression { get; set; }

        public abstract T Accept<T>(ASTVisitor<T> v);
        public LineInfo Line { get; set; }

    }

    public class PLUSEQNode : CompoundAssignNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitPLUSEQNode(this);
        }
    }

    public class MINUSEQNode : CompoundAssignNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitMINUSEQNode(this);
        }
    }

    public class MULTIEQNode : CompoundAssignNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitMULTIEQNode(this);
        }
    }

    public class DIVISIONEQNode : CompoundAssignNode
    {
        public override T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitDIVISIONEQNode(this);
        }
    }

    public class TernaryNode : StmtNode
    {
        public IdentifierCall identifier { get; set; }
        public ExpressionNode condition { get; set; }
        public ExpressionNode ifClause { get; set; }
        public ExpressionNode elseClause { get; set; }
        public T Accept<T>(ASTVisitor<T> v)
        {
            return v.VisitTernaryNode(this);
        }
        public LineInfo Line { get; set; }

    }
}
