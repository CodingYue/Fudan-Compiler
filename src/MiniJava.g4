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
    | 'if' '(' expression ')' statement 'else' statement
    | 'while' '(' expression ')' statement
    | 'System.out.println' '(' expression ')' ';'
    | Identifier '=' expression ';'
    | Identifier '[' expression ']' '=' expression ';'
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
    | expression Operator expression
    | expression address
    | expression length
    | expression call
    | not expression
    | '(' expression ')'
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
    :Integer
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