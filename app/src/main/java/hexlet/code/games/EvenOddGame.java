package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class EvenOddGame {
    private static int number;
    private static final int MAX_NUMBER_BOUND = 100;
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[] questions = new String[App.MAX_ROUND_COUNT];
    private static String[] answers = new String[App.MAX_ROUND_COUNT];

    public static void play() {
        Engine.printGameRule(GAME_RULE);
        //генерируем игровые данные

        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`

        System.out.println("Nothing happen here. Method `play` does not implemented yet.");
    }

    public static int getQuestion() {
        generateQuestion();
        return number;
    }

    public static String getAnswer() {
        return generateCorrectAnswer();
    }

    private static void generateQuestion() {
        number = (int) (1 + Math.random() * MAX_NUMBER_BOUND);
    }

    private static String generateCorrectAnswer() {
        String result = "no";
        if (number % 2 == 0) {
            result = "yes";
        }
        return result;
    }
}
