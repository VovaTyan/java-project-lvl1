package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MAX_RANDOM = 100;
    private static final int MAX_STEP = 10;
    private static final int MIN_AMOUNT = 4;
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static int[] progression(int number, int step, int len) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = number + (step * i);
        }
        return result;
    }
    public static void startGame() {
        String[][] gameData = new String[Engine.COUNT_ROUNDS][2];
        for (int j = 0; j < Engine.COUNT_ROUNDS; j++) {
            int firstElement = Utils.intRandom(1, MAX_RANDOM);
            int step = Utils.intRandom(1, MAX_STEP);
            int numbersCount = MIN_AMOUNT + Utils.intRandom(1, MAX_STEP);
            int numberRandom = (int) (Math.random() * numbersCount);
            int[] progressionRound = progression(firstElement, step, numbersCount);
            var question = new StringBuilder();
            for (int i = 0; i < numbersCount; i++) {
                if (i != numberRandom) {
                    question.append(progressionRound[i]);
                } else {
                    question.append("..");
                }
                question.append(" ");
            }
            gameData[j][0] = question.toString();
            gameData[j][1] = Integer.toString(progressionRound[numberRandom]);
        }
        Engine.startGame(DESCRIPTION, gameData);
    }
}
