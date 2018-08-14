#!/bin/bash

if [ -d classes ]; then
    rm -rf classes;
fi
mkdir classes
javac -cp $JAVA_HOME/lib/tools.jar com/wk/tool/Getter* -d classes/
javac -cp classes -d classes -processor com.wk.tool.processor.GetterProcessor com/wk/tool/App.java
javap -p classes com/wk/tool/App.class
java -cp classes com.wk.tool.App
