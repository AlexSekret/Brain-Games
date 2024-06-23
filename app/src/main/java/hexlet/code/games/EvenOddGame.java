package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class EvenOddGame {
    private static final int MAX_NUMBER_BOUND = 100;

    public static void start() {
        // генерируем игровые данные
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = new String[Engine.MAX_ROUND_COUNT][Engine.QA_COUNT];
        //gd[0] - store questions, gd[1] - store answers
        for (String[] gd : gameData) {
            int number = Util.getRandomNumber(MAX_NUMBER_BOUND);
            gd[0] = String.valueOf(number);
            gd[1] = getCorrectAnswer(number);
        }
        // и передаем их в `Engine`, здесь должен дергаться класс `Engine`
        Engine.playGame(gameRule, gameData);
    }

    private static String getCorrectAnswer(int number) {
        return isEven(number) ? "yes" : "no";
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
