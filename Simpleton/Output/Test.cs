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

    public static decimal Pow(decimal? a, decimal? b)
    {
        if (a == null || b == null)
        {
            Console.WriteLine("Could not make power, because of NaN");
            System.Environment.Exit(1);
        }
        return (decimal) Math.Pow((double) a, (double) b);
    }

    public static decimal Sqrt(decimal? v)
    {
        if (v == null)
        {
            Console.WriteLine("Could not make sqrt, because of NaN");
            System.Environment.Exit(1);
        }
        return (decimal)Math.Sqrt((double)v);
    }

    public static decimal Cbrt(decimal? v)
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
        string geometry  = Read();;
        switch (geometry) {
            case "circle":
                Circle();
            break;
            case "rectangle":
                Rectangle();
            break;
            case "triangle":
                Triangle();
            break;
            default: 
                Write(5M);
                break;
        };
    }

    public static void Circle()
    {
        Write("The radius of the circle: ");
        string read_terminal  = Read();;
        decimal? r = read_terminal.ToNumber() ;;
        if (r != null)
        {
            decimal? area = 3.14M * Pow(r, 2M) ;;
            Write("The area of the circle with radius " + r.ToText() + " is " + area.ToText());
        }
        else 
        {
            Write("The area of the circle could not be calculate since a invalid radius");
        }
;
    }

    public static void Rectangle()
    {
        Write("The length of the one side of the rectangle: ");
        string read_terminal  = Read();;
        decimal? l = read_terminal.ToNumber() ;;
        if (l == null)
        {
            Write("The length is invalid and therefore the area can not be computed");
        }
        else 
        {
            Write("The length of the other side of the rectangle: ");
            string read_terminal1  = Read();;
            decimal? b = read_terminal1.ToNumber() ;;
            if (l == null)
            {
                Write("The length is invalid and therefore the area can not be computed");
            }
            else 
            {
                decimal? area = l * b ;;
                Write("The area of the rectangle with sides length " + l.ToText() + " and " + b.ToText() + " is " + area.ToText());
            }
;
        }
;
    }

    public static void Triangle()
    {
        Write("The length of the heigth of the triangle: ");
        string read_terminal  = Read();;
        decimal? h = read_terminal.ToNumber() ;;
        if (h == null)
        {
            Write("The heigth is invalid and therefore the area can not be computed");
        }
        else 
        {
            Write("The base of the triangle: ");
            string read_terminal1  = Read();;
            decimal? b = read_terminal1.ToNumber() ;;
            if (b == null)
            {
                Write("The base is invalid and therefore the area can not be computed");
            }
            else 
            {
                decimal? area = 1M / 2M * h * b ;;
                Write("The area of the triangle with the heigth " + h.ToText() + " and the base" + b.ToText() + " is " + area.ToText());
            }
;
        }
;
    }

}