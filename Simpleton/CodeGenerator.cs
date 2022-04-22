using System;
using System.Diagnostics;
using System.Linq;
using System.IO;
using System.Text;

namespace Simpleton
{
    class CodeGenerator
    {
        public CodeGenerator() {
            if (File.Exists(this._fileName))    
            {    
                File.Delete(this._fileName);    
            }
            this._file = File.Create(this._fileName);
        }

        public void Write(string code) {
            byte[] bytes = Encoding.ASCII.GetBytes(code);
            this._file.Write(bytes, 0, bytes.Length);
        }

        public void Close() {
            this._file.Close();
        }

        private FileStream _file;
        private string _fileName = "Output/Test.class";
    }
}