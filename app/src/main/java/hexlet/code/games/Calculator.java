package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calculator {
    public static final int MAX_OPLIST_LENGTH = 3;
    private static final int MAX_RAND_BOUND = 21;

    public static void start() {
        String[] opList = new String[]{"+", "-", "*"};
        String gameRule = "What is the result of the expression?";
        String[][] gameData = new String[Engine.MAX_ROUND_COUNT][Engine.QA_COUNT];
        int[] numbers = {0, 0};

        for (String[] gd : gameData) {
            numbers[0] = Util.getRandomNumber(MAX_RAND_BOUND);
            numbers[1] = Util.getRandomNumber(MAX_RAND_BOUND);
            int rnd = Util.getRandomNumber(MAX_OPLIST_LENGTH);
            String operator = opList[rnd];
            gd[0] = numbers[0] + " " + operator + " " + numbers[1];
            gd[1] = String.valueOf(calculate(numbers, operator));
        }
        Engine.playGame(gameRule, gameData);
    }

    private static int calculate(int[] numbers, String operator) {
        switch (operator) {
            case "+" -> {
                return numbers[0] + numbers[1];
            }
            case "-" -> {
                return numbers[0] - numbers[1];
            }
            case "*" -> {
                return numbers[0] * numbers[1];
            }
            default -> {
                return 0;
            }
        }
    }
}
