package hexlet.code.games;
public class Prime {
    public static String[] question() {
        String[] result = new String[2];
        final int maxInRandom = 99;

        final int noInPrime = 2;

        var random = 1 + (int) (Math.random() * maxInRandom);
        result[0] = Integer.toString(random);
        result[1] = "yes";
        if (random < noInPrime) {
            result[1] = "no";
        }
        for (int i = noInPrime; i < random; i = i + 1) {
            if (((random % i) == 0) && (random != noInPrime)) {
                result[1] = "no";
                return result;
            }
        }
        return result;
    }
}
