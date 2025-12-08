#!/bin/sh

CP=$CLASSPATH
for jar in *.jar; do CP=$CP:$jar; done

java -cp $CP de.ulbms.scdh.spike.git.Palindrome
