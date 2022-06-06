package hexlet.code.games;
public class Prime {
    public static String[] question() {
        String[] result = new String[2];
        var maxRandom = 99;
        var noPrime = 2;
        var random = 1 + (int) (Math.random() * maxRandom);
        result[0] = Integer.toString(random);
        result[1] = "yes";
        if (random < noPrime) {
            result[1] = "no";
        }
        for (int i = noPrime; i < random; i = i + 1) {
            if (((random % i) == 0) && (random != noPrime)) {
                result[1] = "no";
                return result;
            }
        }
        return result;
    }
}
