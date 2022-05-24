using System;
using System.Collections.Generic;

namespace Simpleton.AST
{
    class PrintNode
    {
        public PrintNode(string nodeName, string value, LineInfo line)
        {
            _nodeName = nodeName;
            _value = value;
            _line = line;
        }

        public PrintNode(string nodeName, LineInfo line)
        {
            _nodeName = nodeName;
            _value = null;
            _line = line;
        }

        public void Print(string indent, bool isLast)
        {
            Console.Write(indent);
            if (isLast)
            {
                Console.Write("\\-");
                indent += "  ";
            }
            else
            {
                Console.Write("|-");
                indent += "| ";
            }
            if (_line.line == 0)
            {
                if (_value != null)
                    Console.WriteLine($"{_nodeName} -> {_value}");
                else
                    Console.WriteLine($"{_nodeName}");
            }
            else
            {
                if (_value != null)
                    Console.WriteLine($"{_nodeName} -> {_value} [{_line.line}:{_line.column}]");
                else
                    Console.WriteLine($"{_nodeName} [{_line.line}:{_line.column}]");
            }

            for (int i = 0; i < _children.Count; i++)
                _children[i].Print(indent, i == _children.Count - 1);
        }
        public void AddChild(PrintNode child)
        {
            _children.Add(child);
        }

        LineInfo _line;
        string _nodeName;
        string _value;
        List<PrintNode> _children = new List<PrintNode>();
    }
}
