//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Simpleton.g4 by ANTLR 4.9.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.CLSCompliant(false)]
public partial class SimpletonLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, LIST=49, VOID=50, WS=51, NEWLINE=52, NUMBER=53, 
		TEXT=54, BOOlEAN=55, NAN=56, IDENTIFIER=57;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "LIST", 
		"VOID", "WS", "NEWLINE", "NUMBER", "TEXT", "BOOlEAN", "NAN", "IDENTIFIER"
	};


	public SimpletonLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public SimpletonLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'number'", "'text'", "'boolean'", "'<'", "'>'", "'['", "']'", "'('", 
		"')'", "'-'", "'^'", "'/'", "'mod'", "'*'", "'+'", "'=='", "'!='", "'>='", 
		"'<='", "'!'", "'and'", "'or'", "'.'", "'='", "'constant'", "'{'", "','", 
		"'}'", "'struct'", "'enum'", "'function'", "'break'", "'continue'", "'return'", 
		"'switch'", "'case'", "':'", "'default:'", "'if'", "'else if'", "'else'", 
		"'while'", "'foreach'", "'in'", "'+='", "'-='", "'*='", "'/='", "'list'", 
		"'void'", null, null, null, null, null, "'NaN'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "LIST", "VOID", "WS", "NEWLINE", "NUMBER", "TEXT", "BOOlEAN", "NAN", 
		"IDENTIFIER"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Simpleton.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static SimpletonLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', ';', '\x199', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x4', '$', '\t', '$', '\x4', '%', '\t', '%', '\x4', '&', 
		'\t', '&', '\x4', '\'', '\t', '\'', '\x4', '(', '\t', '(', '\x4', ')', 
		'\t', ')', '\x4', '*', '\t', '*', '\x4', '+', '\t', '+', '\x4', ',', '\t', 
		',', '\x4', '-', '\t', '-', '\x4', '.', '\t', '.', '\x4', '/', '\t', '/', 
		'\x4', '\x30', '\t', '\x30', '\x4', '\x31', '\t', '\x31', '\x4', '\x32', 
		'\t', '\x32', '\x4', '\x33', '\t', '\x33', '\x4', '\x34', '\t', '\x34', 
		'\x4', '\x35', '\t', '\x35', '\x4', '\x36', '\t', '\x36', '\x4', '\x37', 
		'\t', '\x37', '\x4', '\x38', '\t', '\x38', '\x4', '\x39', '\t', '\x39', 
		'\x4', ':', '\t', ':', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x3', 
		'\x2', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x3', '\x3', '\x3', 
		'\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', '\x3', 
		'\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', 
		'\x4', '\x3', '\x4', '\x3', '\x5', '\x3', '\x5', '\x3', '\x6', '\x3', 
		'\x6', '\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', '\t', 
		'\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', '\v', '\x3', 
		'\f', '\x3', '\f', '\x3', '\r', '\x3', '\r', '\x3', '\xE', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xF', '\x3', '\xF', '\x3', '\x10', 
		'\x3', '\x10', '\x3', '\x11', '\x3', '\x11', '\x3', '\x11', '\x3', '\x12', 
		'\x3', '\x12', '\x3', '\x12', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', 
		'\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x15', '\x3', '\x15', 
		'\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', 
		'\x3', '\x17', '\x3', '\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x19', 
		'\x3', '\x19', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', 
		'\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', 
		'\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1D', 
		'\x3', '\x1D', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', 
		'\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1F', '\x3', '\x1F', 
		'\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', ' ', '\x3', ' ', '\x3', 
		' ', '\x3', ' ', '\x3', ' ', '\x3', ' ', '\x3', ' ', '\x3', ' ', '\x3', 
		' ', '\x3', '!', '\x3', '!', '\x3', '!', '\x3', '!', '\x3', '!', '\x3', 
		'!', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '\"', 
		'\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '#', '\x3', 
		'#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', 
		'$', '\x3', '$', '\x3', '$', '\x3', '$', '\x3', '$', '\x3', '$', '\x3', 
		'$', '\x3', '%', '\x3', '%', '\x3', '%', '\x3', '%', '\x3', '%', '\x3', 
		'&', '\x3', '&', '\x3', '\'', '\x3', '\'', '\x3', '\'', '\x3', '\'', '\x3', 
		'\'', '\x3', '\'', '\x3', '\'', '\x3', '\'', '\x3', '\'', '\x3', '(', 
		'\x3', '(', '\x3', '(', '\x3', ')', '\x3', ')', '\x3', ')', '\x3', ')', 
		'\x3', ')', '\x3', ')', '\x3', ')', '\x3', ')', '\x3', '*', '\x3', '*', 
		'\x3', '*', '\x3', '*', '\x3', '*', '\x3', '+', '\x3', '+', '\x3', '+', 
		'\x3', '+', '\x3', '+', '\x3', '+', '\x3', ',', '\x3', ',', '\x3', ',', 
		'\x3', ',', '\x3', ',', '\x3', ',', '\x3', ',', '\x3', ',', '\x3', '-', 
		'\x3', '-', '\x3', '-', '\x3', '.', '\x3', '.', '\x3', '.', '\x3', '/', 
		'\x3', '/', '\x3', '/', '\x3', '\x30', '\x3', '\x30', '\x3', '\x30', '\x3', 
		'\x31', '\x3', '\x31', '\x3', '\x31', '\x3', '\x32', '\x3', '\x32', '\x3', 
		'\x32', '\x3', '\x32', '\x3', '\x32', '\x3', '\x33', '\x3', '\x33', '\x3', 
		'\x33', '\x3', '\x33', '\x3', '\x33', '\x3', '\x34', '\x6', '\x34', '\x146', 
		'\n', '\x34', '\r', '\x34', '\xE', '\x34', '\x147', '\x3', '\x34', '\x3', 
		'\x34', '\x3', '\x35', '\x6', '\x35', '\x14D', '\n', '\x35', '\r', '\x35', 
		'\xE', '\x35', '\x14E', '\x3', '\x35', '\x3', '\x35', '\x6', '\x35', '\x153', 
		'\n', '\x35', '\r', '\x35', '\xE', '\x35', '\x154', '\a', '\x35', '\x157', 
		'\n', '\x35', '\f', '\x35', '\xE', '\x35', '\x15A', '\v', '\x35', '\x3', 
		'\x36', '\x3', '\x36', '\x5', '\x36', '\x15E', '\n', '\x36', '\x3', '\x36', 
		'\x3', '\x36', '\a', '\x36', '\x162', '\n', '\x36', '\f', '\x36', '\xE', 
		'\x36', '\x165', '\v', '\x36', '\x5', '\x36', '\x167', '\n', '\x36', '\x3', 
		'\x36', '\x3', '\x36', '\a', '\x36', '\x16B', '\n', '\x36', '\f', '\x36', 
		'\xE', '\x36', '\x16E', '\v', '\x36', '\x5', '\x36', '\x170', '\n', '\x36', 
		'\x3', '\x37', '\x3', '\x37', '\a', '\x37', '\x174', '\n', '\x37', '\f', 
		'\x37', '\xE', '\x37', '\x177', '\v', '\x37', '\x3', '\x37', '\x3', '\x37', 
		'\x3', '\x37', '\a', '\x37', '\x17C', '\n', '\x37', '\f', '\x37', '\xE', 
		'\x37', '\x17F', '\v', '\x37', '\x3', '\x37', '\x5', '\x37', '\x182', 
		'\n', '\x37', '\x3', '\x38', '\x3', '\x38', '\x3', '\x38', '\x3', '\x38', 
		'\x3', '\x38', '\x3', '\x38', '\x3', '\x38', '\x3', '\x38', '\x3', '\x38', 
		'\x5', '\x38', '\x18D', '\n', '\x38', '\x3', '\x39', '\x3', '\x39', '\x3', 
		'\x39', '\x3', '\x39', '\x3', ':', '\x3', ':', '\a', ':', '\x195', '\n', 
		':', '\f', ':', '\xE', ':', '\x198', '\v', ':', '\x2', '\x2', ';', '\x3', 
		'\x3', '\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', '\r', '\b', 
		'\xF', '\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', '\x19', 
		'\xE', '\x1B', '\xF', '\x1D', '\x10', '\x1F', '\x11', '!', '\x12', '#', 
		'\x13', '%', '\x14', '\'', '\x15', ')', '\x16', '+', '\x17', '-', '\x18', 
		'/', '\x19', '\x31', '\x1A', '\x33', '\x1B', '\x35', '\x1C', '\x37', '\x1D', 
		'\x39', '\x1E', ';', '\x1F', '=', ' ', '?', '!', '\x41', '\"', '\x43', 
		'#', '\x45', '$', 'G', '%', 'I', '&', 'K', '\'', 'M', '(', 'O', ')', 'Q', 
		'*', 'S', '+', 'U', ',', 'W', '-', 'Y', '.', '[', '/', ']', '\x30', '_', 
		'\x31', '\x61', '\x32', '\x63', '\x33', '\x65', '\x34', 'g', '\x35', 'i', 
		'\x36', 'k', '\x37', 'm', '\x38', 'o', '\x39', 'q', ':', 's', ';', '\x3', 
		'\x2', '\n', '\x4', '\x2', '\v', '\v', '\"', '\"', '\x4', '\x2', '\f', 
		'\f', '\xF', '\xF', '\x3', '\x2', '\x33', ';', '\x3', '\x2', '\x32', ';', 
		'\x3', '\x2', '$', '$', '\x3', '\x2', ')', ')', '\x5', '\x2', '\x43', 
		'\\', '\x61', '\x61', '\x63', '|', '\x6', '\x2', '\x32', ';', '\x43', 
		'\\', '\x61', '\x61', '\x63', '|', '\x2', '\x1A6', '\x2', '\x3', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', '\x2', '\x11', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1B', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', ')', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', '\x2', '-', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', '\x2', '\x2', '\x31', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x33', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x35', '\x3', '\x2', '\x2', '\x2', '\x2', '\x37', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x39', '\x3', '\x2', '\x2', '\x2', '\x2', ';', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '=', '\x3', '\x2', '\x2', '\x2', '\x2', '?', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x41', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x43', '\x3', '\x2', '\x2', '\x2', '\x2', '\x45', '\x3', '\x2', 
		'\x2', '\x2', '\x2', 'G', '\x3', '\x2', '\x2', '\x2', '\x2', 'I', '\x3', 
		'\x2', '\x2', '\x2', '\x2', 'K', '\x3', '\x2', '\x2', '\x2', '\x2', 'M', 
		'\x3', '\x2', '\x2', '\x2', '\x2', 'O', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'Q', '\x3', '\x2', '\x2', '\x2', '\x2', 'S', '\x3', '\x2', '\x2', '\x2', 
		'\x2', 'U', '\x3', '\x2', '\x2', '\x2', '\x2', 'W', '\x3', '\x2', '\x2', 
		'\x2', '\x2', 'Y', '\x3', '\x2', '\x2', '\x2', '\x2', '[', '\x3', '\x2', 
		'\x2', '\x2', '\x2', ']', '\x3', '\x2', '\x2', '\x2', '\x2', '_', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x61', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x63', '\x3', '\x2', '\x2', '\x2', '\x2', '\x65', '\x3', '\x2', '\x2', 
		'\x2', '\x2', 'g', '\x3', '\x2', '\x2', '\x2', '\x2', 'i', '\x3', '\x2', 
		'\x2', '\x2', '\x2', 'k', '\x3', '\x2', '\x2', '\x2', '\x2', 'm', '\x3', 
		'\x2', '\x2', '\x2', '\x2', 'o', '\x3', '\x2', '\x2', '\x2', '\x2', 'q', 
		'\x3', '\x2', '\x2', '\x2', '\x2', 's', '\x3', '\x2', '\x2', '\x2', '\x3', 
		'u', '\x3', '\x2', '\x2', '\x2', '\x5', '|', '\x3', '\x2', '\x2', '\x2', 
		'\a', '\x81', '\x3', '\x2', '\x2', '\x2', '\t', '\x89', '\x3', '\x2', 
		'\x2', '\x2', '\v', '\x8B', '\x3', '\x2', '\x2', '\x2', '\r', '\x8D', 
		'\x3', '\x2', '\x2', '\x2', '\xF', '\x8F', '\x3', '\x2', '\x2', '\x2', 
		'\x11', '\x91', '\x3', '\x2', '\x2', '\x2', '\x13', '\x93', '\x3', '\x2', 
		'\x2', '\x2', '\x15', '\x95', '\x3', '\x2', '\x2', '\x2', '\x17', '\x97', 
		'\x3', '\x2', '\x2', '\x2', '\x19', '\x99', '\x3', '\x2', '\x2', '\x2', 
		'\x1B', '\x9B', '\x3', '\x2', '\x2', '\x2', '\x1D', '\x9F', '\x3', '\x2', 
		'\x2', '\x2', '\x1F', '\xA1', '\x3', '\x2', '\x2', '\x2', '!', '\xA3', 
		'\x3', '\x2', '\x2', '\x2', '#', '\xA6', '\x3', '\x2', '\x2', '\x2', '%', 
		'\xA9', '\x3', '\x2', '\x2', '\x2', '\'', '\xAC', '\x3', '\x2', '\x2', 
		'\x2', ')', '\xAF', '\x3', '\x2', '\x2', '\x2', '+', '\xB1', '\x3', '\x2', 
		'\x2', '\x2', '-', '\xB5', '\x3', '\x2', '\x2', '\x2', '/', '\xB8', '\x3', 
		'\x2', '\x2', '\x2', '\x31', '\xBA', '\x3', '\x2', '\x2', '\x2', '\x33', 
		'\xBC', '\x3', '\x2', '\x2', '\x2', '\x35', '\xC5', '\x3', '\x2', '\x2', 
		'\x2', '\x37', '\xC7', '\x3', '\x2', '\x2', '\x2', '\x39', '\xC9', '\x3', 
		'\x2', '\x2', '\x2', ';', '\xCB', '\x3', '\x2', '\x2', '\x2', '=', '\xD2', 
		'\x3', '\x2', '\x2', '\x2', '?', '\xD7', '\x3', '\x2', '\x2', '\x2', '\x41', 
		'\xE0', '\x3', '\x2', '\x2', '\x2', '\x43', '\xE6', '\x3', '\x2', '\x2', 
		'\x2', '\x45', '\xEF', '\x3', '\x2', '\x2', '\x2', 'G', '\xF6', '\x3', 
		'\x2', '\x2', '\x2', 'I', '\xFD', '\x3', '\x2', '\x2', '\x2', 'K', '\x102', 
		'\x3', '\x2', '\x2', '\x2', 'M', '\x104', '\x3', '\x2', '\x2', '\x2', 
		'O', '\x10D', '\x3', '\x2', '\x2', '\x2', 'Q', '\x110', '\x3', '\x2', 
		'\x2', '\x2', 'S', '\x118', '\x3', '\x2', '\x2', '\x2', 'U', '\x11D', 
		'\x3', '\x2', '\x2', '\x2', 'W', '\x123', '\x3', '\x2', '\x2', '\x2', 
		'Y', '\x12B', '\x3', '\x2', '\x2', '\x2', '[', '\x12E', '\x3', '\x2', 
		'\x2', '\x2', ']', '\x131', '\x3', '\x2', '\x2', '\x2', '_', '\x134', 
		'\x3', '\x2', '\x2', '\x2', '\x61', '\x137', '\x3', '\x2', '\x2', '\x2', 
		'\x63', '\x13A', '\x3', '\x2', '\x2', '\x2', '\x65', '\x13F', '\x3', '\x2', 
		'\x2', '\x2', 'g', '\x145', '\x3', '\x2', '\x2', '\x2', 'i', '\x14C', 
		'\x3', '\x2', '\x2', '\x2', 'k', '\x166', '\x3', '\x2', '\x2', '\x2', 
		'm', '\x181', '\x3', '\x2', '\x2', '\x2', 'o', '\x18C', '\x3', '\x2', 
		'\x2', '\x2', 'q', '\x18E', '\x3', '\x2', '\x2', '\x2', 's', '\x192', 
		'\x3', '\x2', '\x2', '\x2', 'u', 'v', '\a', 'p', '\x2', '\x2', 'v', 'w', 
		'\a', 'w', '\x2', '\x2', 'w', 'x', '\a', 'o', '\x2', '\x2', 'x', 'y', 
		'\a', '\x64', '\x2', '\x2', 'y', 'z', '\a', 'g', '\x2', '\x2', 'z', '{', 
		'\a', 't', '\x2', '\x2', '{', '\x4', '\x3', '\x2', '\x2', '\x2', '|', 
		'}', '\a', 'v', '\x2', '\x2', '}', '~', '\a', 'g', '\x2', '\x2', '~', 
		'\x7F', '\a', 'z', '\x2', '\x2', '\x7F', '\x80', '\a', 'v', '\x2', '\x2', 
		'\x80', '\x6', '\x3', '\x2', '\x2', '\x2', '\x81', '\x82', '\a', '\x64', 
		'\x2', '\x2', '\x82', '\x83', '\a', 'q', '\x2', '\x2', '\x83', '\x84', 
		'\a', 'q', '\x2', '\x2', '\x84', '\x85', '\a', 'n', '\x2', '\x2', '\x85', 
		'\x86', '\a', 'g', '\x2', '\x2', '\x86', '\x87', '\a', '\x63', '\x2', 
		'\x2', '\x87', '\x88', '\a', 'p', '\x2', '\x2', '\x88', '\b', '\x3', '\x2', 
		'\x2', '\x2', '\x89', '\x8A', '\a', '>', '\x2', '\x2', '\x8A', '\n', '\x3', 
		'\x2', '\x2', '\x2', '\x8B', '\x8C', '\a', '@', '\x2', '\x2', '\x8C', 
		'\f', '\x3', '\x2', '\x2', '\x2', '\x8D', '\x8E', '\a', ']', '\x2', '\x2', 
		'\x8E', '\xE', '\x3', '\x2', '\x2', '\x2', '\x8F', '\x90', '\a', '_', 
		'\x2', '\x2', '\x90', '\x10', '\x3', '\x2', '\x2', '\x2', '\x91', '\x92', 
		'\a', '*', '\x2', '\x2', '\x92', '\x12', '\x3', '\x2', '\x2', '\x2', '\x93', 
		'\x94', '\a', '+', '\x2', '\x2', '\x94', '\x14', '\x3', '\x2', '\x2', 
		'\x2', '\x95', '\x96', '\a', '/', '\x2', '\x2', '\x96', '\x16', '\x3', 
		'\x2', '\x2', '\x2', '\x97', '\x98', '\a', '`', '\x2', '\x2', '\x98', 
		'\x18', '\x3', '\x2', '\x2', '\x2', '\x99', '\x9A', '\a', '\x31', '\x2', 
		'\x2', '\x9A', '\x1A', '\x3', '\x2', '\x2', '\x2', '\x9B', '\x9C', '\a', 
		'o', '\x2', '\x2', '\x9C', '\x9D', '\a', 'q', '\x2', '\x2', '\x9D', '\x9E', 
		'\a', '\x66', '\x2', '\x2', '\x9E', '\x1C', '\x3', '\x2', '\x2', '\x2', 
		'\x9F', '\xA0', '\a', ',', '\x2', '\x2', '\xA0', '\x1E', '\x3', '\x2', 
		'\x2', '\x2', '\xA1', '\xA2', '\a', '-', '\x2', '\x2', '\xA2', ' ', '\x3', 
		'\x2', '\x2', '\x2', '\xA3', '\xA4', '\a', '?', '\x2', '\x2', '\xA4', 
		'\xA5', '\a', '?', '\x2', '\x2', '\xA5', '\"', '\x3', '\x2', '\x2', '\x2', 
		'\xA6', '\xA7', '\a', '#', '\x2', '\x2', '\xA7', '\xA8', '\a', '?', '\x2', 
		'\x2', '\xA8', '$', '\x3', '\x2', '\x2', '\x2', '\xA9', '\xAA', '\a', 
		'@', '\x2', '\x2', '\xAA', '\xAB', '\a', '?', '\x2', '\x2', '\xAB', '&', 
		'\x3', '\x2', '\x2', '\x2', '\xAC', '\xAD', '\a', '>', '\x2', '\x2', '\xAD', 
		'\xAE', '\a', '?', '\x2', '\x2', '\xAE', '(', '\x3', '\x2', '\x2', '\x2', 
		'\xAF', '\xB0', '\a', '#', '\x2', '\x2', '\xB0', '*', '\x3', '\x2', '\x2', 
		'\x2', '\xB1', '\xB2', '\a', '\x63', '\x2', '\x2', '\xB2', '\xB3', '\a', 
		'p', '\x2', '\x2', '\xB3', '\xB4', '\a', '\x66', '\x2', '\x2', '\xB4', 
		',', '\x3', '\x2', '\x2', '\x2', '\xB5', '\xB6', '\a', 'q', '\x2', '\x2', 
		'\xB6', '\xB7', '\a', 't', '\x2', '\x2', '\xB7', '.', '\x3', '\x2', '\x2', 
		'\x2', '\xB8', '\xB9', '\a', '\x30', '\x2', '\x2', '\xB9', '\x30', '\x3', 
		'\x2', '\x2', '\x2', '\xBA', '\xBB', '\a', '?', '\x2', '\x2', '\xBB', 
		'\x32', '\x3', '\x2', '\x2', '\x2', '\xBC', '\xBD', '\a', '\x65', '\x2', 
		'\x2', '\xBD', '\xBE', '\a', 'q', '\x2', '\x2', '\xBE', '\xBF', '\a', 
		'p', '\x2', '\x2', '\xBF', '\xC0', '\a', 'u', '\x2', '\x2', '\xC0', '\xC1', 
		'\a', 'v', '\x2', '\x2', '\xC1', '\xC2', '\a', '\x63', '\x2', '\x2', '\xC2', 
		'\xC3', '\a', 'p', '\x2', '\x2', '\xC3', '\xC4', '\a', 'v', '\x2', '\x2', 
		'\xC4', '\x34', '\x3', '\x2', '\x2', '\x2', '\xC5', '\xC6', '\a', '}', 
		'\x2', '\x2', '\xC6', '\x36', '\x3', '\x2', '\x2', '\x2', '\xC7', '\xC8', 
		'\a', '.', '\x2', '\x2', '\xC8', '\x38', '\x3', '\x2', '\x2', '\x2', '\xC9', 
		'\xCA', '\a', '\x7F', '\x2', '\x2', '\xCA', ':', '\x3', '\x2', '\x2', 
		'\x2', '\xCB', '\xCC', '\a', 'u', '\x2', '\x2', '\xCC', '\xCD', '\a', 
		'v', '\x2', '\x2', '\xCD', '\xCE', '\a', 't', '\x2', '\x2', '\xCE', '\xCF', 
		'\a', 'w', '\x2', '\x2', '\xCF', '\xD0', '\a', '\x65', '\x2', '\x2', '\xD0', 
		'\xD1', '\a', 'v', '\x2', '\x2', '\xD1', '<', '\x3', '\x2', '\x2', '\x2', 
		'\xD2', '\xD3', '\a', 'g', '\x2', '\x2', '\xD3', '\xD4', '\a', 'p', '\x2', 
		'\x2', '\xD4', '\xD5', '\a', 'w', '\x2', '\x2', '\xD5', '\xD6', '\a', 
		'o', '\x2', '\x2', '\xD6', '>', '\x3', '\x2', '\x2', '\x2', '\xD7', '\xD8', 
		'\a', 'h', '\x2', '\x2', '\xD8', '\xD9', '\a', 'w', '\x2', '\x2', '\xD9', 
		'\xDA', '\a', 'p', '\x2', '\x2', '\xDA', '\xDB', '\a', '\x65', '\x2', 
		'\x2', '\xDB', '\xDC', '\a', 'v', '\x2', '\x2', '\xDC', '\xDD', '\a', 
		'k', '\x2', '\x2', '\xDD', '\xDE', '\a', 'q', '\x2', '\x2', '\xDE', '\xDF', 
		'\a', 'p', '\x2', '\x2', '\xDF', '@', '\x3', '\x2', '\x2', '\x2', '\xE0', 
		'\xE1', '\a', '\x64', '\x2', '\x2', '\xE1', '\xE2', '\a', 't', '\x2', 
		'\x2', '\xE2', '\xE3', '\a', 'g', '\x2', '\x2', '\xE3', '\xE4', '\a', 
		'\x63', '\x2', '\x2', '\xE4', '\xE5', '\a', 'm', '\x2', '\x2', '\xE5', 
		'\x42', '\x3', '\x2', '\x2', '\x2', '\xE6', '\xE7', '\a', '\x65', '\x2', 
		'\x2', '\xE7', '\xE8', '\a', 'q', '\x2', '\x2', '\xE8', '\xE9', '\a', 
		'p', '\x2', '\x2', '\xE9', '\xEA', '\a', 'v', '\x2', '\x2', '\xEA', '\xEB', 
		'\a', 'k', '\x2', '\x2', '\xEB', '\xEC', '\a', 'p', '\x2', '\x2', '\xEC', 
		'\xED', '\a', 'w', '\x2', '\x2', '\xED', '\xEE', '\a', 'g', '\x2', '\x2', 
		'\xEE', '\x44', '\x3', '\x2', '\x2', '\x2', '\xEF', '\xF0', '\a', 't', 
		'\x2', '\x2', '\xF0', '\xF1', '\a', 'g', '\x2', '\x2', '\xF1', '\xF2', 
		'\a', 'v', '\x2', '\x2', '\xF2', '\xF3', '\a', 'w', '\x2', '\x2', '\xF3', 
		'\xF4', '\a', 't', '\x2', '\x2', '\xF4', '\xF5', '\a', 'p', '\x2', '\x2', 
		'\xF5', '\x46', '\x3', '\x2', '\x2', '\x2', '\xF6', '\xF7', '\a', 'u', 
		'\x2', '\x2', '\xF7', '\xF8', '\a', 'y', '\x2', '\x2', '\xF8', '\xF9', 
		'\a', 'k', '\x2', '\x2', '\xF9', '\xFA', '\a', 'v', '\x2', '\x2', '\xFA', 
		'\xFB', '\a', '\x65', '\x2', '\x2', '\xFB', '\xFC', '\a', 'j', '\x2', 
		'\x2', '\xFC', 'H', '\x3', '\x2', '\x2', '\x2', '\xFD', '\xFE', '\a', 
		'\x65', '\x2', '\x2', '\xFE', '\xFF', '\a', '\x63', '\x2', '\x2', '\xFF', 
		'\x100', '\a', 'u', '\x2', '\x2', '\x100', '\x101', '\a', 'g', '\x2', 
		'\x2', '\x101', 'J', '\x3', '\x2', '\x2', '\x2', '\x102', '\x103', '\a', 
		'<', '\x2', '\x2', '\x103', 'L', '\x3', '\x2', '\x2', '\x2', '\x104', 
		'\x105', '\a', '\x66', '\x2', '\x2', '\x105', '\x106', '\a', 'g', '\x2', 
		'\x2', '\x106', '\x107', '\a', 'h', '\x2', '\x2', '\x107', '\x108', '\a', 
		'\x63', '\x2', '\x2', '\x108', '\x109', '\a', 'w', '\x2', '\x2', '\x109', 
		'\x10A', '\a', 'n', '\x2', '\x2', '\x10A', '\x10B', '\a', 'v', '\x2', 
		'\x2', '\x10B', '\x10C', '\a', '<', '\x2', '\x2', '\x10C', 'N', '\x3', 
		'\x2', '\x2', '\x2', '\x10D', '\x10E', '\a', 'k', '\x2', '\x2', '\x10E', 
		'\x10F', '\a', 'h', '\x2', '\x2', '\x10F', 'P', '\x3', '\x2', '\x2', '\x2', 
		'\x110', '\x111', '\a', 'g', '\x2', '\x2', '\x111', '\x112', '\a', 'n', 
		'\x2', '\x2', '\x112', '\x113', '\a', 'u', '\x2', '\x2', '\x113', '\x114', 
		'\a', 'g', '\x2', '\x2', '\x114', '\x115', '\a', '\"', '\x2', '\x2', '\x115', 
		'\x116', '\a', 'k', '\x2', '\x2', '\x116', '\x117', '\a', 'h', '\x2', 
		'\x2', '\x117', 'R', '\x3', '\x2', '\x2', '\x2', '\x118', '\x119', '\a', 
		'g', '\x2', '\x2', '\x119', '\x11A', '\a', 'n', '\x2', '\x2', '\x11A', 
		'\x11B', '\a', 'u', '\x2', '\x2', '\x11B', '\x11C', '\a', 'g', '\x2', 
		'\x2', '\x11C', 'T', '\x3', '\x2', '\x2', '\x2', '\x11D', '\x11E', '\a', 
		'y', '\x2', '\x2', '\x11E', '\x11F', '\a', 'j', '\x2', '\x2', '\x11F', 
		'\x120', '\a', 'k', '\x2', '\x2', '\x120', '\x121', '\a', 'n', '\x2', 
		'\x2', '\x121', '\x122', '\a', 'g', '\x2', '\x2', '\x122', 'V', '\x3', 
		'\x2', '\x2', '\x2', '\x123', '\x124', '\a', 'h', '\x2', '\x2', '\x124', 
		'\x125', '\a', 'q', '\x2', '\x2', '\x125', '\x126', '\a', 't', '\x2', 
		'\x2', '\x126', '\x127', '\a', 'g', '\x2', '\x2', '\x127', '\x128', '\a', 
		'\x63', '\x2', '\x2', '\x128', '\x129', '\a', '\x65', '\x2', '\x2', '\x129', 
		'\x12A', '\a', 'j', '\x2', '\x2', '\x12A', 'X', '\x3', '\x2', '\x2', '\x2', 
		'\x12B', '\x12C', '\a', 'k', '\x2', '\x2', '\x12C', '\x12D', '\a', 'p', 
		'\x2', '\x2', '\x12D', 'Z', '\x3', '\x2', '\x2', '\x2', '\x12E', '\x12F', 
		'\a', '-', '\x2', '\x2', '\x12F', '\x130', '\a', '?', '\x2', '\x2', '\x130', 
		'\\', '\x3', '\x2', '\x2', '\x2', '\x131', '\x132', '\a', '/', '\x2', 
		'\x2', '\x132', '\x133', '\a', '?', '\x2', '\x2', '\x133', '^', '\x3', 
		'\x2', '\x2', '\x2', '\x134', '\x135', '\a', ',', '\x2', '\x2', '\x135', 
		'\x136', '\a', '?', '\x2', '\x2', '\x136', '`', '\x3', '\x2', '\x2', '\x2', 
		'\x137', '\x138', '\a', '\x31', '\x2', '\x2', '\x138', '\x139', '\a', 
		'?', '\x2', '\x2', '\x139', '\x62', '\x3', '\x2', '\x2', '\x2', '\x13A', 
		'\x13B', '\a', 'n', '\x2', '\x2', '\x13B', '\x13C', '\a', 'k', '\x2', 
		'\x2', '\x13C', '\x13D', '\a', 'u', '\x2', '\x2', '\x13D', '\x13E', '\a', 
		'v', '\x2', '\x2', '\x13E', '\x64', '\x3', '\x2', '\x2', '\x2', '\x13F', 
		'\x140', '\a', 'x', '\x2', '\x2', '\x140', '\x141', '\a', 'q', '\x2', 
		'\x2', '\x141', '\x142', '\a', 'k', '\x2', '\x2', '\x142', '\x143', '\a', 
		'\x66', '\x2', '\x2', '\x143', '\x66', '\x3', '\x2', '\x2', '\x2', '\x144', 
		'\x146', '\t', '\x2', '\x2', '\x2', '\x145', '\x144', '\x3', '\x2', '\x2', 
		'\x2', '\x146', '\x147', '\x3', '\x2', '\x2', '\x2', '\x147', '\x145', 
		'\x3', '\x2', '\x2', '\x2', '\x147', '\x148', '\x3', '\x2', '\x2', '\x2', 
		'\x148', '\x149', '\x3', '\x2', '\x2', '\x2', '\x149', '\x14A', '\b', 
		'\x34', '\x2', '\x2', '\x14A', 'h', '\x3', '\x2', '\x2', '\x2', '\x14B', 
		'\x14D', '\t', '\x3', '\x2', '\x2', '\x14C', '\x14B', '\x3', '\x2', '\x2', 
		'\x2', '\x14D', '\x14E', '\x3', '\x2', '\x2', '\x2', '\x14E', '\x14C', 
		'\x3', '\x2', '\x2', '\x2', '\x14E', '\x14F', '\x3', '\x2', '\x2', '\x2', 
		'\x14F', '\x158', '\x3', '\x2', '\x2', '\x2', '\x150', '\x152', '\x5', 
		'g', '\x34', '\x2', '\x151', '\x153', '\t', '\x3', '\x2', '\x2', '\x152', 
		'\x151', '\x3', '\x2', '\x2', '\x2', '\x153', '\x154', '\x3', '\x2', '\x2', 
		'\x2', '\x154', '\x152', '\x3', '\x2', '\x2', '\x2', '\x154', '\x155', 
		'\x3', '\x2', '\x2', '\x2', '\x155', '\x157', '\x3', '\x2', '\x2', '\x2', 
		'\x156', '\x150', '\x3', '\x2', '\x2', '\x2', '\x157', '\x15A', '\x3', 
		'\x2', '\x2', '\x2', '\x158', '\x156', '\x3', '\x2', '\x2', '\x2', '\x158', 
		'\x159', '\x3', '\x2', '\x2', '\x2', '\x159', 'j', '\x3', '\x2', '\x2', 
		'\x2', '\x15A', '\x158', '\x3', '\x2', '\x2', '\x2', '\x15B', '\x167', 
		'\a', '\x32', '\x2', '\x2', '\x15C', '\x15E', '\a', '/', '\x2', '\x2', 
		'\x15D', '\x15C', '\x3', '\x2', '\x2', '\x2', '\x15D', '\x15E', '\x3', 
		'\x2', '\x2', '\x2', '\x15E', '\x15F', '\x3', '\x2', '\x2', '\x2', '\x15F', 
		'\x163', '\t', '\x4', '\x2', '\x2', '\x160', '\x162', '\t', '\x5', '\x2', 
		'\x2', '\x161', '\x160', '\x3', '\x2', '\x2', '\x2', '\x162', '\x165', 
		'\x3', '\x2', '\x2', '\x2', '\x163', '\x161', '\x3', '\x2', '\x2', '\x2', 
		'\x163', '\x164', '\x3', '\x2', '\x2', '\x2', '\x164', '\x167', '\x3', 
		'\x2', '\x2', '\x2', '\x165', '\x163', '\x3', '\x2', '\x2', '\x2', '\x166', 
		'\x15B', '\x3', '\x2', '\x2', '\x2', '\x166', '\x15D', '\x3', '\x2', '\x2', 
		'\x2', '\x167', '\x16F', '\x3', '\x2', '\x2', '\x2', '\x168', '\x16C', 
		'\a', '\x30', '\x2', '\x2', '\x169', '\x16B', '\t', '\x5', '\x2', '\x2', 
		'\x16A', '\x169', '\x3', '\x2', '\x2', '\x2', '\x16B', '\x16E', '\x3', 
		'\x2', '\x2', '\x2', '\x16C', '\x16A', '\x3', '\x2', '\x2', '\x2', '\x16C', 
		'\x16D', '\x3', '\x2', '\x2', '\x2', '\x16D', '\x170', '\x3', '\x2', '\x2', 
		'\x2', '\x16E', '\x16C', '\x3', '\x2', '\x2', '\x2', '\x16F', '\x168', 
		'\x3', '\x2', '\x2', '\x2', '\x16F', '\x170', '\x3', '\x2', '\x2', '\x2', 
		'\x170', 'l', '\x3', '\x2', '\x2', '\x2', '\x171', '\x175', '\a', '$', 
		'\x2', '\x2', '\x172', '\x174', '\n', '\x6', '\x2', '\x2', '\x173', '\x172', 
		'\x3', '\x2', '\x2', '\x2', '\x174', '\x177', '\x3', '\x2', '\x2', '\x2', 
		'\x175', '\x173', '\x3', '\x2', '\x2', '\x2', '\x175', '\x176', '\x3', 
		'\x2', '\x2', '\x2', '\x176', '\x178', '\x3', '\x2', '\x2', '\x2', '\x177', 
		'\x175', '\x3', '\x2', '\x2', '\x2', '\x178', '\x182', '\a', '$', '\x2', 
		'\x2', '\x179', '\x17D', '\a', ')', '\x2', '\x2', '\x17A', '\x17C', '\n', 
		'\a', '\x2', '\x2', '\x17B', '\x17A', '\x3', '\x2', '\x2', '\x2', '\x17C', 
		'\x17F', '\x3', '\x2', '\x2', '\x2', '\x17D', '\x17B', '\x3', '\x2', '\x2', 
		'\x2', '\x17D', '\x17E', '\x3', '\x2', '\x2', '\x2', '\x17E', '\x180', 
		'\x3', '\x2', '\x2', '\x2', '\x17F', '\x17D', '\x3', '\x2', '\x2', '\x2', 
		'\x180', '\x182', '\a', ')', '\x2', '\x2', '\x181', '\x171', '\x3', '\x2', 
		'\x2', '\x2', '\x181', '\x179', '\x3', '\x2', '\x2', '\x2', '\x182', 'n', 
		'\x3', '\x2', '\x2', '\x2', '\x183', '\x184', '\a', 'v', '\x2', '\x2', 
		'\x184', '\x185', '\a', 't', '\x2', '\x2', '\x185', '\x186', '\a', 'w', 
		'\x2', '\x2', '\x186', '\x18D', '\a', 'g', '\x2', '\x2', '\x187', '\x188', 
		'\a', 'h', '\x2', '\x2', '\x188', '\x189', '\a', '\x63', '\x2', '\x2', 
		'\x189', '\x18A', '\a', 'n', '\x2', '\x2', '\x18A', '\x18B', '\a', 'u', 
		'\x2', '\x2', '\x18B', '\x18D', '\a', 'g', '\x2', '\x2', '\x18C', '\x183', 
		'\x3', '\x2', '\x2', '\x2', '\x18C', '\x187', '\x3', '\x2', '\x2', '\x2', 
		'\x18D', 'p', '\x3', '\x2', '\x2', '\x2', '\x18E', '\x18F', '\a', 'P', 
		'\x2', '\x2', '\x18F', '\x190', '\a', '\x63', '\x2', '\x2', '\x190', '\x191', 
		'\a', 'P', '\x2', '\x2', '\x191', 'r', '\x3', '\x2', '\x2', '\x2', '\x192', 
		'\x196', '\t', '\b', '\x2', '\x2', '\x193', '\x195', '\t', '\t', '\x2', 
		'\x2', '\x194', '\x193', '\x3', '\x2', '\x2', '\x2', '\x195', '\x198', 
		'\x3', '\x2', '\x2', '\x2', '\x196', '\x194', '\x3', '\x2', '\x2', '\x2', 
		'\x196', '\x197', '\x3', '\x2', '\x2', '\x2', '\x197', 't', '\x3', '\x2', 
		'\x2', '\x2', '\x198', '\x196', '\x3', '\x2', '\x2', '\x2', '\x11', '\x2', 
		'\x147', '\x14E', '\x154', '\x158', '\x15D', '\x163', '\x166', '\x16C', 
		'\x16F', '\x175', '\x17D', '\x181', '\x18C', '\x196', '\x3', '\x2', '\x3', 
		'\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}