#!/bin/bash

for file in `ls ./$1/`; do
    echo Compiling $file
    target=${file%.*}.ast
    java -cp ./out/production/:./antlr-4.6-complete.jar:. MiniJava < ./$1/$file > ./result/$target
done
