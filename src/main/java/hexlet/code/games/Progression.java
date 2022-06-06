package hexlet.code.games;
public class Progression {
    public static String[] question() {
        String[] result = new String[2];
        var maxRandom = 100;
        var maxAmount = 9;
        var maxAmount2 = 9;
        var minAmount = 5;
        var stepRandom = 1;
        int random1 = (int) (Math.random() * maxRandom);
        int step = stepRandom + (int) (Math.random() * maxAmount);
        int numbers = minAmount + (int) (Math.random() * maxAmount2);
        int numberRandom = (int) (Math.random() * numbers);
        int num = random1;
        String numText;
        String text = "";
        for (int i = 0; i <= numbers; i++) {
            if (i == numberRandom) {
                text = text + ".. ";
                result[1] = Integer.toString(num);
            } else {
                numText = Integer.toString(num);
                text = text + numText + " ";
            }
            num = num + step;
        }
        result[0] = text;
        return result;
    }
}
