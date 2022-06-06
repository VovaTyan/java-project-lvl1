package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;
public class Engine {
    public static void gameGames(int numGame) {
        String conditions = "";
        String[] questionCorrect = new String[2];
        String answer;
        System.out.println("\nWelcome to the Brain games!");
        System.out.print("May I have your name? ");
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        System.out.println("Hello, " + name + "!");
        var questionGame2 = 2;
        var questionGame3 = 3;
        var questionGame4 = 4;
        var questionGame5 = 5;
        var questionGame6 = 6;
        if (numGame == questionGame2) {
            conditions = "Answer 'yes' if number even otherwise answer 'no'.";
        } else if (numGame == questionGame3) {
            conditions = "What is the result of the expression?";
        } else if (numGame == questionGame4) {
            conditions = "Find the greatest common divisor of given numbers.";
        } else if (numGame == questionGame5) {
            conditions = "What number is missing in the progression?";
        } else if (numGame == questionGame6) {
            conditions = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        }
        System.out.println(conditions);
        int attempts = 3;
        var numberGame2 = 2;
        var numberGame3 = 3;
        var numberGame4 = 4;
        var numberGame5 = 5;
        var numberGame6 = 6;
        for (int i = 0; i < attempts; i++) {
            if (numGame == numberGame2) {
                questionCorrect = Even.question();
            } else if (numGame == numberGame3) {
                questionCorrect = Calc.question();
            } else if (numGame == numberGame4) {
                questionCorrect = GCD.question();
            } else if (numGame == numberGame5) {
                questionCorrect = Progression.question();
            } else if (numGame == numberGame6) {
                    questionCorrect = Prime.question();
            }
            if (questionCorrect[1] == null) {
                questionCorrect[1] = "0";
            }
            System.out.println("Question: " + questionCorrect[0]);
            Scanner in1 = new Scanner(System.in);
            System.out.print("Your answer: ");
            answer = in1.nextLine();
            if (questionCorrect[1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionCorrect[1] + "'.\nLet's try again, " + name + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + name + "!");
     }
}
