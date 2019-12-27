package jortiz07.helloworld.prework;

import javax.swing.DefaultListSelectionModel;

public class HelloWorld {
  public static void main(String[] args) {
    if (args.length > 0) {
      salute(args[0]);
    }
  }
  private static void salute(String target) {
    System.out.println("Hello, " + target + "!");
  }
}