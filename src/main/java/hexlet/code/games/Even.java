package hexlet.code.games;
public class Even {
    public static String[] question() {
        final int inGameOptions = 7;
        String[] result = new String[inGameOptions];
        result[0] = "Answer 'yes' if number even otherwise answer 'no'.";
        final int maxInRandom = 100;

        for (int i = 1; i < inGameOptions; i = i + 2) {
            var random = (int) (Math.random() * maxInRandom);
            result[i] = Integer.toString(random);
            if ((random % 2) == 0) {
                result[i + 1] = "yes";
            } else {
                result[i + 1] = "no";
            }
        }
        return result;
    }
}
