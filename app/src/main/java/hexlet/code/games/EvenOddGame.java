package hexlet.code.games;

public class EvenOddGame {
    private static int number;
    private static final int MAX_NUMBER_BOUND = 100;

    public static int getQuestion() {
        generateQuestion();
        return number;
    }

    public static String getAnswer() {
        return generateCorrectAnswer();
    }

    private static void generateQuestion() {
        number = (int) (1 + Math.random() * MAX_NUMBER_BOUND);
    }

    private static String generateCorrectAnswer() {
        String result = "no";
        if (number % 2 == 0) {
            result = "yes";
        }
        return result;
    }
}
