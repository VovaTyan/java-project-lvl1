package hexlet.code.games;
public class Progression {
    public static String[] question() {
        String[] result = new String[7];
        result[0] = "What number is missing in the progression?";
        final int maxRandom = 100;
        final int maxAmount = 9;
        final int minAmount = 5;
        final int stepRandom = 1;
        int attempts = result.length;

        for (int j = 1; j < attempts; j = j + 2) {
            int random1 = (int) (Math.random() * maxRandom);
            int step = stepRandom + (int) (Math.random() * maxAmount);
            int numbers = minAmount + (int) (Math.random() * maxAmount);
            int numberRandom = (int) (Math.random() * numbers);
            int num = random1;
            String numText;
            String text = "";
            for (int i = 0; i <= numbers; i++) {
                if (i == numberRandom) {
                    text = text + ".. ";
                    result[j+1] = Integer.toString(num);
                } else {
                    numText = Integer.toString(num);
                    text = text + numText + " ";
                }
                num = num + step;
            }
            result[j] = text;
        }
        return result;
    }
}
