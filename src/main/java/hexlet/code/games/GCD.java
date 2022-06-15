package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final int MAX_RANDOM = 100;
    private static final String CONDITION = "Find the greatest common divisor of given numbers.";
    public static void startGame() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            var random1 = Utils.intRandom(1, MAX_RANDOM);
            var random2 = Utils.intRandom(1, MAX_RANDOM);
            String num1 = Integer.toString(random1);
            String num2 = Integer.toString(random2);
            result[i][0] = num1 + " " + num2;
            for (int j = random1; j >= 1; j--) {
                if (((random2 % j) == 0) && ((random1 % j) == 0)) {
                    result[i][1] = Integer.toString(j);
                    break;
                }
            }
        }
        Engine.startGame(CONDITION, result);
    }
}
