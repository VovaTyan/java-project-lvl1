package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] allGameOphions = new String[7];
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nPlease enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even \n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        String numberGame = in.nextLine();
        if (numberGame.equals("0")) {
            return;
        }
        if (numberGame.equals("1")) {
            Cli.greetings();
            return;
        }
        switch (numberGame) {
            case "2":
                allGameOphions = Even.question();
                break;
            case "3":
                allGameOphions = Calc.question();
                break;
            case "4":
                allGameOphions = GCD.question();
                break;
            case "5":
                allGameOphions = Progression.question();
                break;
            case "6":
                allGameOphions = Prime.question();
                break;
            default:
                System.out.println("'" + numberGame + "' is wrong input. Correct input was: 1-6. Let's try again!");
                return;
        }
        Engine.gameGames(allGameOphions);
    }

}
