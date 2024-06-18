package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Calculator {
    private static final String[] OP_LIST = new String[]{"+", "-", "*"};
    public static final int MAX_OPLIST_LENGTH = 3;
    private static String operator = "";
    private static int[] numbers = {0, 0};
    private static final int MAX_RAND_BOUND = 21;
    private static final String GAME_RULE = "What is the result of the expression?";
    private static String[] questions = new String[App.MAX_ROUND_COUNT];
    private static String[] answers = new String[App.MAX_ROUND_COUNT];

    public static void play() {
        Engine.printGameRule(GAME_RULE);
        //генерируем игровые данные

        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`

        System.out.println("Nothing happen here. Method `play` does not implemented yet.");
    }

    public static String getAnswer() {
        return String.valueOf(generateAnswer());
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
        int rnd = (int) (Math.random() * MAX_OPLIST_LENGTH);
        return OP_LIST[rnd];
    }

    private static int[] getRandomNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * MAX_RAND_BOUND);
        }
        return numbers;
    }
}
