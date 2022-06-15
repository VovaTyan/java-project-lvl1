package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int MAX_RANDOM = 100;
    private static final int NO_IN_PRIME = 2;
    private static boolean prime(int number) {
        boolean result = (number >= NO_IN_PRIME);
        for (int j = NO_IN_PRIME; j < Math.sqrt(number); j++) {
            if ((number % j) == 0) {
                 return false;
            }
        }
        return result;
    }
    private static final String CONDITION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            var random = Utils.intRandom(1, MAX_RANDOM);
            result[i][0] = Integer.toString(random);
            result[i][1] = prime(random) ? "yes" : "no";
        }
        Engine.startGame(CONDITION, result);
    }
}
