#!/bin/bash

for file in `ls ./testcase/`; do
    echo Compiling $file
    target=${file%.*}.ast
    java -cp ./out/production/:./antlr-4.6-complete.jar:. MiniJava < ./testcase/$file > ./result/$target
done
