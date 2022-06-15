package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    static final int MAX_RANDOM = 100;
    static final int MAX_STEP = 10;
    static final int MIN_AMOUNT = 4;
    private static final String CONDITION = "What number is missing in the progression?";
    public static void startGame() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int j = 0; j < Engine.COUNT_ROUNDS; j++) {
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
        Engine.startGame(CONDITION, result);
    }
}
