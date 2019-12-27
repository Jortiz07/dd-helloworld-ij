package jortiz07.helloworld.prework;

import javax.swing.DefaultListSelectionModel;

public class HelloWorld {
  public static void main(String[] args) {
    salute(salutation(args));

    }
    private static String salutation(String[] args) {
    return "Hello, " + ((args.length > 0) ? args[0] : "World");
    }
  private static void salute(String target) {
    System.out.println("Hello, " + target + "!");
  }
}