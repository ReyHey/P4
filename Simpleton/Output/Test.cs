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



public struct input{
        public string operator1;
        public decimal? operand;
}

public struct hej{
        public string operator1;
        public decimal? operand;
}

public enum days{
        mon,
        thu
}

const days a = days.mon;
    public static void Main()
    {
        decimal? accumulator = 0.0M ;;
        input userInput ;
        userInput.operator1 = "";
        userInput.operand = 0.0M;
        while (userInput.operator1 != "q") 
        {
            Write("Enter operator1, and an optional operand:\n");
            userInput = GetInput();
            if (userInput.operator1 != "q")
            {
                accumulator = DoOperation(userInput.operator1, userInput.operand, accumulator);
                Write("Result so far is " + accumulator.ToText() + "\n");
            }
;
        }
;
        Write("Final result is: {accumulator} \n");
    }

    public static input GetInput()
    {
        input userInput ;
        userInput.operator1 = "";
        userInput.operand = (-5M);
        while (userInput.operator1 == "") 
        {
            string read  = Read();;
            List<string> spilted = read.SplitCustom(" ");
            if (spilted.Length() == 2M && IsValidBinaryoperator1(spilted[(int)0M]))
            {
                userInput.operator1 = spilted[(int)0M];
                userInput.operand = spilted[(int)1M].ToNumber();
                if (userInput.operand == null)
                {
                    userInput.operator1 = "";
                    userInput.operand = 0.0M;
                    Write("Wrong input. Write a new input\n");
                }
;
            }
            else if (spilted.Length() == 1M)
            {
                if (IsValidUnaryoperator1(spilted[(int)0M]))
                {
                    userInput.operator1 = spilted[(int)0M];
                }
                else 
                {
                    Write("Wrong input. Write a new input\n");
                }
;
            }
            else 
            {
                Write("Wrong input. Write a new input\n");
            }
;
        }
;
        return userInput;
;
    }

    public static bool IsValidBinaryoperator1(string operation)
    {
        bool result ;
        if (operation == "+" || operation == "-" || operation == "*" || operation == "/" || operation == "mod" || operation == "^")
        {
            result = true;
        }
        else 
        {
            result = false;
        }
;
        return result;
;
    }

    public static bool IsValidUnaryoperator1(string operation)
    {
        bool result ;
        if (operation == "sqrt" || operation == "cbrt" || operation == "q")
        {
            result = true;
        }
        else 
        {
            result = false;
        }
;
        return result;
;
    }

    public static decimal? DoOperation(string operation, decimal? operand, decimal? previousAccumulator)
    {
        decimal? newAccumulator = previousAccumulator ;;
        switch (operation) {
            case "+":
                newAccumulator += operand;
            break;
            case "-":
                newAccumulator -= operand;
            break;
            case "*":
                newAccumulator *= operand;
            break;
            case "/":
                if (operand != 0M)
                {
                    newAccumulator /= operand;
                }
                else 
                {
                    Write("Can not divide with zero\n");
                }
;
            break;
            case "^":
                newAccumulator = Pow(newAccumulator, operand);
            break;
            case "sqrt":
                newAccumulator = Sqrt(newAccumulator);
            break;
            case "cbrt":
                newAccumulator = Cbrt(newAccumulator);
            break;
            case "mod":
                newAccumulator = newAccumulator % operand;
            break;
            default: 
                Write("Somenthing went wrong\n");
                break;
        };
        return newAccumulator;
;
    }

}