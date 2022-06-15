package hexlet.code;
public class Utils {
    public static int intRandom(int from, int to) {
        return from + (int) (Math.random() * (to - from));
    }
}
