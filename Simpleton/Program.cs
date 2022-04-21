using System;
using System.Diagnostics;
using System.Linq;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Simpleton.AST;

namespace Simpleton
{
    class Program
    {
        public static bool terminal = false;
        public static bool enablePrettyPrint = false;
        public static bool enableASTPrinter = false;

        static void Main(string[] args)
        {
            ICharStream stream = CharStreams.fromPath((terminal ? "" : "../../../") + "Codesample/DotProduct.sm");
            ITokenSource lexer = new SimpletonLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            SimpletonParser parser = new SimpletonParser(tokens);
            parser.RemoveErrorListeners();
            parser.AddErrorListener(DescriptiveErrorListener.Instance);
            SimpletonParser.ProgramContext CST = parser.program();
            ProgramNode AST = (ProgramNode)new BuildAstVisitor().VisitProgram(CST);

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
        }


    }
}