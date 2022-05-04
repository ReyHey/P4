using System;
using System.Globalization;

namespace Simpleton.SymTable
{

    public class GetException : Exception
    {
        public GetException(string name) : base()
        {
            this.name = name;
        }
        public string name { get; }
    }
}