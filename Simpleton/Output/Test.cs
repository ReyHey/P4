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
        List<decimal?> vector1 = new List<decimal?>();
        List<decimal?> vector2 = new List<decimal?>();
        vector1 = GetVector("first");
        vector2 = GetVector("second");
        if (vector1.Length() == vector2.Length())
        {
            decimal? result  = 0;
            decimal? i  = 0;
            while (i < vector1.Length()) 
            {
                result += vector1[(int)i] * vector2[(int)i];
                i += 1;
            }
;
            Write("The dot product of the vectors is " + result.ToText());
        }
        else 
        {
            Write("The two wrote vectors are not equal size, and therefor the dot product could not be calculate.");
        }
;
    }

    public static List<decimal?> GetVector(string str)
    {
        bool isValidInput  = true;
        List<decimal?> vector = new List<decimal?>();
        while (isValidInput) 
        {
            Write("Write the " + str + " vector: ");
            string vectorString  = Read();
            vectorString = vectorString.DeleteSubTexts("[");
            vectorString = vectorString.DeleteSubTexts("]");
            List<string> spilted = vectorString.SplitCustom(",");
            decimal? value  = 0;
                        foreach (string e  in spilted) 
            {
                value = e.ToNumber();
                if (value != null)
                {
                    vector.Add(value);
                    isValidInput = false;
                }
                else 
                {
                    isValidInput = true;
                    Write("Wrong input. Write a valid vector\n");
                }
;
            }
;
        }
;
        return vector;
;
    }

}