package hexlet.code.games;
public class Prime {
    public static String[] question() {
        String[] result = new String[7];
        result[0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int maxInRandom = 99;
        final int noInPrime = 2;
        int attempts = result.length;

        for (int i = 1; i < attempts; i = i + 2) {
            var random = 1 + (int) (Math.random() * maxInRandom);
            result[i] = Integer.toString(random);
            result[i+1] = "yes";
            if (random < noInPrime) {
                result[i] = "no";
            }
            for (int j = noInPrime; j < random; j++) {
                if (((random % j) == 0) && (random != noInPrime)) {
                    result[i+1] = "no";
                    break;
                }
            }
        }
        return result;
    }
}
