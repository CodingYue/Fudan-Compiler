#!/bin/sh
export CLASSPATH=".:./antlr-4.6-complete.jar:$CLASSPATH"
alias antlr4='java -jar ./antlr-4.6-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'

antlr4 ./src/MiniJava.g4 -visitor

javac -s ./ -d ./out/production/ ./src/*.java ./src/Definition/*.java
