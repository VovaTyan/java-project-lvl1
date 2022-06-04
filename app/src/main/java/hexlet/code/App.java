package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even \n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        int numGame = in.nextInt();
        if (numGame == 1) {
            Cli.greetings();
        }
        else if ((numGame >= 2) && (numGame <= 6)) {
            Engine.gameGames(numGame);
        }
        else {
            System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even \n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        }

    }

}
