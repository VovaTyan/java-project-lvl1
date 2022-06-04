package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static void gameGames(int numGame) {
        String Conditions = "";
        String[] question_correct = new String[2];
        String answer;
        System.out.println("\nWelcome to the Brain games!");
        System.out.print("May I have your name? ");
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        System.out.println("Hello, " + name + "!");
        switch (numGame) {
            case 2:
                Conditions = "Answer 'yes' if number even otherwise answer 'no'.";
                break;
            case 3:
                Conditions = "What is the result of the expression?";
                break;
            case 4:
                Conditions = "Find the greatest common divisor of given numbers.";
                break;
            case 5:
                Conditions = "What number is missing in the progression?";
                break;
        }
        System.out.println(Conditions);
        for (int i = 0; i < 3; i++) {
            switch (numGame) {
                case 2:
                    question_correct = Even.question();
                    break;
                case 3:
                    question_correct = Calc.question();
                    break;
                case 4:
                    question_correct = GCD.question();
                    break;
                case 5:
                    question_correct = Progression.question();
                    break;
            }
            if (question_correct[1] == null) {
                question_correct[1] = "0";
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