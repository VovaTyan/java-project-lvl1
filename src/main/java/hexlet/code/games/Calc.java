package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void question() {
        final int inGameOptions = 6;
        String[] result = new String[inGameOptions];
        String[] maths = {" * ", " + ", " - "};
        final int maxInRandom = 100;

        String condition = "What is the result of the expression?";
        for (int i = 0; i < inGameOptions; i = i + 2) {
            int random1 = (int) (Math.random() * maxInRandom);
            int random2 = (int) (Math.random() * maxInRandom);
            int randomMath = (int) (Math.random() * maths.length);
            String num1 = Integer.toString(random1);
            String num2 = Integer.toString(random2);
            result[i] = num1 + maths[randomMath] + num2;

            switch (randomMath) {
                case 0:
                    int result0 = random1 * random2;
                    result[i + 1] = Integer.toString(result0);
                    break;
                case 1:
                    int result1 = random1 + random2;
                    result[i + 1] = Integer.toString(result1);
                    break;
                default:
                    int result2 = random1 - random2;
                    result[i + 1] = Integer.toString(result2);
                    break;
            }
        }
        Engine.gameGames(condition, result);
    }
}
