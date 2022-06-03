package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameTwo() {
        System.out.println("\nWelcome to the Brain games!");
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 1; i <= 3; i++) {
            int number = (int) Math.round(Math.random() * 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = in.nextLine();
            if ((((number % 2) == 1) && (answer.equals("no"))) || (((number % 2) == 0) && (answer.equals("yes")))) {
                System.out.println("Correct!");
            }
            else {
                System.out.print("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}