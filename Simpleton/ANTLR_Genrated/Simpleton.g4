grammar Simpleton;	
program: declaration* EOF;                                                
//includes: 'include' 'string' NEWLINE;

declaration: function_decl
               | struct_decl
               | enum_decl
               | const_variable_decl;

primitiv_type: primitivtType=('number' | 'text' | 'boolean');
type: primitiv_type | LIST '<' primitiv_type '>' | LIST '<' IDENTIFIER '>';

LIST: 'list';

// primitiv_type: NUMBER_TYPE | TEXT_TYPE | BOOlEAN_TYPE;
// type: primitiv_type | LIST '<' primitiv_type '>' | LIST '<' IDENTIFIER '>';

// LIST: 'list';

// NUMBER_TYPE: 'number';
// TEXT_TYPE: 'text';
// BOOlEAN_TYPE: 'boolean';

// a[4+5].ToString()

expr: IDENTIFIER ('[' expr ']')? member*                                                #Identifier
    | constant                                                                          #ConstantLiteral
    | func_call                                                                         #FuncCall
    | NaN='NaN'                                                                         #NaNExpr
    | '(' expr ')'                                                                      #ParensExpr
    | op='-' expr                                                                       #UnaryExpr
    | left=expr op='^' right=expr                                                       #InfixExpr
    | left=expr op=('/'|'mod'|'*') right=expr                                           #InfixExpr
    | left=expr op=('+'|'-') right=expr                                                 #InfixExpr
    | left=expr op=('==' | '!='| '>' | '<' | '>=' | '<=') right=expr                    #InfixExpr
    | op='!' expr                                                                       #UnaryExpr
    | left=expr op=('and'| 'or') right=expr                                             #InfixExpr         
    ;

member: ('.' (IDENTIFIER | func_call));

constant: NUMBER     
        | TEXT
        | BOOlEAN;


variable_decl: (primitiv_type | userDefinedType=IDENTIFIER) vName=IDENTIFIER ('=' expr)? NEWLINE;
const_variable_decl: 'constant' variable_decl;

list_decl: LIST '<' (primitiv_type | innerType=IDENTIFIER) '>' vName=IDENTIFIER ('=' (list_initialize | expr))? NEWLINE;
list_initialize: '{' (expr (',' expr)*)? '}';

struct_decl: 'struct' IDENTIFIER NEWLINE?'{'NEWLINE struct_member+ '}' NEWLINE;
struct_member: type IDENTIFIER NEWLINE;


enum_decl: 'enum' IDENTIFIER NEWLINE?'{'NEWLINE enum_member+ '}' NEWLINE;
enum_member: IDENTIFIER ('=' NUMBER)? NEWLINE;


function_decl               : 'function' returnType=return_type name=IDENTIFIER '(' (formal_parameter (',' formal_parameter)*)? ')' block;
return_type                 : type | VOID | IDENTIFIER;
formal_parameter            : type IDENTIFIER;

VOID: 'void';

stmt: if_else_stmt
    | switch_stmt  
    | while_stmt 
    | foreach_stmt   
    | variable_decl 
    | list_decl
    | const_variable_decl 
//    | random_decl 
    | jump_stmt 
    | expr NEWLINE
    | assign_stmt
    | compound_assign_stmt 
    | ternary_stmt
    ;

jump_stmt   : (return_stmt | jump=('break' | 'continue')) NEWLINE;
return_stmt : 'return' expr?;

switch_stmt: 'switch' expr NEWLINE? '{' NEWLINE switch_case* switch_case_default? '}' NEWLINE;
switch_case: ('case' expr ':')+ NEWLINE stmt* 'break' NEWLINE;
switch_case_default: 'default:' NEWLINE stmt* 'break' NEWLINE;

if_else_stmt: 'if' expr block else_if_stmt* else_stmt?;
else_if_stmt: 'else if' expr block ;
else_stmt: 'else' block;


while_stmt: 'while' expr block;

foreach_stmt: 'foreach' type element=IDENTIFIER 'in' IDENTIFIER('.'IDENTIFIER)* block;

block: NEWLINE? '{' NEWLINE (stmt)+ '}' NEWLINE?;


assign_stmt : IDENTIFIER('.'IDENTIFIER)* '=' expr NEWLINE;

ternary_stmt: IDENTIFIER('.'IDENTIFIER)* '='  ifExpr=expr 'if' cond=expr 'else' elseExpr=expr NEWLINE;
compound_assign_stmt : IDENTIFIER('.'IDENTIFIER)* compoundOP=('+='|'-='|'*='|'/=') expr NEWLINE;

func_call: IDENTIFIER '(' actual_parameter_list? ')';
actual_parameter_list: expr (',' expr)*;

//random_decl: 'random' IDENTIFIER '=' 'random' func_call_type; 


WS : (' ' | '\t')+ -> channel(HIDDEN);
NEWLINE : ([\r\n])+ (WS ([\r\n])+)*;


NUMBER: ('0' | '-'? [1-9][0-9]*) ('.' [0-9]*)?;
TEXT: ('"' ~'"'* '"') | ('\'' ~'\''* '\'');
BOOlEAN: 'true' | 'false';
NAN: 'NaN';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;















// expression            ::= expression logical_symbol deep 
//                         | deep;
// deep                  ::= NOT deeper 
//                         | deeper;
// deeper                ::= arithmetic_expression eval_symbol arithmetic_expression
//                         | arithmetic_expression;
// arithmetic_expression ::= arithmetic_expression PLUS term 
//                         | arithmetic_expression MINUS term 
//                         | term;
// term                  ::= term TIMES factor 
//                         | term DIVISION factor 
//                         | term MOD factor 
//                         | factor;
// factor                ::= factor POW arithmetic_expression 
//                         | base;
// base                  ::= UMINUS value
//                         | value;
// value                 ::= LPAREN expression RPAREN 
//                         | NAN           
//                         | constant
//                         | IDENTIFIER
//                         | IDENTIFIER func_call      
//                         | IDENTIFIER LSQUARE index RSQUARE;         