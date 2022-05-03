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
            if (File.Exists((Program.terminal ? "" : "../../../") + this._fileName))
            {
                File.Delete((Program.terminal ? "" : "../../../") + this._fileName);
            }
            this._file = File.Create((Program.terminal ? "" : "../../../") + this._fileName);
            this.Write(@"using System.Collections.Generic;
using System;
using ExtensionMethods;

class CODE
{
	// Misc
	public static void Write(string t)
	{
		Console.Write(t);
	}

	public static string Read()
    {
        string? t = Console.ReadLine();
        if (t != null)
        {
            return (string)t;
        }
        return string.Empty;
    }

	public static void Terminate(string t)
	{
		Console.WriteLine(t);
		System.Environment.Exit(1);
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

        private static bool _terminal = true;
        private FileStream _file;
        private string _fileName = (_terminal ? "" : "../../../") + "../Output/Program.cs";
    }
}