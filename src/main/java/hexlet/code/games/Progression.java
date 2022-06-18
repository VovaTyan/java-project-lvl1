package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    private static final int MAX_RANDOM = 100;
    private static final int MAX_STEP = 10;
    private static final int MIN_AMOUNT = 4;
    private static final String CONDITION = "What number is missing in the progression?";
    private static int[] progression(int number, int step, int len) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = number;
            number = number + step;
        }
        return result;
    }
    public static void startGame() {
        String[][] result = new String[Engine.COUNT_ROUNDS][2];
        for (int j = 0; j < Engine.COUNT_ROUNDS; j++) {
            int random1 = Utils.intRandom(1, MAX_RANDOM);
            int step = Utils.intRandom(1, MAX_STEP);
            int numbers = MIN_AMOUNT + Utils.intRandom(1, MAX_STEP);
            int numberRandom = (int) (Math.random() * numbers);
            var text = new StringBuilder();
            for (int i = 0; i < numbers; i++) {
                if (i == numberRandom) {
                    text.append(".. ");
                    result[j][1] = Integer.toString(progression(random1, step, numbers)[i]);
                } else {
                    text.append(progression(random1, step, numbers)[i]);
                    text.append(" ");
                }
            }
            result[j][0] = text.toString();
        }
        Engine.startGame(CONDITION, result);
    }
}
