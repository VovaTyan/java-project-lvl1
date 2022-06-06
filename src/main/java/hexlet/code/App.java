package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nPlease enter the game number and press Enter.\n1 - Greet\n2 - Even \n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        String numberGame = in.nextLine();
        if (numberGame.equals("0")) {
            return;
        }
        if (numberGame.equals("1")) {
            Cli.greetings();
        }
        else if ((numberGame.equals("2")) || (numberGame.equals("3")) || (numberGame.equals("4")) || (numberGame.equals("5"))  || (numberGame.equals("6"))) {
            int numGame = Integer.parseInt(numberGame);
            Engine.gameGames(numGame);
        }
        else {
            System.out.println("'" + numberGame + "' is wrong input. Correct input was: 1-6. Let's try again!");
        }

    }

}
