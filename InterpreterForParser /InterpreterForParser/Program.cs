using System;
using System.Collections.Generic;
using System.IO;

namespace InterpreterForParser
{
    class InterpreterSYMjava
    {
        bool DEBUG = true;

        public Dictionary<int, string> ReturnSymjava()
        {
            string[] lines;
            if (DEBUG)
                lines = System.IO.File.ReadAllLines(@"../../../../../sym.java");
            else
                lines = System.IO.File.ReadAllLines(@"../../sym.java");
            Dictionary<int, string> result = new Dictionary<int, string>();
            foreach (string line in lines)
            {
                if (line.Contains("public static final int"))
                {
                    string[] split = line.Trim(' ').Split(" ");
                    string str = split[4];
                    int i = Int32.Parse(split[6].TrimEnd(';'));
                    result.Add(i, str);
                }
            }
            return result;
        }

        public Dictionary<int, string> RetrunProductionRules()
        {
            string[] lines;
            if (DEBUG)
                lines = System.IO.File.ReadAllLines(@"../../../../../Parser.java");
            else
                lines = System.IO.File.ReadAllLines(@"../../Parser.java");
            Dictionary<int, string> result = new Dictionary<int, string>();
            foreach (string line in lines)
            {
                if (line.Contains("::="))
                {
                    string str = line.Substring(line.IndexOf('/') + 2);
                    string s = line.Substring(line.IndexOf("case") + 5);
                    string s1 = s.Remove(s.IndexOf(":"), s.Length - s.IndexOf(":"));
                    int i = Int32.Parse(s1);
                    result.Add(i, str);
                }
            }
            return result;
        }


        public void Interpreter()
        {
            string docPath = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
            string[] lines;
            if (DEBUG)
                lines = System.IO.File.ReadAllLines(@"../../../Terminal.txt");
            else
                lines = System.IO.File.ReadAllLines(@"Terminal.txt");

            List<string> strings = new List<string>();
            Dictionary<int, string> resultSym = ReturnSymjava();
            Dictionary<int, string> resultParser = RetrunProductionRules();
            foreach (string line in lines)
            {
                string s = line;
                if (s.StartsWith("# Current token is ") || s.StartsWith("# Current Symbol is "))
                {
                    string[] split = line.Split(" ");
                    string str = split[4];
                    string token = resultSym[Int32.Parse(str.TrimStart('#'))];
                    s = "Token Read: " + str + " = " + token;
                }
                else if (s.StartsWith("token:"))
                {
                    string[] split = line.Split(" ");
                    string str = split[1];
                    string token = resultSym[Int32.Parse(str)];
                    s = s + " = " + token;
                }
                else if (s.StartsWith("# Reduce with prod"))
                {
                    string[] split = line.Split(" ");
                    string str = split[4];
                    string rule = resultParser[Int32.Parse(str.TrimStart('#'))];
                    s = "Reduce prod " + str + " = " + rule;
                }
                else if (s.Contains("# Shift under term"))
                {
                    string[] split = line.Split(" ");
                    s = split[1] + " " + split[4];
                }
                if (!s.Contains("# Reduce rule:") && !s.Contains("# Goto state"))
                    strings.Add(s);

                // Write the string array to a new file named "WriteLines.txt".
            }
            string path;
            if (DEBUG)
                path = @"../../../Output.txt";
            else
                path = @"Output.txt";
            using (StreamWriter outputFile = new StreamWriter(path))
            {
                foreach (string str in strings)
                {
                    outputFile.WriteLine(str);
                }

            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            InterpreterSYMjava a = new InterpreterSYMjava();
            a.Interpreter();
        }
    }
}
