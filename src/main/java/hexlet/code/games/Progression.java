package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    private static final int MAX_RANDOM = 100;
    private static final int MAX_STEP = 10;
    private static final int MIN_AMOUNT = 4;
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static String[] progression(int number, int step, int len) {
        String[] result = new String[len];
        for (int i = 0; i < len; i++) {
            result[i] = Integer.toString(number + (step * i));
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
            String[] arrays = new String[numbers];
            arrays = progression(random1, step, numbers);
            result[j][1] = progression(random1, step, numbers)[numberRandom];
            arrays[numberRandom] = "..";
            result[j][0] = String.join(" ", arrays);
        }
        Engine.startGame(DESCRIPTION, result);
    }
}
