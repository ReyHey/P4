using System.Collections.Generic;
using System;
using ExtensionMethods;

class CODE
{
	// Misc
	public static void ___Write(string t)
	{
		Console.Write(t);
	}

	public static string ___Read()
    {
        string? t = Console.ReadLine();
        if (t != null)
        {
            return (string)t;
        }
        return string.Empty;
    }

	public static void ___Terminate(string t)
	{
		Console.WriteLine(t);
		System.Environment.Exit(1);
	}

    public static decimal ___Pow(decimal? a, decimal? b)
    {
        if (a == null || b == null)
        {
            Console.WriteLine("Could not make power, because of NaN");
            System.Environment.Exit(1);
        }
        return (decimal) Math.Pow((double) a, (double) b);
    }

    public static decimal ___Sqrt(decimal? v)
    {
        if (v == null)
        {
            Console.WriteLine("Could not make sqrt, because of NaN");
            System.Environment.Exit(1);
        }
        return (decimal)Math.Sqrt((double)v);
    }

    public static decimal ___Cbrt(decimal? v)
    {
        if (v == null)
        {
            Console.WriteLine("Could not make cbrt, because of NaN");
            System.Environment.Exit(1);
        }
        return (decimal)Math.Cbrt((double)v);
    }



public struct ___s{
public ___s() {}
public ___s(___s old)
{
        ___a = old.___a;
        ___b = old.___b;
        ___c = old.___c;
        ___d = old.___d;
}
        public decimal? ___a = 0M;
        public string ___b = "";
        public bool ___c = false;
        public List<decimal?> ___d = new List<decimal?>();
}

    public static void Main()
    {
        ___s ___myS = new ___s();
        ___Write("Before call\n");
        ___Write(___myS.___a.___ToText() + "\n");
        ___Write(___myS.___b + "\n");
        ___Write(___myS.___c.___ToText() + "\n");
        ___myS.___d.___Add(5M);
        ___Write("After call\n");
        ___Write(___myS.___a.___ToText() + "\n");
        ___Write(___myS.___b + "\n");
        ___Write(___myS.___c.___ToText() + "\n");
    }

}