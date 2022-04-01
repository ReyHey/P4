JFLEX      = Dependencies/jflex_dependencies/Jflex_Unix_Executable_file/jflex
JAVA       = java
JAVAC      = javac
CUPJAR     = Dependencies/java-cup-11b.jar
CP         = .:$(CUPJAR)
JAVACFLAGS = -cp $(CP)
CUP        = $(JAVA) -jar $(CUPJAR) -expect 1 -parser Parser

# --------------------------------------------------

Simpleton: compile
	$(JAVA) -cp $(CP) Simpleton

testtest: compile
	jdb -cp $(CP) Simpleton

compile: lexer parser
	$(JAVAC) $(JAVACFLAGS) Simpleton.java sym.java Lexer.java Parser.java

parser: Parser.java 

Parser.java: Parser.cup
	$(CUP) -interface Parser.cup

lexer: Lexer.java

Lexer.java: Lexer.flex
	$(JFLEX) Lexer.flex


testLexer: compile lexertest
	java -cp .:java-cup-11b.jar TestLexer input.txt
	 
lexertest:
	javac -cp java-cup-11b.jar TestLexer.java sym.java Lexer.java

clean:
	rm -f *.class
	rm -f *~
	rm -f Lexer.java
	rm -f Parser.java
	rm -f sym.java
