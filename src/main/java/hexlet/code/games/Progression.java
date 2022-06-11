package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void question() {
        final int inGameOptions = 6;
        String[] result = new String[inGameOptions];
        result[0] = "What number is missing in the progression?";
        final int maxRandom = 100;
        final int maxAmount = 9;
        final int minAmount = 5;
        final int stepRandom = 1;

        String condition = "What number is missing in the progression?";
        for (int j = 0; j < inGameOptions; j = j + 2) {
            int random1 = (int) (Math.random() * maxRandom);
            int step = stepRandom + (int) (Math.random() * maxAmount);
            int numbers = minAmount + (int) (Math.random() * maxAmount);
            int numberRandom = (int) (Math.random() * numbers);
            int num = random1;
            String numText;
            var text = new StringBuilder();
            for (int i = 0; i <= numbers; i++) {
                if (i == numberRandom) {
                    text.append(".. ");
                    result[j + 1] = Integer.toString(num);
                } else {
                    numText = Integer.toString(num);
                    text.append(numText);
                    text.append(" ");
                }
                num = num + step;
            }
            result[j] = text.toString();
        }
        Engine.gameGames(condition, result);
    }
}
