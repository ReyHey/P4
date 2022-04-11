using System;

namespace Simpleton.SymTable
{
    public class PutException : Exception
    {
        public PutException(string name) : base("\"" + name + "\"" + " is already declared in this context.")
        {
        }
    }
}


