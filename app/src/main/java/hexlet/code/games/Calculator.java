package hexlet.code.games;

public class Calculator {
    private static final String[] OP_LIST = new String[]{"+", "-", "*"};
    private static String operator = "";
    private static int[] numbers = {0, 0};
    private static final int MAX_RAND_BOUND = 21;


    public static int getAnswer() {
        return generateAnswer();
    }

    public static String getQuestion() {
        return generateQuestion();
    }

    private static String generateQuestion() {
        operator = Calculator.getRandomOperator();
        numbers = Calculator.getRandomNumbers();
        return numbers[0] + " " + operator + " " + numbers[1];
    }

    private static int generateAnswer() {
        System.out.println(numbers[0] + " " + operator + " " + numbers[1]);
        switch (operator) {
            case "+":
                return numbers[0] + numbers[1];
            case "-":
                return numbers[0] - numbers[1];
            case "*":
                return numbers[0] * numbers[1];
            default:
                return 0;
        }
    }

    private static String getRandomOperator() {
        int rnd = (int) (Math.random() * 3);
        return OP_LIST[rnd];
    }

    private static int[] getRandomNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * MAX_RAND_BOUND);
        }
        return numbers;
    }
}
