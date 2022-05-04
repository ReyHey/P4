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

expr: id                                                                                #IdentifierCall
    | constant                                                                          #ConstantLiteral
    | func_call                                                                         #FuncCall
    | NaN='NaN'                                                                         #NaNExpr
    | '(' expr ')'                                                                      #ParensExpr
    | '(' op='-' expr ')'                                                               #UnaryExpr
    | left=expr op='^' right=expr                                                       #InfixExpr
    | left=expr op=('/'|'mod'|'*') right=expr                                           #InfixExpr
    | left=expr op=('+'|'-') right=expr                                                 #InfixExpr
    | left=expr op=('==' | '!='| '>' | '<' | '>=' | '<=') right=expr                    #InfixExpr
    | op='!' expr                                                                       #UnaryExpr
    | left=expr op=('and'| 'or') right=expr                                             #InfixExpr         
    ;

id: id '.' ids | ids;

ids: IDENTIFIER | func_call | subscript;

subscript: IDENTIFIER '[' expr ']';
func_call: IDENTIFIER '(' actual_parameter_list? ')';
actual_parameter_list: expr (',' expr)*;


constant: NUMBER     
        | TEXT
        | BOOlEAN;


variable_decl: (primitiv_type | userDefinedType=IDENTIFIER) vName=IDENTIFIER ('=' expr)? NEWLINE;
const_variable_decl: 'constant' variable_decl;

list_decl: LIST '<' (primitiv_type | innerType=IDENTIFIER) '>' vName=IDENTIFIER ('=' (list_initialize | expr))? NEWLINE;
list_initialize: '{' (expr (',' expr)*)? '}';

struct_decl: 'struct' IDENTIFIER NEWLINE?'{'NEWLINE struct_member+ '}' NEWLINE;
struct_member: type IDENTIFIER NEWLINE;


enum_decl: 'enum' IDENTIFIER NEWLINE?'{'NEWLINE? enum_member(',' enum_member)* '}' NEWLINE;
enum_member: IDENTIFIER ('=' NUMBER)? NEWLINE?;


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
    | jump_stmt 
    | expr NEWLINE
    | assign_stmt
    | compound_assign_stmt 
    | ternary_stmt
    | block
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

foreach_stmt: 'foreach' type element=IDENTIFIER 'in' id block;

block: NEWLINE? '{' NEWLINE (stmt)* '}' NEWLINE?;


assign_stmt : id_assign '=' expr NEWLINE;
ternary_stmt: id_assign '='  ifExpr=expr 'if' cond=expr 'else' elseExpr=expr NEWLINE;
compound_assign_stmt : id_assign compoundOP=('+='|'-='|'*='|'/=') expr NEWLINE;

id_assign : id_assign '.' ids_assign | ids_assign;
ids_assign: IDENTIFIER | subscript;


WS : (' ' | '\t')+ -> channel(HIDDEN);
NEWLINE : COMMENT? ([\r\n])+ (WS? COMMENT? ([\r\n])+)*;
COMMENT : (MULTI_COMMENT | LINE_COMMENT);
MULTI_COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT : '//' ~[\r\n]* -> channel(HIDDEN);

NUMBER: ('0' | [1-9][0-9]*) ('.' [0-9]*)?;
TEXT: ('"' ~'"'* '"') | ('\'' ~'\''* '\'');
BOOlEAN: 'true' | 'false';
NAN: 'NaN';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;