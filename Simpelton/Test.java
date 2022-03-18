import java_cup.runtime.*;

public class Test {
	public static void main(String[] args) {
		Lexer.init();
		for (String s : Lexer.next_token()) {
			System.out.println(s);
		}
	}
}