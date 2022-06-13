package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int LAPS_GAME = 3;
    static final int MAX_RANDOM = 100;
    static final int NO_IN_PRIME = 2;
    public static void startGame() {
        String[][] result = new String[LAPS_GAME][2];


        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < LAPS_GAME; i++) {
            var random = Utils.intRandom(1, MAX_RANDOM);
            result[i][0] = Integer.toString(random);
            result[i][1] = "yes";
            if (random < NO_IN_PRIME) {
                result[i][0] = "no";
            }
            for (int j = NO_IN_PRIME; j < random; j++) {
                if ((random % j) == 0) {
                    result[i][1] = "no";
                    break;
                }
            }
        }
        Engine.gameGames(condition, result);
    }
}
