package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String[] OPERATIONS = {" * ", " + ", " - "};
    private static final int MAX_RANDOM = 100;
    private static final String DESCRIPTION = "What is the result of the expression?";
    public static int calculate(int number1, int number2, String operation) {
        int result = 0;
        switch (operation) {
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
                System.out.println("No logic defined for the " + operation + " operator");
        }
        return result;
    }


        public static void startGame() {
        String[][] gameData = new String[Engine.COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int random1 = Utils.intRandom(1, MAX_RANDOM);
            int random2 = Utils.intRandom(1, MAX_RANDOM);
            int randomMath = Utils.intRandom(0, OPERATIONS.length);
            String num1 = Integer.toString(random1);
            String num2 = Integer.toString(random2);
            String randomMathStr = OPERATIONS[randomMath];
            int result0 = calculate(random1, random2, randomMathStr);

                gameData[i][0] = num1 + OPERATIONS[randomMath] + num2;
                gameData[i][1] = Integer.toString(result0);
        }
        Engine.startGame(DESCRIPTION, gameData);
    }
}
