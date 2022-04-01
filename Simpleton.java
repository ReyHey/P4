import java.io.*;

public class Simpleton {
    public static void main(String[] args){
        try {
            System.out.println("Parsing input.txt");
            Lexer lexer = new Lexer(new FileReader("input.txt"));
            Parser p = new Parser(lexer);
            p.debug_parse();
        }
        catch ( Exception e ) { System.err.println( "Exception at " ); e.printStackTrace();
        }
    }
}
