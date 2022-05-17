using System.Collections.Generic;
using Simpleton.AST;

namespace Simpleton.SymTable
{
    public class SymbolTable
    {
        Stack<Dictionary<string, Symbol>> symbolTables = new Stack<Dictionary<string, Symbol>>();

        public SymbolTable()
        {
            OpenNewScope();
        }

        public void OpenNewScope()
        {
            symbolTables.Push(new Dictionary<string, Symbol>());
        }

        public void CloseNewlyCreatedScope()
        {
            symbolTables.Pop();
        }


        public Symbol getSymbol(string name)
        {
            foreach (Dictionary<string, Symbol> table in symbolTables)
            {
                if (table.ContainsKey(name))
                    return table[name];
            }
            throw new GetException(name);
        }

        public void PutSymbol(string name, Symbol symbol)
        {
            if (symbolTables.Peek().ContainsKey(name))
                throw new PutException(name);

            symbolTables.Peek().Add(name, symbol);
        }

        public void Print()
        {

            foreach (Dictionary<string, Symbol> table in symbolTables)
            {
                foreach (string item in table.Keys)
                {
                    System.Console.WriteLine(table[item].ToString());
                }
                System.Console.WriteLine("");
            }
        }
    }

}