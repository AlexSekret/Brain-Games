package hexlet.code.games;

public class Gcd {
    private static int[] numbers = {0, 0};
    private static final int MAX_RAND_BOUND = 21;

    private static int[] getRandomNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (1 + Math.random() * MAX_RAND_BOUND);
        }
        return numbers;
    }

    private static String generateQuestion() {
        numbers = getRandomNumbers();
        return numbers[0] + " " + numbers[1];
    }

    public static String getQuestion() {
        return generateQuestion();
    }

    public static String getAnswer() {
        return String.valueOf(generateAnswer());
    }

    private static int generateAnswer() {
        return gcd(numbers[0], numbers[1]);
    }

    private static int gcd(int a, int b) {
        a = numbers[0];
        b = numbers[1];
        if (a == 0) {
            return b;
        }
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}

