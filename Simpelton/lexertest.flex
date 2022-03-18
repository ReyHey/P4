import java_cup.runtime.*;

%%

%class LexerTest
%unicode
%cup
%line
%column

%{
	StringBuffer string = new StringBuffer();

	private Symbol symbol(int type) {
		return new Symbol(type, yyline, yycolumn);
	}
	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

Identifier = [:jletter:] [:jletterdigit:]*

IntegerValue = 0 | [1-9][0-9]*
DecimalValue = {IntegerValue}(\.[0-9]+)?
BooleanValue = true | false
StringValue  = \"(\\.|[^\"])*\"

%%

/* keywords */
"break"							{ return new Symbol("BREAK"); }
"continue"						{ return "CONTINUE"; }
"return"						{ return "RETURN"; }
"in"							{ return "IN"; }
"function"						{ return "FUNCTION"; }
"constant"						{ return "CONSTANT"; }

/* types */
"integer"						{ return "INTEGER"; }
"decimal"						{ return "DECIMAL"; }
"string"						{ return "STRING"; }
"boolean"						{ return "BOOLEAN"; }
"list"							{ return "LIST"; }
"void"							{ return "VOID"; }

/* user defined types */
"enum" 							{ return "ENUM"; }
"struct"						{ return "STRUCT"; }

/* literals */
{IntegerValue}					{ return "INTEGERLIT"; }
{DecimalValue}					{ return "DECIMALLIT"; }
{BooleanValue}					{ return "BOOLEANLIT"; }
{StringValue}					{ return "STRINGLIT"; }
"NaN"							{ return "NAN"; }

/* operators */
"="								{ return "EQ"; }
"=="							{ return "EQEQ"; }
"!="							{ return "NOTEQ"; }
"+"								{ return "PLUS"; }
"+="							{ return "PLUSEQ"; }
"-"								{ return "MINUS"; }
"-="							{ return "MINUSEQ"; }
"*"								{ return "TIMES"; }
"*="							{ return "TIMESEQ"; }
"/"								{ return "DIVISION"; }
"/="							{ return "DIVISIONEQ"; }
"("								{ return "LPAREN"; }
")"								{ return "RPAREN"; }
"{"								{ return "LCURLY"; }
"}"								{ return "RCURLY"; }
"["								{ return "LSQURE"; }
"]"								{ return "RSQURE"; }
"<"								{ return "LANGLE"; }
">"								{ return "RANGLE"; }
"<="							{ return "LEQ"; }
">="							{ return "GEQ"; }
"!"								{ return "NOT"; }
"mod"							{ return "MOD"; }
"or"							{ return "OR"; }
"and"							{ return "AND"; }
"sqrt"							{ return "SQRT"; }
"cbrt"							{ return "CBRT"; }
"^"								{ return "POW"; }

/* control structures */
"while"							{ return "WHILE"; }
"foreach"						{ return "FOREACH"; }
"switch"						{ return "SWITCH"; }
"case"							{ return "CASE"; }

"if"							{ return "IF"; }
"else"							{ return "ELSE"; }

/* identifiers */
{Identifier}					{ return "IDENTIFIER"; }

/* comments */
{Comment}						{ /* ignore */ }

/* whitespace */
{WhiteSpace}					{ /* ignore */ }