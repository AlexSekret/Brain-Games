package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Util;

public class ArithmeticProgression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_NUMBER_BOUNDARY = 9;
    private static int currentLength;
    private static int position;
    private static int[] progression;
    private static final String GAME_RULE = "What number is missing in the progression?";
    private static final String[] questions = new String[App.MAX_ROUND_COUNT];
    private static final String[] answers = new String[App.MAX_ROUND_COUNT];

    public static void start() {
        Engine.playGame();
        //генерируем игровые данные

        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`

        System.out.println("Nothing happen here. Method `play` does not implemented yet.");
    }

    private static int[] generateProgression() {
        currentLength = getRNDProgLength();
        int step = Util.getRandomNumber(MAX_NUMBER_BOUNDARY);
        progression = new int[currentLength];
        progression[0] = Util.getRandomNumber(MAX_NUMBER_BOUNDARY);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }

    public static String getQuestion() {
        return generateQuestion();
    }

    public static String getAnswer() {
        return String.valueOf(generateAnswer());
    }

    private static int generateAnswer() {
        return progression[position];
    }

    private static String generateQuestion() {
        progression = generateProgression();
        position = getRNDPosition();
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < position; i++) {
            question.append(progression[i]);
            question.append(" ");
        }
        question.append("..").append(" ");
        for (int i = position + 1; i < progression.length; i++) {
            question.append(progression[i]).append(" ");
        }
        return question.toString();
    }

    private static int getRNDPosition() {
        return Util.getRandomNumber(currentLength);
    }


    private static int getRNDProgLength() {
        return MIN_LENGTH + Util.getRandomNumber(MIN_LENGTH);

    }
}
