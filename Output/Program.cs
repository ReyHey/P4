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



    public static void Main()
    {
        ___Write("IT WORRRKSS!!!\n");
    }

}