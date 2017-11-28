grammar Smile;

parse
 : block EOF
 ;

block
 : (statement)* (Return expression ';)')?
 ;

statement
 : assignment ';)'
 | ifStatement 
 | forStatement
 | whileStatement
 ;

assignment
 : Identifier '=)' expression
 ;


ifStatement
 : ifStat elseIfStat* elseStat? Stop
 ;

ifStat
 : If expression Start block
 ;

elseIfStat
 : Else If expression Start block
 ;

elseStat
 : Else Start block
 ;


forStatement
 : For Identifier '=)' expression To expression Start block Stop
 ;

whileStatement
 : While expression Start block Stop
 ;



expression
 : '-' expression                           #unaryMinusExpression
 | '!' expression                           #notExpression
 | expression '^' expression                #powerExpression
 | expression '*' expression                #multiplyExpression
 | expression '/' expression                #divideExpression
 | expression '%' expression                #modulusExpression
 | expression '+' expression                #addExpression
 | expression '-' expression                #subtractExpression
 | expression '>=' expression               #gtEqExpression
 | expression '<=' expression               #ltEqExpression
 | expression '>' expression                #gtExpression
 | expression '<' expression                #ltExpression
 | expression '==' expression               #eqExpression
 | expression '!=' expression               #notEqExpression
 | expression '&&' expression               #andExpression
 | expression '||' expression               #orExpression
 | expression '?' expression ':' expression #ternaryExpression
 | expression In expression                 #inExpression
 | Number                                   #numberExpression
 | Bool                                     #boolExpression
 | Null                                     #nullExpression
 
 
 | Identifier                   			#identifierExpression
 | String                          			#stringExpression
 | '(' expression ')'          		 		#expressionExpression
 | Input '(' String? ')'                    #inputExpression
 ;



Def      : 'def';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
While    : 'while';
To       : 'to';
Start       : 'start';
Stop      : 'stop';

Input    : 'input';

In       : 'in';
Null     : 'null';

Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';

Or       : '||';
And      : '&&';
Equals   : '=)=)';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';

Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';

SColon   : ';)';
Assign   : '=)';

Comma    : ',';
QMark    : '?';
Colon    : ':';

OBrace   : '{';
CBrace   : '}';
OParen   : '(';
CParen   : ')';

Bool
 : 'true' 
 | 'false'
 ;

Number
 : Int ('.' Digit*)?
 ;

Identifier
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

String
 : ["] (~["\r\n] | '\\\\' | '\\"')* ["]
 | ['] (~['\r\n] | '\\\\' | '\\\'')* [']
 ;

Comment
 : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip
 ;

Space
 : [ \t\r\n\u000C] -> skip
 ;

fragment Int
 : [1-9] Digit*
 | '0'
 ;
  
fragment Digit 
 : [0-9]
 ;