package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even \nYour choice: "); //3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: "
        int inNumber = in.nextInt();

        switch (inNumber) {
            case 1:
                Cli.greetings();
                break;
            case 2:
                Even.gameTwo();
            case 3:
                System.out.println("\n");
                break;
            default:
                break;
        }
    }
}
