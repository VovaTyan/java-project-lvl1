package hexlet.code;

import java.util.Scanner;
public class Engine {
    static final int LAPS_GAME = 3;
    public static void gameGames(String condition, String[][] allGameParams) {
        String answer;
        System.out.println("\nWelcome to the Brain games!");
        System.out.print("May I have your name? ");
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(condition);
        for (int i = 0; i < LAPS_GAME; i++) {
            System.out.println("Question: " + allGameParams[i][0]);
            Scanner in2 = new Scanner(System.in);
            System.out.print("Your answer: ");
            answer = in2.nextLine();
            if (allGameParams[i][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + allGameParams[i][1] + "'.\nLet's try again, " + name + "!");
                in2.close();
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
     }
}
