package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nPlease enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even \n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        String numberGame = in.nextLine();

        switch (numberGame) {
            case "0":
                return;
            case "1":
                Cli.greetings();
                return;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calc.startGame();
                break;
            case "4":
                GCD.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                Prime.startGame();
                break;
            default:
                System.out.println("'" + numberGame + "' is wrong input. Correct input was: 1-6. Let's try again!");
                break;
        }
        in.close();
    }
}
