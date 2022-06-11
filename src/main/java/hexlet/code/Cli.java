package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void greetings() {
        System.out.println("\nWelcome to the Brain games!");
        Scanner in1 = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = in1.nextLine();
        in1.close();
        System.out.println("Hello, " + name + "!");
    }
}
