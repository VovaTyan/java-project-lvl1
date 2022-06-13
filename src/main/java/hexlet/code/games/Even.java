package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final int inGameOptions = 3;
    public static void startGame() {
        String[][] result = new String[inGameOptions][2];
        String condition = "Answer 'yes' if number even otherwise answer 'no'.";
        for (int i = 0; i < inGameOptions; i++) {
            int random = Utils.intRandom(1, 100);
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
