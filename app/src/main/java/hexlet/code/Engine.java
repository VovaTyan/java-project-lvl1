package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    public static void gameGames(int n) {
        String Conditions = "";
        String[] question_correct = new String[2];
        String answer;
        if (n == 2) {
                Conditions = "Answer 'yes' if number even otherwise answer 'no'.";
        }
        System.out.println("\nWelcome to the Brain games!");
        System.out.print("May I have your name? ");
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(Conditions);
        for (int i = 0; i < 3; i++) {
            if (n == 2) {
                question_correct = Even.question();
              }
            System.out.println("Question: " + question_correct[0]);
            Scanner in1 = new Scanner(System.in);
            System.out.print("Your answer: ");
            answer = in1.nextLine();
            if (question_correct[1].equals(answer)) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + question_correct[1] + "'.\nLet's try again, " + name + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + name + "!");
     }
}