using System.Collections.Generic;
using Simpleton.AST;

namespace Simpleton.SymTable
{
    //public class SymbolTable
    //{
    //    private Dictionary<string, Symbol> st = new Dictionary<string, Symbol>();
    //    private SymbolTable parentTable;


    //    public SymbolTable()
    //    {
    //        this.parentTable = null;
    //    }


    //    public SymbolTable(SymbolTable parentTable)
    //    {
    //        this.parentTable = parentTable;
    //    }

    //    public Symbol getSymbol(string name)
    //    {
    //        try
    //        {
    //            if (!st.ContainsKey(name))
    //            {
    //                throw new GetException(name);
    //            }
    //            return st[name];
    //        }
    //        catch (GetException get)
    //        {
    //            throw get;
    //        }
    //    }

    //    public void putSymbol(string type, string name, string value, ASTNode node)
    //    {
    //        try
    //        {
    //            for (SymbolTable table = this; table != null; table = table.parentTable)
    //            {
    //                if (table.st.ContainsKey(name))
    //                {
    //                    throw new PutException(name);
    //                }
    //            }

    //            st.Add(name, new Symbol(type, name, value, node));
    //        }
    //        catch (PutException put)
    //        {
    //            throw put;
    //        }
    //    }

    //    public Dictionary<string, Symbol> retrieveAllSymbols()
    //    {
    //        return st;
    //    }


    //}




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
            try
            {
                foreach (Dictionary<string, Symbol> table in symbolTables)
                {
                    if (table.ContainsKey(name))
                        return table[name];
                }
                throw new GetException(name);

            }
            catch (GetException get)
            {
                throw get;
            }
        }


        public void PutSymbol(Type type, string name, ASTNode node, string value = "")
        {
            try
            {
                if (symbolTables.Peek().ContainsKey(name))
                {
                    throw new PutException(name);
                }

                symbolTables.Peek().Add(name, new Symbol(type, name, node));
            }
            catch (PutException put)
            {
                throw put;
            }
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