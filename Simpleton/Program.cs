#pragma warning disable

using System;
using System.Diagnostics;
using System.Linq;
using Simpleton.AST;
using System.IO;

namespace Simpleton
{
    class Program
    {
        public static bool enablePrettyPrint = false;
        public static bool enableASTPrinter = false;
        public static ProjectPath projectPath = new ProjectPath();
        static void Main(string[] args)
        {
            if (args.Length == 1)
            {
                ParserHandler parser = new ParserHandler(projectPath.GetPath() + "../" + args[0]);
                ProgramNode AST = parser.Parse();

                if (enableASTPrinter)
                {
                    PrintNode tree = new PrintNodeVisitor().VisitProgramNode((ProgramNode)AST);
                    tree.Print("", true);
                }

                if (enablePrettyPrint)
                {
                    string prettyPrint = new PrettyPrint().VisitProgramNode((ProgramNode)AST);
                    Console.WriteLine(prettyPrint);
                }

                new ScopeCheckerVisitor(AST).VisitProgramNode(AST);
                new Typechecker().VisitProgramNode(AST);

                CodeGenerator cg = new CodeGenerator();
                CodeGenerationVisitor cgv = new CodeGenerationVisitor();
                cg.Write(cgv.VisitProgramNode(AST) + "}");
                cg.Close();
            }
        }
    }
}