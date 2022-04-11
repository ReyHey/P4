using System;

namespace Simpleton.SymTable
{

    public class GetException : Exception
    {
        public GetException(string name) : base("\"" + name + "\"" + " has not been declared, or is not valid in this context.")
        {
        }
    }
}