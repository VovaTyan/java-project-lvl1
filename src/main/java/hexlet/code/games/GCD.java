package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_RANDOM = 100;
    private static final String CONDITION = "Find the greatest common divisor of given numbers.";
    private static String gcd (int number1, int number2) {
        int j;
        for (j = number1; j >= 1; j--) {
            if (((number2 % j) == 0) && ((number1 % j) == 0)) {
                break;
            }
        }
        return Integer.toString(j);
    }
    public static void startGame() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            var random1 = Utils.intRandom(1, MAX_RANDOM);
            var random2 = Utils.intRandom(1, MAX_RANDOM);
            String num1 = Integer.toString(random1);
            String num2 = Integer.toString(random2);
            result[i][0] = num1 + " " + num2;
            result[i][1] = gcd(random1, random2);
        }
        Engine.startGame(CONDITION, result);
    }
}
