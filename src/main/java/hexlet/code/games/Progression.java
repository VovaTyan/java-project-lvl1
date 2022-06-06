package hexlet.code.games;

public class Progression {
    public static String[] question() {
        String[] result = new String[2];
        int maxRandom = 100;
        int maxAmount = 9;
        int minAmount = 5;
        int stepRandom = 1;
        int random1 = (int) (Math.random() * maxRandom);
        int step = stepRandom + (int) (Math.random() * maxAmount);
        int numbers = minAmount + (int) (Math.random() * maxAmount);
        int numberRandom = (int) (Math.random() * numbers);
        int num = random1;
        String num_text;
        String text = "";
        for (int i = 0; i <= numbers; i++) {
            if (i == numberRandom) {
                text = text + ".. ";
                result[1] = Integer.toString(num);
            } else {
                num_text = Integer.toString(num);
                text = text + num_text + " ";
            }
            num = num + step;
        }
        result[0] = text;
        return result;
    }
}
