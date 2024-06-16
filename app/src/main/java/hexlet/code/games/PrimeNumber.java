package hexlet.code.games;

public class PrimeNumber {

    private static final int MAX_NUMBER_BOUNDARY = 9;
    private static int number;

    public static String getQuestion() {
        generateRandomNumber();
        return String.valueOf(number);
    }

    public static String getAnswer() {
        return isPrime(number) ? "yes" : "no";
    }

    private static boolean isPrime(int num) {
        if (number < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }

    private static void generateRandomNumber() {
        number = (int) (1 + Math.random() * MAX_NUMBER_BOUNDARY);
    }
}
