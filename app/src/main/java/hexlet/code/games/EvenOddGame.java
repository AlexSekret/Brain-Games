package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class EvenOddGame {

    public static void start(int roundsCount) {
        //генерируем игровые данные
        String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int MAX_NUMBER_BOUND = 100;
        String[] questions = new String[roundsCount];
        String[] answers = new String[roundsCount];
        for (int i = 0; i < roundsCount; i++) {
            questions[i] = String.valueOf(Util.getRandomNumber(MAX_NUMBER_BOUND));
            answers[i] = getCorrectAnswer(questions[i]);
        }
        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`
        Engine.playGame(GAME_RULE, questions, answers, roundsCount);
    }

    private static String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        String result = "no";
        if (number % 2 == 0) {
            result = "yes";
        }
        return result;
    }
}
