package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        System.out.println("\nWelcome to the Brain games!");
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}