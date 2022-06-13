package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final int LAPS_GAME = 3;
    static final int MAX_RANDOM = 100;
    static final int MAX_STEP = 10;
    static final int MIN_AMOUNT = 5;
    public static void startGame() {
        String[][] result = new String[LAPS_GAME][2];



        String condition = "What number is missing in the progression?";
        for (int j = 0; j < LAPS_GAME; j++) {
            int random1 = Utils.intRandom(1, MAX_RANDOM);
            int step = Utils.intRandom(1, MAX_STEP);
            int numbers = MIN_AMOUNT + Utils.intRandom(1, MAX_STEP);
            int numberRandom = (int) (Math.random() * numbers);
            int num = random1;
            String numText;
            var text = new StringBuilder();
            for (int i = 0; i <= numbers; i++) {
                if (i == numberRandom) {
                    text.append(".. ");
                    result[j][1] = Integer.toString(num);
                } else {
                    numText = Integer.toString(num);
                    text.append(numText);
                    text.append(" ");
                }
                num = num + step;
            }
            result[j][0] = text.toString();
        }
        Engine.gameGames(condition, result);
    }
}
