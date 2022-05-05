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





    //class ASTDebugger
    //{
    //    // Constants for drawing lines and spaces
    //    private const string _cross = " ├─";
    //    private const string _corner = " └─";
    //    private const string _vertical = " │ ";
    //    private const string _space = "   ";

    //    public void Start(List<Node> Nodes)
    //    {

    //        foreach (var node in Nodes)
    //        {
    //            PrintNode(node, indent: "");
    //        }

    //        if (Debugger.IsAttached)
    //        {
    //            Console.WriteLine("Press any key to exit...");
    //            Console.Read();
    //        }
    //    }

    //    static void PrintNode(Node node, string indent)
    //    {
    //        Console.WriteLine(node.Name);

    //        // Loop through the children recursively, passing in the
    //        // indent, and the isLast parameter
    //        var numberOfChildren = node.Children.Count;
    //        for (var i = 0; i < numberOfChildren; i++)
    //        {
    //            var child = node.Children[i];
    //            var isLast = (i == (numberOfChildren - 1));
    //            PrintChildNode(child, indent, isLast);
    //        }
    //    }

    //    static void PrintChildNode(Node node, string indent, bool isLast)
    //    {
    //        // Print the provided pipes/spaces indent
    //        Console.Write(indent);

    //        // Depending if this node is a last child, print the
    //        // corner or cross, and calculate the indent that will
    //        // be passed to its children
    //        if (isLast)
    //        {
    //            Console.Write(_corner);
    //            indent += _space;
    //        }
    //        else
    //        {
    //            Console.Write(_cross);
    //            indent += _vertical;
    //        }

    //        PrintNode(node, indent);
    //    }

    //}
}
