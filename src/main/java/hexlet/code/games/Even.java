package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final int LAPS_GAME = 3;
    static final int MAX_RANDOM = 100;
    public static void startGame() {
        String[][] result = new String[LAPS_GAME][2];
        String condition = "Answer 'yes' if number even otherwise answer 'no'.";
        for (int i = 0; i < LAPS_GAME; i++) {
            int random = Utils.intRandom(1, MAX_RANDOM);
            result[i][0] = Integer.toString(random);
            if ((random % 2) == 0) {
                result[i][1] = "yes";
            } else {
                result[i][1] = "no";
            }
        }
        Engine.gameGames(condition, result);
    }
}
