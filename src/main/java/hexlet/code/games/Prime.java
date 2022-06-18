package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_RANDOM = 100;
    private static final int NO_IN_PRIME = 2;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static boolean isPrime(int number) {
        boolean result = (number >= NO_IN_PRIME);
        for (int j = NO_IN_PRIME; j < Math.sqrt(number); j++) {
            if ((number % j) == 0) {
                 return false;
            }
        }
        return result;
    }
    public static void startGame() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            var random = Utils.intRandom(1, MAX_RANDOM);
            result[i][0] = Integer.toString(random);
            result[i][1] = isPrime(random) ? "yes" : "no";
        }
        Engine.startGame(DESCRIPTION, result);
    }
}
