package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void question() {
        final int inGameOptions = 6;
        String[] result = new String[inGameOptions];
        final int maxInRandom = 100;

        String condition = "Answer 'yes' if number even otherwise answer 'no'.";
        for (int i = 0; i < inGameOptions; i = i + 2) {
            var random = (int) (Math.random() * maxInRandom);
            result[i] = Integer.toString(random);
            if ((random % 2) == 0) {
                result[i + 1] = "yes";
            } else {
                result[i + 1] = "no";
            }
        }
        Engine.gameGames(condition, result);
    }
}
