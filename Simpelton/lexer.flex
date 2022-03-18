import java_cup.runtime.*;

%%

%class Lexer
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
"break"							{ return symbol( sym.BREAK		); }
"continue"						{ return symbol( sym.CONTINUE	); }
"return"						{ return symbol( sym.RETURN		); }
"in"							{ return symbol( sym.IN			); }
"function"						{ return symbol( sym.FUNCTION	); }
"constant"						{ return symbol( sym.CONSTANT	); }

/* types */
"integer"						{ return symbol( sym.INTEGER	); }
"decimal"						{ return symbol( sym.DECIMAL	); }
"string"						{ return symbol( sym.STRING		); }
"boolean"						{ return symbol( sym.BOOLEAN	); }
"list"							{ return symbol( sym.LIST		); }
"void"							{ return symbol( sym.VOID		); }

/* user defined types */
"enum" 							{ return symbol( sym.ENUM 		); }
"struct"						{ return symbol( sym.STRUCT 	); }

/* literals */
{IntegerValue}					{ return symbol( sym.INTEGERLIT	); }
{DecimalValue}					{ return symbol( sym.DECIMALLIT	); }
{BooleanValue}					{ return symbol( sym.BOOLEANLIT	); }
{StringValue}					{ return symbol( sym.STRINGLIT 	); }
"NaN"							{ return symbol( sym.NAN		); }

/* operators */
"="								{ return symbol( sym.EQ			); }
"=="							{ return symbol( sym.EQEQ 		); }
"!="							{ return symbol( sym.NOTEQ		); }
"+"								{ return symbol( sym.PLUS		); }
"+="							{ return symbol( sym.PLUSEQ 	); }
"-"								{ return symbol( sym.MINUS	 	); }
"-="							{ return symbol( sym.MINUSEQ 	); }
"*"								{ return symbol( sym.TIMES	 	); }
"*="							{ return symbol( sym.TIMESEQ 	); }
"/"								{ return symbol( sym.DIVISION 	); }
"/="							{ return symbol( sym.DIVISIONEQ	); }
"("								{ return symbol( sym.LPAREN 	); }
")"								{ return symbol( sym.RPAREN 	); }
"{"								{ return symbol( sym.LCURLY 	); }
"}"								{ return symbol( sym.RCURLY 	); }
"["								{ return symbol( sym.LSQURE 	); }
"]"								{ return symbol( sym.RSQURE 	); }
"<"								{ return symbol( sym.LANGLE 	); }
">"								{ return symbol( sym.RANGLE 	); }
"<="							{ return symbol( sym.LEQ 		); }
">="							{ return symbol( sym.GEQ 		); }
"!"								{ return symbol( sym.NOT 		); }
"mod"							{ return symbol( sym.MOD 		); }
"or"							{ return symbol( sym.OR 		); }
"and"							{ return symbol( sym.AND 		); }
"sqrt"							{ return symbol( sym.SQRT 		); }
"cbrt"							{ return symbol( sym.CBRT 		); }
"^"								{ return symbol( sym.POW 		); }

/* control structures */
"while"							{ return symbol( sym.WHILE 		); }
"foreach"						{ return symbol( sym.FOREACH 	); }
"switch"						{ return symbol( sym.SWITCH 	); }
"case"							{ return symbol( sym.CASE 		); }

"if"							{ return symbol( sym.IF 		); }
"else"							{ return symbol( sym.ELSE 		); }

/* identifiers */
{Identifier}					{ return symbol( sym.IDENTIFIER	); }

/* comments */
{Comment}						{ /* ignore */ }

/* whitespace */
{WhiteSpace}					{ /* ignore */ }