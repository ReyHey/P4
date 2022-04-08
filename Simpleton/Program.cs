using System;
using System.Diagnostics;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Simpleton.AST;

namespace Simpleton
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            ICharStream stream = CharStreams.fromPath("Codesample/Calculator.sm");
            ITokenSource lexer = new SimpletonLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            SimpletonParser parser = new SimpletonParser(tokens);
            parser.RemoveErrorListeners();
            parser.AddErrorListener(DescriptiveErrorListener.Instance);
            SimpletonParser.ProgramContext CST = parser.program();
            ProgramNode AST = (ProgramNode)new BuildAstVisitor().VisitProgram(CST);

            PrintNode tree = new PrintNodeVisitor().VisitProgramNode((ProgramNode)AST);
            tree.Print("", true);


        }
    }

}
