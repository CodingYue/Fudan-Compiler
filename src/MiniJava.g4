grammar MiniJava;

goal
    : program
    ;

program
    : mainClass ( classDeclaration )* EOF
    ;

mainClass
    : 'class' name=Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{'statement '}' '}'
    ;

classDeclaration
    : 'class' name=Identifier ('extends' ext=Identifier)? '{' (varDeclaration)* (methodDeclaration)* '}'
    ;

varDeclaration
    : type name=Identifier ';'
    ;

methodDeclaration
    : 'public' returnType=type name=Identifier '(' parameter? ')' '{' (varDeclaration)* (statement)* 'return' expression ';' '}'
    ;

parameter
    : parameterType=type name=Identifier
    | parameterType=type name=Identifier ',' parameter
    ;

type
    : 'int' '[' ']'
    | 'boolean'
    | 'int'
    | Identifier
    ;

statement
    : '{' (statement)* '}'
    | ifStatement
    | whileStatement
    | printStatement
    | assignStatement
    | arrayAssignStatement
    ;

ifStatement
    : 'if' '(' expression ')' statement 'else' statement
    ;

whileStatement
    : 'while' '(' expression ')' statement
    ;

printStatement
    : 'System.out.println' '(' expression ')' ';'
    ;

assignStatement
    : Identifier '=' expression ';'
    ;

arrayAssignStatement
    : Identifier address '=' expression ';'
    ;

call
    : '.' Identifier '(' ( expression ( ',' expression )* )? ')'
    ;

address
    : '[' expression ']'
    ;

Identifier
    : Alphabet (Alphabet|Digit|'_')*
    ;
expression
    : atom
    | newClass
    | newIntArray
    | exp1=expression Operator exp2=expression
    | exp=expression address
    | exp=expression length
    | exp=expression call
    | not exp=expression
    | '(' exp=expression ')'
    ;

Operator
    : ('&&' | '<' | '+' | '-' | '*')
    ;

length
    : '.' 'length'
    ;

not
    :'!'
    ;


atom
    : Integer
    | Boolean
    | This
    | Identifier
    ;

newClass
    : 'new' Identifier '(' ')'
    ;

newIntArray
    :  'new' 'int' '[' expression ']'
    ;

Integer
    : Digit+
    ;

Boolean
    : 'true'
    | 'false'
    ;

This
    : 'this'
    ;


Alphabet
    : Lowercase
    | Uppercase
    ;

Lowercase
    : [a-z]
    ;

Uppercase
    : [A-Z]
    ;

Digit
    : [0-9]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

LineComment
    : '//' ~[\r\n]* -> skip
    ;

BlockComment
	: '/*' (BlockComment | ~[*/] | '/' ~[*] | '*' ~[/] )* '*/' -> skip
	;
