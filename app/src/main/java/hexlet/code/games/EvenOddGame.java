package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class EvenOddGame {
    private static final int MAX_NUMBER_BOUND = 100;
    private static final int QA_Count = 2; //in this game must be 1 question and 1 answer per 1 round

    public static void start() {
        // генерируем игровые данные
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = new String[Engine.MAX_ROUND_COUNT][QA_Count];

        for (String[] gd : gameData) {
            gd[0] = String.valueOf(Util.getRandomNumber(MAX_NUMBER_BOUND));
            gd[1] = generateAnswer(gd[0]);
        }
        // и передаем их в `Engine`, здесь должен дергаться класс `Engine`
        Engine.playGame(gameRule, gameData);
    }

    private static String generateAnswer(String question) {
        int number = Integer.parseInt(question);
        String result = "no";
        if (number % 2 == 0) {
            result = "yes";
        }
        return result;
    }
}
