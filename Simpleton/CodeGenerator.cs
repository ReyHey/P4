using System;
using System.Diagnostics;
using System.Linq;
using System.IO;
using System.Text;

namespace Simpleton
{
    class CodeGenerator
    {
        public CodeGenerator()
        {
            if (File.Exists(this._fileName))
            {
                File.Delete(this._fileName);
            }
            this._file = File.Create(this._fileName);

            this.Write(@"using System.Collections.Generic;
using System;
using ExtensionMethods;

class CODE
{
	// Misc
	public static void ___Write(string t)
	{
		Console.Write(t);
	}

	public static string ___Read()
    {
        string? t = Console.ReadLine();
        if (t != null)
        {
            return (string)t;
        }
        return string.Empty;
    }

	public static void ___Terminate(string t)
	{
		Console.WriteLine(t);
		System.Environment.Exit(1);
	}

    public static decimal ___Pow(decimal? a, decimal? b)
    {
        if (a == null || b == null)
        {
            Console.WriteLine(""Could not make power, because of NaN"");
            System.Environment.Exit(1);
        }
        return (decimal) Math.Pow((double) a, (double) b);
    }

    public static decimal ___Sqrt(decimal? v)
    {
        if (v == null)
        {
            Console.WriteLine(""Could not make sqrt, because of NaN"");
            System.Environment.Exit(1);
        }
        return (decimal)Math.Sqrt((double)v);
    }

    public static decimal ___Cbrt(decimal? v)
    {
        if (v == null)
        {
            Console.WriteLine(""Could not make cbrt, because of NaN"");
            System.Environment.Exit(1);
        }
        return (decimal)Math.Cbrt((double)v);
    }



");
        }

        public void Write(string code)
        {
            byte[] bytes = Encoding.ASCII.GetBytes(code);
            this._file.Write(bytes, 0, bytes.Length);
        }

        public void Close()
        {
            this._file.Close();
        }

        private FileStream _file;
        private string _fileName = Program.projectPath.GetPath() + "../Output/Program.cs";
    }
}