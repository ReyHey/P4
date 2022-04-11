using Simpleton.AST;

namespace Simpleton.SymTable
{

    public class Symbol
    {
        public Symbol(string type, string name, string value, ASTNode node)
        {
            this.type = type;
            this.name = name;
            this.node = node;
            this.value = value;
        }

        public string type { get; }
        public string name { get; }
        public string value { get; set; }
        public ASTNode node { get; }

        public override string ToString()
        {
            return $"{type} {name} {value}";
        }
    }
}
