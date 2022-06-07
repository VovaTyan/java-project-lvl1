package hexlet.code.games;
public class Calc {
    public static String[] question() {
        String[] result = new String[2];
        final int maxInRandom = 100;
        final int threeInRandom = 3;

        int random1 = (int) (Math.random() * maxInRandom);
        int random2 = (int) (Math.random() * maxInRandom);
        int randomMath = (int) (Math.random() * threeInRandom);
        String num1 = Integer.toString(random1);
        String num2 = Integer.toString(random2);
        if (randomMath == 0) {
            int result0 = random1 * random2;
            result[0] = num1 + " * " + num2;
            result[1] = Integer.toString(result0);
        }
        if (randomMath == 1) {
            int result1 = random1 + random2;
            result[0] = num1 + " + " + num2;
            result[1] = Integer.toString(result1);
        }
        if (randomMath == 2) {
            int result2 = random1 - random2;
            result[0] = num1 + " - " + num2;
            result[1] = Integer.toString(result2);
        }
        return result;
    }
}
