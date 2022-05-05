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



public struct ___input{
        public string ___operator;
        public decimal? ___operand;
}

public struct ___hej{
        public string ___operator;
        public decimal? ___operand;
}

public enum ___biomes{
        ___desert,
        ___ocean,
        ___forest,
}

    public static void Main()
    {
        decimal? ___accumulator = 0.0M ;;
        ___input ___userInput ;
        ___userInput.___operator = "";
        ___userInput.___operand = 0.0M;
        while (___userInput.___operator != "q") 
        {
            ___Write("Enter operator, and an optional operand:\n");
            ___userInput = ___GetInput();
            if (___userInput.___operator != "q")
            {
                ___accumulator = ___DoOperation(___userInput.___operator, ___userInput.___operand, ___accumulator);
                ___Write("Result so far is " + ___accumulator.___ToText() + "\n");
            }
;
        }
;
        ___Write("Final result is: {accumulator} \n");
    }

    public static ___input ___GetInput()
    {
        ___input ___userInput ;
        ___userInput.___operator = "";
        ___userInput.___operand = (-5M);
        while (___userInput.___operator == "") 
        {
            string ___read  = ___Read();;
            List<string> ___spilted = ___read.___SplitCustom(" ");
            if (___spilted.___Length() == 2M && ___IsValidBinaryOperator(___spilted[(int)0M]))
            {
                ___userInput.___operator = ___spilted[(int)0M];
                ___userInput.___operand = ___spilted[(int)1M].___ToNumber();
                if (___userInput.___operand == null)
                {
                    ___userInput.___operator = "";
                    ___userInput.___operand = 0.0M;
                    ___Write("Wrong input. Write a new input\n");
                }
;
            }
            else if (___spilted.___Length() == 1M)
            {
                if (___IsValidUnaryOperator(___spilted[(int)0M]))
                {
                    ___userInput.___operator = ___spilted[(int)0M];
                }
                else 
                {
                    ___Write("Wrong input. Write a new input\n");
                }
;
            }
            else 
            {
                ___Write("Wrong input. Write a new input\n");
            }
;
        }
;
        return ___userInput;
;
    }

    public static bool ___IsValidBinaryOperator(string ___operation)
    {
        bool ___result ;
        if (___operation == "+" || ___operation == "-" || ___operation == "*" || ___operation == "/" || ___operation == "mod" || ___operation == "^")
        {
            ___result = true;
        }
        else 
        {
            ___result = false;
        }
;
        return ___result;
;
    }

    public static bool ___IsValidUnaryOperator(string ___operation)
    {
        bool ___result ;
        if (___operation == "sqrt" || ___operation == "cbrt" || ___operation == "q")
        {
            ___result = true;
        }
        else 
        {
            ___result = false;
        }
;
        return ___result;
;
    }

    public static decimal? ___DoOperation(string ___operation, decimal? ___operand, decimal? ___previousAccumulator)
    {
        decimal? ___newAccumulator = ___previousAccumulator ;;
        switch (___operation) {
            case "+":
                ___newAccumulator += ___operand;
            break;
            case "-":
                ___newAccumulator -= ___operand;
            break;
            case "*":
                ___newAccumulator *= ___operand;
            break;
            case "/":
                if (___operand != 0M)
                {
                    ___newAccumulator /= ___operand;
                }
                else 
                {
                    ___Write("Can not divide with zero\n");
                }
;
            break;
            case "^":
                ___newAccumulator = ___Pow(___newAccumulator, ___operand);
            break;
            case "sqrt":
                ___newAccumulator = ___Sqrt(___newAccumulator);
            break;
            case "cbrt":
                ___newAccumulator = ___Cbrt(___newAccumulator);
            break;
            case "mod":
                ___newAccumulator = ___newAccumulator % ___operand;
            break;
            default: 
                ___Write("Somenthing went wrong\n");
                break;
        };
        return ___newAccumulator;
;
    }

}