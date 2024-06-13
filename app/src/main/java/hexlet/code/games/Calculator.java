package hexlet.code.games;

public class Calculator {
    public static String[] opList = new String[]{"+", "-", "*"};
    public static String operator;
    public static int[] numbers = new int[2];


    public static String generateQuestion() {
        operator = Calculator.getRandomOperator();
        numbers = Calculator.getRandomNumbers();
        return numbers[0] + " " + operator + " " + numbers[1];
    }

    public static int generateAnswer(int[] numbers, String operator) {
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

    public static String getRandomOperator() {
        int rnd = (int) (Math.random() * 3);
        return opList[rnd];
    }

    public static int[] getRandomNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }
        return numbers;
    }
}
