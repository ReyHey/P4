using Xunit;
using Xunit.Abstractions;
using System;
using Simpleton;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Simpleton.AST;
using System.Collections.Generic;
using Moq;
using System.IO;

namespace Simpleton.Test {
    public class ParserTest
    {
        private readonly ITestOutputHelper output;

        public ParserTest(ITestOutputHelper output) {
            this.output = output;
        }

        [Fact(Skip="Does not work... sadge")]
        public void LexerTest()
        {
            ParserHandler parser = new ParserHandler("../../../test.sm");
            //List<IToken> tokens = parser.Lexer().allTokens;
            //output.WriteLine("wowowowowoo:" + tokens[0].Text);
            /*ITokenStream tokens = new CommonTokenStream(lexer);
            Interval interval = new Interval(1,10);
            IList<IToken> tokenList = tokens.GetTokens();
            output.WriteLine("wowowowowoo:" + tokenList[0].Text);*/
            Assert.Equal(0, 0);
        }

       /* [Fact]
        public void SwitchNodeTest() {
            SwitchNode node = new SwitchNode();

            VariableCallNode exprNode = new VariableCallNode("var");
            List<Case> caseNodes = new List<Case>();
            NumberLiteral
            caseNodes.CaseExpr =
            List<StmtNode> defaultCaseStmtNodes = new List<StmtNode>();


            node.condition = exprNode;
            node.cases = caseNodes;
            node.defaultCase = defaultCaseStmtNodes;
        }*/
        [Fact]
        public void SwitchCaseTest() {
            SimpletonParser parser = TestParser(@"switch variable {
        case 1:
            1+1
            break
        case 2:
            2+2
            break
        case 5:
            5+5
            break
        defualt:
            0+1
            break
    }
");

            SimpletonParser.Switch_stmtContext CST = parser.switch_stmt();
            SwitchNode SwitchAST = (SwitchNode)new BuildAstVisitor().VisitSwitch_stmt(CST);

            VariableCallNode condition = (VariableCallNode)SwitchAST.condition;
            output.WriteLine(condition.identifier);
            Assert.Equal(condition.identifier, "variable");

            foreach(Case caseItem in SwitchAST.cases) {
                NumberLiteral caseExpr = (NumberLiteral)caseItem.CaseExpr;
                output.WriteLine(caseExpr.value);
                Assert.True(Int32.Parse(caseExpr.value).GetType() == typeof(int));
            }
        }

        [Fact]
        public void ForeachTest() {
            SimpletonParser parser = TestParser(@"foreach text t in listOfText {
                Write(t)
                }");
            
            SimpletonParser.Foreach_stmtContext CST = parser.foreach_stmt();
            ForeachNode ForeachAST = (ForeachNode)new BuildAstVisitor().VisitForeach_stmt(CST);
            Assert.Equal("text", ForeachAST.element.type.typeName);
            Assert.Equal("t", ForeachAST.element.name);
            //Assert.Equal("text", ForeachAST.element.type.typeName);
            

        }

        /*[Fact]
        public void AdditionTest() {
            SimpletonParser parser = TestParser(@"1+2");
            SimpletonParser.InfixExprContext CST = parser.expr();
            AdditionNode AdditionAST = (AdditionNode)new BuildAstVisitor().VisitAdditionNode(CST);
        }*/

        [Fact]
        public void ErrorListenerTestHasError() {
            DescriptiveErrorListener errorListener = DescriptiveErrorListener.Instance;
            ICharStream stream = CharStreams.fromString("asddasdlåsld;dasd{{[));;");
            ITokenSource lexer = new SimpletonLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            SimpletonParser parser = new SimpletonParser(tokens);

            parser.RemoveErrorListeners();
            parser.AddErrorListener(errorListener);

            SimpletonParser.ProgramContext CST = parser.program();
            ProgramNode AST = (ProgramNode)new BuildAstVisitor().VisitProgram(CST);

            Assert.False(errorListener.errorLog.Count == 0);
        }

        [Fact]
        public void ErrorListenerTestNoError() {
            DescriptiveErrorListener errorListener = DescriptiveErrorListener.Instance;
            ICharStream stream = CharStreams.fromString(@"function void Main(){

}");
            ITokenSource lexer = new SimpletonLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            SimpletonParser parser = new SimpletonParser(tokens);

            parser.RemoveErrorListeners();
            parser.AddErrorListener(errorListener);

            SimpletonParser.ProgramContext CST = parser.program();
            ProgramNode AST = (ProgramNode)new BuildAstVisitor().VisitProgram(CST);

            Assert.True(errorListener.errorLog.Count == 0);
        }

        /*[Fact]
        public void ScopeTest() {
            SimpletonParser parser = TestParser(@"function void Main(){
                function void ScopeError() {
                    
                }

}");

            SimpletonParser.ProgramContext CST = parser.program();
            ProgramNode AST = (ProgramNode)new BuildAstVisitor().VisitProgram(CST);

            new ScopeCheckerVisitor(AST).VisitProgramNode(AST);
        }*/

        [Fact]
        public void TypeTestFail() {
            SimpletonParser parser = TestParser(@"function void Main(){
    string s
    s = TypeTest(false)
}

function boolean TypeTest(number n) {
    if n > 2 {
        return true
    }
    else {
        return false
    }
}");

            SimpletonParser.ProgramContext CST = parser.program();
            ProgramNode AST = (ProgramNode)new BuildAstVisitor().VisitProgram(CST);
            try {
                new ScopeCheckerVisitor(AST).VisitProgramNode(AST);
                new Typechecker().VisitProgramNode(AST);
                Assert.True(false, "Type error was not found");
            }
            catch (Exception) {

            }
            
        }

        [Fact]
        public void TypeTestNoFail() {
            SimpletonParser parser = TestParser(@"function void Main(){
    boolean s
    s = TypeTest(5)
}

function boolean TypeTest(number n) {
    if n > 2 {
        return true
    }
    else {
        return false
    }
}");

            SimpletonParser.ProgramContext CST = parser.program();
            ProgramNode AST = (ProgramNode)new BuildAstVisitor().VisitProgram(CST);
            try {
                new ScopeCheckerVisitor(AST).VisitProgramNode(AST);
                new Typechecker().VisitProgramNode(AST);
            }
            catch (Exception e) {
                output.WriteLine(e.ToString());
                Assert.True(false, "Type error was found where there should not have been any");
            }
            
        }

        public SimpletonParser TestParser(string code) {
            ICharStream stream = CharStreams.fromString(code);
            ITokenSource lexer = new SimpletonLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            SimpletonParser parser = new SimpletonParser(tokens);

            parser.RemoveErrorListeners();
            parser.AddErrorListener(DescriptiveErrorListener.Instance);
            return parser;
        }
    }
}

