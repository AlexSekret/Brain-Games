package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class ArithmeticProgression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_NUMBER_BOUNDARY = 9;
    private static int currentLength;
    private static int position;
    private static int[] progression;
    private static final String GAME_RULE = "What number is missing in the progression?";
    private static String[] questions = new String[App.MAX_ROUND_COUNT];
    private static String[] answers = new String[App.MAX_ROUND_COUNT];

    public static void play() {
        Engine.printGameRule(GAME_RULE);
        //генерируем игровые данные

        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`

        System.out.println("Nothing happen here. Method `play` does not implemented yet.");
    }

    private static int[] generateProgression() {
        currentLength = getProgLength();
        int step = generateRandomNumber();
        progression = new int[currentLength];
        progression[0] = generateRandomNumber();
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
        return (int) (0 + Math.random() * currentLength);
    }

    private static int generateRandomNumber() {
        return (int) (1 + Math.random() * MAX_NUMBER_BOUNDARY);
    }

    private static int getProgLength() {
        return (int) (MIN_LENGTH + (Math.random() * MIN_LENGTH));

    }
}
