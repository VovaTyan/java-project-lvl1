package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static void gameGames(String[] allGameOphions) {
        String answer;
        System.out.println("\nWelcome to the Brain games!");
        System.out.print("May I have your name? ");
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(allGameOphions[0]);
        int attempts = allGameOphions.length;

        for (int i = 1; i < attempts; i = i + 2) {
            if (allGameOphions[i] == null) {
                allGameOphions[i] = "0";
            }
            System.out.println("Question: " + allGameOphions[i]);
            Scanner in2 = new Scanner(System.in);
            System.out.print("Your answer: ");
            answer = in2.nextLine();
            if (allGameOphions[i+1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + allGameOphions[i+1] + "'.\nLet's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
     }
}
