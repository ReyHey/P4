using System.CodeDom.Compiler;
using System;
using System.Diagnostics;
using System.CodeDom;
using Microsoft.CSharp;

namespace Simpleton {
    class CSharpCompiler {
        public CSharpCompiler(string code, string outputDir) {
            CSharpCodeProvider codeProvider = new CSharpCodeProvider();
            ICodeCompiler icc = codeProvider.CreateCompiler();

            CompilerParameters compilerOptions = new CompilerParameters();

            compilerOptions.GenerateExecutable = true;
            compilerOptions.OutputAssembly = outputDir;

            CompilerResults results = icc.CompileAssemblyFromSource(compilerOptions, code);
            if(results.Errors.Count == 0)
                Process.Start(outputDir);
            else
                Console.WriteLine("Errors sadge!");
        }
    }
}