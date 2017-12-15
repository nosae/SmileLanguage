grammar Smile;  // A tiny subset of Pascal

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program   : header mainBlock '.' ;
header    : PROGRAM IDENTIFIER ';' ;
mainBlock : block;
block     : declarations compoundStmt ;

declarations : VAR declList ';)' ;
declList     : decl ( ';)' decl )* ;
decl         : varList ':)' typeId ;
varList      : varId ( ',' varId )* ;
varId        : IDENTIFIER ;
typeId       : IDENTIFIER ;

compoundStmt : START stmtList STOP ;

stmt : compoundStmt
     | assignmentStmt
     | ifStatement
     | printStmt
     | whileStatement
     ;
     
stmtList       : stmt ( ';)' stmt )* ';)';
assignmentStmt : variable '=)' expr ;
ifStatement    : IF expr THEN stmt ( ELSE stmt )? ;
whileStatement : WHILE expr DO stmtList 'END';
printStmt      : 'print' '_'? parenthesis;
parenthesis : '(' literal* ((',' | '+')? literal)* ')' ;
literal : exprLiteral | stringLiteral;
stringLiteral locals [ TypeSpec type = null ]
    : STRING               
    ;
exprLiteral locals [ TypeSpec type = null ]
	: expr
	;

variable : IDENTIFIER ;



expr locals [ TypeSpec type = null ]
    : expr mulDivOp expr   # mulDivExpr
    | expr addSubOp expr   # addSubExpr
    | expr relOp expr      # relOpExpr
    | number               # unsignedNumberExpr
    | signedNumber         # signedNumberExpr
    | variable             # variableExpr
    | '(' expr ')'         # parenExpr
    ;
     
mulDivOp : MUL_OP | DIV_OP ;
addSubOp : ADD_OP | SUB_OP ;
relOp	 : EQ | NE | LT | GT ;
     
signedNumber locals [ TypeSpec type = null ] 
    : sign number 
    ;
sign : ADD_OP | SUB_OP ;

number locals [ TypeSpec type = null ]
    : INTEGER    # integerConst
    | FLOAT      # floatConst
    ;

PROGRAM : 'PROGRAM' ;
VAR     : 'VAR' ;
START   : 'START' ;
STOP    : 'STOP' ;
IF      : 'IF' ;
WHILE	: 'WHILE' ;
DO		: 'DO'	;
THEN    : 'THEN' ;
ELSE    : 'ELSE' ;
PRINT   : 'PRINT' ;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER    : [0-9]+ ;
FLOAT      : [0-9]+ '.' [0-9]+ ;
STRING     : '"' ~('\r' | '\n' | '"')* '"' 
        |	'\'' ~('\r' | '\n' | '"')* '\'';

MUL_OP :   '*' ;
DIV_OP :   '/' ;
ADD_OP :   '+' ;
SUB_OP :   '-' ;


EQ :  '==' ;
NE :  '!=' ;
LT :  '<'  ;
GT :  '>'  ;

NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ; 