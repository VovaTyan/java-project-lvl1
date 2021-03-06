package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Even {
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    private static final int MAX_RANDOM = 100;
    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void startGame() {
        String[][] gameData = new String[Engine.COUNT_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int random = Utils.intRandom(1, MAX_RANDOM);
            gameData[i][0] = Integer.toString(random);
            gameData[i][1] = (isEven(random)) ? "yes" : "no";
        }
        Engine.startGame(DESCRIPTION, gameData);
    }
}
