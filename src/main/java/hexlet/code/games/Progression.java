package hexlet.code.games;

public class Progression {
    public static String[] question() {
        String[] result = new String[2];
        int random1 = (int) (Math.random() * 100);
        int step = 1 + (int) (Math.random() * 9);
        int numbers = 5 + (int) (Math.random() * 9);
        int number_random = (int) (Math.random() * numbers);
        int num = random1;
        String num_text;
        String text = "";
        for (int i = 0; i <= numbers; i++) {
            if (i == number_random) {
                text = text + ".. ";
                result[1] = Integer.toString(num);
            }
            else {
                num_text = Integer.toString(num);
                text = text + num_text + " ";
            }
            num = num + step;
        }
        result[0] = text;
        return result;
    }
}
