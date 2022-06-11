package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static void gameGames(String condition, String[] allGameParams) {
        String answer;
        System.out.println("\nWelcome to the Brain games!");
        System.out.print("May I have your name? ");
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        System.out.println("Hello, " + name + "!");
        int attempts = allGameParams.length;

        System.out.println(condition);
        for (int i = 0; i < attempts; i = i + 2) {
            if (allGameParams[i] == null) {
                allGameParams[i] = "0";
            }
            System.out.println("Question: " + allGameParams[i]);
            Scanner in2 = new Scanner(System.in);
            System.out.print("Your answer: ");
            answer = in2.nextLine();
            if (allGameParams[i + 1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + allGameParams[i + 1] + "'.\nLet's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
     }
}
