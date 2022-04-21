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



    //public class FunctionSymbol : VariableSymbol
    //{
    //    public FunctionSymbol(Type type, string name, ASTNode node) : base(name, type, node)
    //    {
    //    }
    //}

    //public class StructSymbol : VariableSymbol
    //{
    //    public StructSymbol(string structName, string identifier, Dictionary<string, VariableSymbol> members, ASTNode node) : base(identifier, new Type(structName, false, true), node)
    //    {
    //        this.members = members;
    //    }
    //    public Dictionary<string, Symbol> members = new Dictionary<string, Symbol>();
    //}


    //public class StructDeclarationSymbol : Symbol
    //{
    //    public StructDeclarationSymbol(string name, List<VariableSymbol> members, ASTNode node) : base(name, node)
    //    {
    //        foreach (VariableSymbol member in members)
    //        {
    //            this.members.Add(member.name, member);
    //        }
    //    }
    //    public Dictionary<string, VariableSymbol> members = new Dictionary<string, VariableSymbol>();
    //}

    //public class EnumSymbol : StructSymbol
    //{
    //    public EnumSymbol(string name, List<Symbol> members, ASTNode node) : base(name, members, node)
    //    {

    //    }
    //}

    //public class EnumDeclarationSymbol : StructDeclarationSymbol
    //{
    //    public EnumDeclarationSymbol(string name, List<VariableSymbol> members, ASTNode node) : base(name, members, node)
    //    {

    //    }
    //}

}
