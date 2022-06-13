package hexlet.code;

public class Utils {
    public static int intRandom(int from, int to) {
        int result = from + (int) (Math.random() * (to - from));
        return result;
    }
}
