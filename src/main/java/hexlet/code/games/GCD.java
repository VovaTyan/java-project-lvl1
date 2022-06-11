package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void question() {
        final int inGameOptions = 6;
        String[] result = new String[inGameOptions];
        final int maxInRandom = 100;

        String condition = "Find the greatest common divisor of given numbers.";
        for (int i = 0; i < inGameOptions; i = i + 2) {
            var random1 = (int) (Math.random() * maxInRandom);
            var random2 = (int) (Math.random() * maxInRandom);
            String num1 = Integer.toString(random1);
            String num2 = Integer.toString(random2);
            result[i] = num1 + " " + num2;
            for (int j = random1; j >= 1; j--) {
                if (((random2 % j) == 0) && ((random1 % j) == 0)) {
                    result[i + 1] = Integer.toString(j);
                    break;
                }
            }
        }
        Engine.gameGames(condition, result);
    }
}
