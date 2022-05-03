using System;
using System.Collections.Generic;
using System.Linq;

namespace ExtensionMethods 
{
	public static class Extensions
	{
		// Text
		public static bool IsSubText(this string str, string sub)
		{
			return str.Contains(sub);
		}

		public static string DeleteSubTexts(this string str, string sub)
		{
			return String.Join("", str.Split(sub));
		}

		public static string DeleteFromTo(this string str, decimal? start, decimal? stop)
		{
			if (start != null && stop != null) 
			{
				return str.Substring((int)start, (int)(stop - start));	
			}
			Console.WriteLine($"Could not execute method 'DeleteFromTo' on text {str}, either start or stop parameter was null");
	        System.Environment.Exit(1);
	        return "";
		}

		public static string ReverseText(this string str)
		{
			char[] temp = str.ToCharArray();
			Array.Reverse(temp);
			return new String(temp);
		}

		public static decimal? Length(this string str)
		{
			return (decimal?) str.Length;
		}

		public static decimal? ToNumber(this string str) 
		{
			return decimal.Parse(str);
		}

		public static List<string> SplitCustom(this string str, string token) 
		{
			return str.Split(token).Cast<string>().ToList<string>();
		}

		public static string CharAt(this string str, decimal? index)
		{
			if (index != null) 
			{
				return str[(int) index].ToString();
			}
			Console.WriteLine($"Could not execute method 'CharAt' on text {str}, because index parameter was null");
	        System.Environment.Exit(1);
	        return "";
		}

		public static string ReplaceCustom(this string str, string original, string replacer)
		{
			string temp = str;
			temp.Replace(original, replacer);
			return temp;
		}

		// Number
		public static string ToText(this decimal? num) 
		{
			if (num != null)
			{
				return ((decimal)num).ToString();
			}
			Console.WriteLine($"Could not execute method 'ToText' on num, because num parameter was null");
	        System.Environment.Exit(1);
	        return "";
		}

		public static decimal? Sqrt(decimal? num)
		{
			if (num != null)
			{
				return (decimal?) Math.Sqrt((double) num);
			}
			Console.WriteLine($"Could not execute method 'Sqrt' on num, because num parameter was null");
	        System.Environment.Exit(1);
	        return 0;
		}

		public static decimal? Cbrt(decimal? num)
		{
			if (num != null) 
			{
				return (decimal?) Math.Cbrt((double) num);
			}
			Console.WriteLine($"Could not execute method 'Cbrt' on num, because num parameter was null");
	        System.Environment.Exit(1);
	        return 0;
		}

		public static decimal? PowCustom(decimal? b, decimal? p)
		{
			if (b != null && p != null)
			{
				return (decimal?) Math.Pow((double) b, (double) p);
			}
			Console.WriteLine($"Could not execute 'Pow' since either its base or power parameter was null");
	        System.Environment.Exit(1);
	        return 0;
		}

		// Boolean
		public static string ToText(this bool b)
		{
			return b.ToString();
		}

		// List
		public static void RemoveAt<T>(this List<T> l, decimal? index)
		{
			if (index != null)
			{
				l.RemoveAt((int) index);
			}
			Console.WriteLine($"Could not execute 'RemoveAt' on list, because index parameter was null");
	        System.Environment.Exit(1);
		}

		public static void Sort<T>(this List<T> l) where T : IComparable
		{
			l.Sort();
		}

		public static decimal? Length<T>(this List<T> l)
		{
			return (decimal?) l.Count;
		}
	}
}