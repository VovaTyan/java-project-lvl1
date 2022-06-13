package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
//    static final int inGameOptions = 6;
//    static final int maxInRandom = 100;
    static String[] maths = {" * ", " + ", " - "};
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

        public static void startGame() {
        String[][] result = new String[3][2];
        String condition = "What is the result of the expression?";
        for (int i = 0; i < 3; i++) {
            int random1 = Utils.intRandom(1, 100);//(int) (Math.random() * maxInRandom);
            int random2 = Utils.intRandom(1, 100);
            int randomMath = Utils.intRandom(0, 2);
            String num1 = Integer.toString(random1);
            String num2 = Integer.toString(random2);
            String randomMathStr = maths[randomMath];
            int result0 = calculate(random1, random2, randomMathStr);

                result[i][0] = num1 + maths[randomMath] + num2;
                result[i][1] = Integer.toString(result0);
        }
        Engine.gameGames(condition, result);
    }
}
