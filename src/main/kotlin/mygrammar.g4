grammar mygrammar;

function: NAME '(' parameters ')' ':' type '{' body '}';
parameters: | paramdecl (',' paramdecl)*;
paramdecl: type NAME;
body: statement* returnstmt;

returnstmt: 'return' expression;
statement: ifstmt | assign;
ifstmt:
  'if' '(' boolexpr5 ')' '{' thenbody '}' 'else' '{' elsebody '}';
thenbody: statement*;
elsebody: statement*;
assign: NAME '=' expression;

expression: intexpr | boolexpr5;

boolexpr5: boolexpr4 | binoplorexpr;
binoplorexpr: boolexpr4 BINOP_LOR boolexpr5;
boolexpr4: boolexpr3 | binoplandexpr;
binoplandexpr: boolexpr3 BINOP_LAND boolexpr4;
boolexpr3: boolexpr2 | intcompareexpr;
intcompareexpr: intexpr (BINOP_LT | BINOP_GT) intexpr;
boolexpr2: boolexpr1 | unopnegateexpr;
unopnegateexpr: UNOP_NEGATION boolexpr2;
boolexpr1: boolliteral | varrefexpr;
boolliteral: TRUE | FALSE;

intexpr: atomintexpr | binopintexpr;
binopintexpr: atomintexpr (BINOP_ADD | BINOP_SUB) intexpr;
atomintexpr: intliteral | varrefexpr;
intliteral: NUMBER;

varrefexpr: NAME;
type: BOOL | INT;

TRUE: 'true';
FALSE: 'false';
BOOL: 'bool';
INT: 'int';
NUMBER: [0-9]+;
BINOP_ADD: '+';
BINOP_SUB: '-';
BINOP_LT: '<';
BINOP_GT: '>';
BINOP_LAND: '&';
BINOP_LOR: '|';
UNOP_NEGATION: '!';
NAME: [a-z]+;

WHITESPACE: [ \t\r\n]+ -> skip;

//grammar mygrammar;
//Function : Name'('Parameters')' ':' Type '{' Body '}';
//Name : [a-z]+;
//Parameters : (Type Var)*;
//Var : Name;
//Type : 'bool' | 'int';
//Body : (Statement)* 'return' Expression;
//Statement : IfStmt | Assign;
//IfStmt : 'if' '(' Expression ')' '{' (Statement)* '}' 'else' '{' (Statement)* '}';
//Assign : Var ':' Expression;
//Expression : Value | Var | Operator Expression;
//Value : [0-9]+ | 'true' | 'false';
//Operator : '+' | '-' | '<' | '>';