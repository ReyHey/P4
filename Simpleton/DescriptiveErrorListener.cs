using System;
using Antlr4.Runtime;
using System.IO;
using System.Collections.Generic;
//Alt det her kode er fundet ppå nettet :)
namespace Simpleton
{
    public class DescriptiveErrorListener : BaseErrorListener, IAntlrErrorListener<int>
    {
        public static DescriptiveErrorListener Instance { get; } = new DescriptiveErrorListener();
        public List<string> errorLog { get; } = new List<string>();
        public void SyntaxError(TextWriter output, IRecognizer recognizer, int offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            if (!REPORT_SYNTAX_ERRORS) return;
            string sourceName = recognizer.InputStream.SourceName;
            // never ""; might be "<unknown>" == IntStreamConstants.UnknownSourceName
            sourceName = $"{sourceName}:{line}:{charPositionInLine}";
            Console.Error.WriteLine($"{sourceName}: line {line}:{charPositionInLine} {msg}");
            errorLog.Add(msg);
        }
        public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            this.SyntaxError(output, recognizer, 0, line, charPositionInLine, msg, e);
        }
        static readonly bool REPORT_SYNTAX_ERRORS = true;
    }




}
