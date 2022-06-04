package hexlet.code.games;

public class Prime {
    public static String[] question() {
        String[] result = new String[2];
        var random = 1 + (int) (Math.random() * 99);
        result[0] = Integer.toString(random);
        result[1] = "yes";
        if (random < 2) {
            result[1] = "no";
        }
        for (int i = 2; i < random; i = i + 1) {
            if (((random % i) == 0) && (random != 2)) {
                result[1] = "no";
                return result;
            }
        }
        return result;
    }
}