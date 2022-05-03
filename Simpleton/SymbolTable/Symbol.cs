using System.Collections.Generic;
using Simpleton.AST;

namespace Simpleton.SymTable
{

    public class Symbol
    {
        public Symbol(string name, ASTNode node)
        {
            this.name = name;
            this.node = node;
        }


        public string name { get; }
        public ASTNode node { get; }

        public override string ToString()
        {
            return $"{name}";
        }
    }

    public class TypeSymbol : Symbol
    {
        public TypeSymbol(string typeName, Dictionary<string, FunctionDeclNode> methods) : base(typeName, null)
        {
            this.methods = methods;
        }
        public Dictionary<string, FunctionDeclNode> methods = new Dictionary<string, FunctionDeclNode>();
    }
}
