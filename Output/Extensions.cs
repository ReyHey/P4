using System;
using System.Collections.Generic;
using System.Linq;

namespace ExtensionMethods 
{
	public static class Extensions
	{
		// Text
		public static bool ___IsSubText(this string str, string sub)
		{
			return str.Contains(sub);
		}

		public static string ___DeleteSubTexts(this string str, string sub)
		{
			return String.Join("", str.Split(sub));
		}

		public static string ___DeleteFromTo(this string str, decimal? start, decimal? stop)
		{
			if (start != null && stop != null) 
			{
				return str.Substring((int)start, (int)(stop - start));	
			}
			Console.WriteLine($"Could not execute method 'DeleteFromTo' on text {str}, either start or stop parameter was null");
	        System.Environment.Exit(1);
	        return "";
		}

		public static string ___ReverseText(this string str)
		{
			char[] temp = str.ToCharArray();
			Array.Reverse(temp);
			return new String(temp);
		}

		public static decimal? ___Length(this string str)
		{
			return (decimal?) str.Length;
		}

		public static decimal? ___ToNumber(this string str) 
		{
			try
			{
				return decimal.Parse(str);
			}
			catch (System.FormatException)
			{
				return null;
			}		
		}

		public static List<string> ___SplitCustom(this string str, string token) 
		{
			return str.Split(token).Cast<string>().ToList<string>();
		}

		public static string ___CharAt(this string str, decimal? index)
		{
			if (index != null) 
			{
				return str[(int) index].ToString();
			}
			Console.WriteLine($"Could not execute method 'CharAt' on text {str}, because index parameter was null");
	        System.Environment.Exit(1);
	        return "";
		}

		public static string ___ReplaceCustom(this string str, string original, string replacer)
		{
			string temp = str;
			temp.Replace(original, replacer);
			return temp;
		}

		// Number
		public static string ___ToText(this decimal? num) 
		{
			if (num != null)
			{
				return ((decimal)num).ToString();
			}
			Console.WriteLine($"Could not execute method 'ToText' on num, because num parameter was null");
	        System.Environment.Exit(1);
	        return "";
		}

		// Boolean
		public static string ___ToText(this bool b)
		{
			return b.ToString();
		}

		// List
		public static void ___RemoveAt<T>(this List<T> l, decimal? index)
		{
			if (index != null)
			{
				l.RemoveAt((int) index);
			}
			else
			{
				Console.WriteLine($"Could not execute 'RemoveAt' on list, because index parameter was null");
	       	 System.Environment.Exit(1);
			}
		}

		public static void ___Sort<T>(this List<T> l) where T : IComparable
		{
			l.Sort();
		}

		public static decimal? ___Length<T>(this List<T> l)
		{
			return (decimal?) l.Count;
		}

		public static void ___Add<T>(this List<T> l, T a)
		{
			l.Add(a);
		}
	}
}