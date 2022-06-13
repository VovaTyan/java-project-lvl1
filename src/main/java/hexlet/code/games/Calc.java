package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String[] MATHS = {" * ", " + ", " - "};
    public static int calculate(int number1, int number2, String math) {
        int result = 0;
        switch (math) {
            case " * ":
                result = number1 * number2;
                break;
            case " + ":
                result = number1 + number2;
                break;
            case " - ":
                result = number1 - number2;
                break;
            default:
                System.out.println("No logic set");
                break;
        }
        return result;
    }
    static final int LAPS_GAME = 3;
    static final int MAX_RANDOM = 100;
        public static void startGame() {
        String[][] result = new String[LAPS_GAME][2];
        String condition = "What is the result of the expression?";
        for (int i = 0; i < LAPS_GAME; i++) {
            int random1 = Utils.intRandom(1, MAX_RANDOM);
            int random2 = Utils.intRandom(1, MAX_RANDOM);
            int randomMath = Utils.intRandom(0, 2);
            String num1 = Integer.toString(random1);
            String num2 = Integer.toString(random2);
            String randomMathStr = MATHS[randomMath];
            int result0 = calculate(random1, random2, randomMathStr);
                result[i][0] = num1 + MATHS[randomMath] + num2;
                result[i][1] = Integer.toString(result0);
        }
        Engine.gameGames(condition, result);
    }
}
