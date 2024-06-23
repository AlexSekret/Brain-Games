package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Gcd {
    private static int[] numbers = {0, 0};
    private static final int MAX_RAND_BOUND = 21;
    private static final int QA_Count = 2;

    public static void start() {
        //генерируем игровые данные
        String gameRule = "Find the greatest common divisor of given numbers.";
        String[][] gameData = new String[Engine.MAX_ROUND_COUNT][QA_Count];

        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`
        for (String[] gd : gameData) {
            gd[0] = generateQuestion();
            gd[1] = generateAnswer();
        }
        Engine.playGame(gameRule, gameData);
    }

    private static int[] getRandomNumber() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + Util.getRandomNumber(MAX_RAND_BOUND);
        }
        return numbers;
    }

    private static String generateQuestion() {
        numbers = getRandomNumber();
        return numbers[0] + " " + numbers[1];
    }

    private static String generateAnswer() {
        return String.valueOf(gcd(numbers[0], numbers[1]));
    }

    private static int gcd(int a, int b) {
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

