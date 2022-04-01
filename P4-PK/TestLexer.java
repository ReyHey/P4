/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 2004-2015  Gerwin Klein <lsf@jflex.de>                    *
 * All rights reserved.                                                    *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import java.io.*;
import java_cup.runtime.Symbol;

/**
 * Simple test driver for the java lexer. Just runs it on some input files and produces debug
 * output. Needs symbol class from parser.
 */
public class TestLexer {

  /** some numerals to for lexer testing */
  int intDec = 37;


  public static void main(String[] argv) {
    for (int i = 0; i < argv.length; i++) {
      try {
        System.out.println("Lexing [" + argv[i] + "]");
        Lexer scanner = new Lexer(new FileReader(argv[i]));
        Symbol s;
        do {
          s = scanner.next_token();
          System.out.println("token: " + s.sym);
        } while (s.sym != sym.EOF);

        System.out.println("No errors.");
      } catch (Exception e) {
        e.printStackTrace(System.out);
        System.exit(1);
      }
    }
  }
}
