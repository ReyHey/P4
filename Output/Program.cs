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
        List<decimal?> integerList = new List<decimal?>()  {0, 5, 2, 6, 3, 19, 473, 38};
        decimal? average  = GetAverage(new List<decimal?>(integerList));
        Write("The Average value of the list is " + average.ToText() + "\n");
        Write("List after call");
                foreach (decimal? element  in integerList) 
        {
            Write(element.ToText() + "\n");
        }
;
    }

    public static decimal? GetAverage(List<decimal?> l)
    {
        decimal? sum = 0;
                foreach (decimal? element  in l) 
        {
            sum += element;
        }
;
        decimal? i = 0;
        while (i < l.Length()) 
        {
            l[(int)i] = -1;
            i += 1;
        }
;
        return sum / l.Length();
;
    }

}