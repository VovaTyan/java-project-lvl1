package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static final int inGameOptions = 3;
    public static void startGame() {
        String[][] result = new String[inGameOptions][2];
        final int maxInRandom = 99;
        final int noInPrime = 2;

        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < inGameOptions; i++) {
            var random = 1 + (int) (Math.random() * maxInRandom);
            result[i][0] = Integer.toString(random);
            result[i][1] = "yes";
            if (random < noInPrime) {
                result[i][0] = "no";
            }
            for (int j = noInPrime; j < random; j++) {
                if ((random % j) == 0) {
                    result[i][1] = "no";
                    break;
                }
            }
        }
        Engine.gameGames(condition, result);
    }
}
