/*Puvikaran*/

import java_cup.runtime.*;

%%

%class Lexer
%public
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
Number = {IntegerValue}(\.[0-9]+)?
BooleanValue = true | false
StringValue  = \"(\\.|[^\"])*\"
filename = (\\.|[^\"])+
%%

/* keywords */
"break"							{ return symbol(sym.BREAK); }
"continue"						{ return symbol(sym.CONTINUE	); }
"return"						{ return symbol(sym.RETURN); }
"in"							{ return symbol( sym.IN			); }
"function"						{ return symbol( sym.FUNCTION	); }
"constant"						{ return symbol( sym.CONSTANT	); }

/* types */
"number"						{ return symbol( sym.NUMBER		); }
"string"						{ return symbol( sym.STRING		); }
"boolean"						{ return symbol( sym.BOOLEAN	); }
"list"							{ return symbol( sym.LIST		); }
"void"							{ return symbol( sym.VOID		); }
"random"						{ return symbol( sym.RANDOM		); }

/* user defined types */
"enum" 							{ return symbol( sym.ENUM 		); }
"struct"						{ return symbol( sym.STRUCT 	); }

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
"["								{ return symbol( sym.LSQUARE 	); }
"]"								{ return symbol( sym.RSQUARE 	); }
"<"								{ return symbol( sym.LANGLE 	); }
">"								{ return symbol( sym.RANGLE 	); }
"<="							{ return symbol( sym.LEQ 		); }
">="							{ return symbol( sym.GEQ 		); }
"!"								{ return symbol( sym.NOT 		); }
"mod"							{ return symbol( sym.MOD 		); }
"or"							{ return symbol( sym.OR 		); }
"and"							{ return symbol( sym.AND 		); }
"^"								{ return symbol( sym.POW 		); }


/* control structures */
"while"							{ return symbol( sym.WHILE 		); }
"foreach"						{ return symbol( sym.FOREACH 	); }
"switch"						{ return symbol( sym.SWITCH 	); }
"case"							{ return symbol( sym.CASE 		); }
"default"						{ return symbol( sym.DEFAULT    ); }
"if"							{ return symbol( sym.IF 		); }
"else"							{ return symbol( sym.ELSE 		); }

/* symbols */
":"								{ return symbol( sym.COLON   ); }
","								{ return symbol( sym.COMMA   ); }
"."								{ return symbol( sym.DOT   	 ); }
{LineTerminator}				{ return symbol( sym.NEWLINE ); }

"include"						{ return symbol( sym.INCLUDE   ); }


/* literals */
{Number}						{ return symbol( sym.NUMBERLIT	); }
{BooleanValue}					{ return symbol( sym.BOOLEANLIT	); }
{StringValue}					{ return symbol( sym.STRINGLIT 	); }
"NaN"							{ return symbol( sym.NAN		); }

/* identifiers */
{Identifier}					{ return symbol( sym.IDENTIFIER	); }


/* comments */
{Comment}						{ /* ignore */ }

/* whitespace */
{WhiteSpace}					{ /* ignore */ }