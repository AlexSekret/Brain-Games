package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class EvenOddGame {
    public static final int MAX_NUMBER_BOUND = 100;

    public static void start(int roundsCount) {
        //генерируем игровые данные
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[roundsCount];
        String[] answers = new String[roundsCount];
        for (int i = 0; i < roundsCount; i++) {
            questions[i] = String.valueOf(Util.getRandomNumber(MAX_NUMBER_BOUND));
            answers[i] = generateAnswer(questions[i]);
        }
        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`
        Engine.playGame(gameRule, questions, answers, roundsCount);
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
