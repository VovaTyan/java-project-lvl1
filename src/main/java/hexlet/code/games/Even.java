package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static boolean honest (int number) {
        return number % 2 == 0;
    }
    private static final int MAX_RANDOM = 100;
    private static final String CONDITION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void startGame() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int random = Utils.intRandom(1, MAX_RANDOM);
            result[i][0] = Integer.toString(random);
            result[i][1] = (honest(random)) ? "yes" : "no";
        }
        Engine.startGame(CONDITION, result);
    }
}
