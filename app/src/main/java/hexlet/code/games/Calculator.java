package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calculator {
    private static final String[] OP_LIST = new String[]{"+", "-", "*"};
    public static final int MAX_OPLIST_LENGTH = 3;
    private static final int MAX_RAND_BOUND = 21;

    public static void start() {
        //генерируем игровые данные
        String gameRule = "What is the result of the expression?";
        String[][] gameData = new String[Engine.MAX_ROUND_COUNT][Engine.QA_COUNT];
        int[] numbers = {0, 0};
        numbers[0] = Util.getRandomNumber(MAX_RAND_BOUND);
        numbers[1] = Util.getRandomNumber(MAX_RAND_BOUND);
        String operator = getRandomOperator();
        for (String[] gd : gameData) {
            gd[0] = generateQuestion(numbers, operator);
            gd[1] = String.valueOf(generateAnswer(numbers, operator));
        }
        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`
        Engine.playGame(gameRule, gameData);
    }

    private static String generateQuestion(int[] numbers, String operator) {
        return numbers[0] + " " + operator + " " + numbers[1];
    }

    private static int generateAnswer(int[] numbers, String operator) {
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

    private static String getRandomOperator() {
        int rnd = Util.getRandomNumber(MAX_OPLIST_LENGTH);
        return OP_LIST[rnd];
    }
}
