using System.Collections.Generic;
using Simpleton.AST;

namespace Simpleton.SymTable
{

    public class Symbol
    {
        public Symbol(Type type, string name, ASTNode node)
        {
            this.type = type;
            this.name = name;
            this.node = node;
        }

        public Type type { get; }
        public string name { get; }
        public ASTNode node { get; }

        public override string ToString()
        {
            return $"{type} {name}";
        }
    }

    public class StructSymbol : Symbol
    {
        public StructSymbol(Type type, string name, List<Symbol> members, ASTNode node) : base(type, name, node)
        {
            foreach (Symbol member in members)
            {
                this.members.Add(member.name, member);
            }
        }
        Dictionary<string, Symbol> members = new Dictionary<string, Symbol>();
    }
}
