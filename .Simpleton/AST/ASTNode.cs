using System;
using System.Net.NetworkInformation;
using System.Security.Cryptography;
using System.Xml.Linq;

namespace Simpleton.AST
{
    public interface ASTNode
    {
        public T Accept<T>(ASTVisitor<T> v);
        public LineInfo Line { get; set; }
    }

    public struct LineInfo
    {
        public int line;
        public int column;
    }

}

