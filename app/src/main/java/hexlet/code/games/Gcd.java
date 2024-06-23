package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Gcd {
    private static final int MAX_RAND_BOUND = 21;

    public static void start() {
        //генерируем игровые данные
        int[] numbers = {0, 0};
        String gameRule = "Find the greatest common divisor of given numbers.";
        String[][] gameData = new String[Engine.MAX_ROUND_COUNT][Engine.QA_COUNT];

        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`
        for (String[] gd : gameData) {
            numbers[0] = getRandomNumber();
            numbers[1] = getRandomNumber();
            gd[0] = numbers[0] + " " + numbers[1];
            gd[1] = String.valueOf(gcd(numbers[0], numbers[1]));
        }
        Engine.playGame(gameRule, gameData);
    }

    private static int getRandomNumber() {
        return (1 + Util.getRandomNumber(MAX_RAND_BOUND));
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

