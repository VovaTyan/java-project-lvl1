package hexlet.code.games;
public class Even {
    public static String[] question() {
        String[] result = new String[2];
        final int maxInRandom = 100;

        var random = (int) (Math.random() * maxInRandom);
        result[0] = Integer.toString(random);
        if ((random % 2) == 0) {
            result[1] = "yes";
        } else {
            result[1] = "no";
        }
        return result;
    }
}
