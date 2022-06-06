package hexlet.code.games;
public class GCD {
    public static String[] question() {
        String[] result = new String[2];
        var maxRandom = 100;

        var random1 = (int) (Math.random() * maxRandom);
        var random2 = (int) (Math.random() * maxRandom);
        String num1 = Integer.toString(random1);
        String num2 = Integer.toString(random2);
        result[0] = num1 + " " + num2;
        for (int i = random1; i >= 1; i--) {
            if (((random2 % i) == 0) && ((random1 % i) == 0)) {
                result[1] = Integer.toString(i);
                break;
            }
        }
        return result;
    }
}
