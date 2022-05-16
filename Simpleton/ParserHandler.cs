using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Simpleton.AST;

namespace Simpleton {
    public class ParserHandler {
        public ParserHandler(string codeFile) {
            _codeFile = codeFile;
        }

        public ProgramNode Parse() {
            ICharStream stream = CharStreams.fromPath(_codeFile);
            ITokenSource lexer = new SimpletonLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            _parser = new SimpletonParser(tokens);

            _parser.RemoveErrorListeners();
            _parser.AddErrorListener(DescriptiveErrorListener.Instance);

            SimpletonParser.ProgramContext CST = _parser.program();
            return (ProgramNode)new BuildAstVisitor().VisitProgram(CST);
        }

        string _codeFile;
        SimpletonParser _parser;
    }
}