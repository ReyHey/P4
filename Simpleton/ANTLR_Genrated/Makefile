ANTLR = java -jar antlr-4.9.3-complete.jar
GRUN = java org.antlr.v4.gui.TestRig
# --------------------------------------------------

Simpleton:
	ANTLR Simpleton.g4 -Dlanguage=CSharp -visitor

SimpletonTest:
	ANTLR Simpleton.g4
	javac -cp .:antlr-4.9.3-complete.jar Simpleton*.java
	GRUN Simpleton program ../Codesample/Calculator.sm -gui

clean:
	rm -f *.cs
	rm -f *.interp
	rm -f *.tokens
	rm -f *.java
	rm -f *.class
	