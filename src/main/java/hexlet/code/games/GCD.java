package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final int inGameOptions = 3;
    public static void startGame() {
        String[][] result = new String[inGameOptions][2];

        String condition = "Find the greatest common divisor of given numbers.";
        for (int i = 0; i < inGameOptions; i++) {
            var random1 = Utils.intRandom(1, 100);
            var random2 = Utils.intRandom(1, 100);
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
        Engine.gameGames(condition, result);
    }
}
