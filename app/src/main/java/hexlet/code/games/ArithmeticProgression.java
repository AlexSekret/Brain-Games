package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class ArithmeticProgression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_STEP_RANGE = 9;
    private static final int NUMBER_RANGE = 100;
    private static int currentLength;
    private static int position;
    private static int[] progression;

    public static void start() {
        //генерируем игровые данные
        String gameRule = "What number is missing in the progression?";
        String[][] gameData = new String[Engine.MAX_ROUND_COUNT][Engine.QA_COUNT]; //{{a,b},{c,d},{e,f}} M*N, M=3, N=2

        for (String[] gd : gameData) {
            gd[0] = generateQuestion();
            gd[1] = String.valueOf(progression[position]);
        }
        Engine.playGame(gameRule, gameData);

    }

    private static String generateQuestion() {
        progression = generateProgression();
        position = Util.getRandomNumber(currentLength);
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

    private static int[] generateProgression() {
        currentLength = MIN_LENGTH + Util.getRandomNumber(MIN_LENGTH); //рекомендуемая длина прогрессии от 5 до 10
        int step = 1 + Util.getRandomNumber(MAX_STEP_RANGE);
        progression = new int[currentLength];
        progression[0] = Util.getRandomNumber(NUMBER_RANGE);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }
}
