package hexlet.code.games;
public class GCD {
    public static String[] question() {
        final int inGameOptions = 7;
        String[] result = new String[inGameOptions];
        result[0] = "Find the greatest common divisor of given numbers.";
        final int maxInRandom = 100;

        for (int i = 1; i < inGameOptions; i = i + 2) {
            var random1 = (int) (Math.random() * maxInRandom);
            var random2 = (int) (Math.random() * maxInRandom);
            String num1 = Integer.toString(random1);
            String num2 = Integer.toString(random2);
            result[i] = num1 + " " + num2;
            for (int j = random1; j >= 1; j--) {
                if (((random2 % j) == 0) && ((random1 % j) == 0)) {
                    result[i + 1] = Integer.toString(j);
                    break;
                }
            }
        }
        return result;
    }
}
