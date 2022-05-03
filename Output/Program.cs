using System.Collections.Generic;
using System;
using ExtensionMethods;

class CODE
{
	// Misc
	public static void Write(string t)
	{
		Console.Write(t);
	}

	public static string Read()
    {
        string? t = Console.ReadLine();
        if (t != null)
        {
            return (string)t;
        }
        return string.Empty;
    }

	public static void Terminate(string t)
	{
		Console.WriteLine(t);
		System.Environment.Exit(1);
	}
    public static void Main()
    {
        Write("IT WORRRKSS!!!\n");
    }

}