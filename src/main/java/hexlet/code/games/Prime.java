package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void question() {
        final int inGameOptions = 6;
        String[] result = new String[inGameOptions];
        result[0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int maxInRandom = 99;
        final int noInPrime = 2;

        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < inGameOptions; i = i + 2) {
            var random = 1 + (int) (Math.random() * maxInRandom);
            result[i] = Integer.toString(random);
            result[i + 1] = "yes";
            if (random < noInPrime) {
                result[i] = "no";
            }
            for (int j = noInPrime; j < random; j++) {
                if ((random % j) == 0) {
                    result[i + 1] = "no";
                    break;
                }
            }
        }
        Engine.gameGames(condition, result);
    }
}
