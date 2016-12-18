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

expression
    : expression ('&&' | '<' | '+' | '-' | '*') expression
    | expression '[' expression ']'
    | expression '.' 'length'
    | expression '.' Identifier '(' ( expression ( ',' expression )* )? ')'
    | Digit+
    | 'true'
    | 'false'
    | 'this'
    | 'new' 'int' '[' expression ']'
    | 'new' Identifier '(' ')'
    | '!' expression
    | '(' expression ')'
    | Identifier
    ;

Identifier
    : Alphabet (Alphabet|Digit|'_')*
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