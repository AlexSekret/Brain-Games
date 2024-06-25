package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class ArithmeticProgression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_STEP_RANGE = 9;
    private static final int NUMBER_RANGE = 100;

    public static void start() {
        String gameRule = "What number is missing in the progression?";
        String[][] gameData = new String[Engine.MAX_ROUND_COUNT][Engine.QA_COUNT];
        for (String[] gd : gameData) {
            int progressionLength = MIN_LENGTH + Util.getRandomNumber(MIN_LENGTH);
            int position = Util.getRandomNumber(progressionLength);
            int step = 1 + Util.getRandomNumber(MAX_STEP_RANGE);
            int first = Util.getRandomNumber(NUMBER_RANGE);
            int[] progression = generateProgression(step, progressionLength, first);
            StringBuilder question = new StringBuilder();
            for (int i = 0; i < progression.length; i++) {
                if (i != position) {
                    question.append(progression[i]).append(" ");
                } else {
                    question.append("..").append(" ");
                }
            }
            gd[0] = question.toString().trim();
            gd[1] = String.valueOf(progression[position]);
        }
        Engine.playGame(gameRule, gameData);

    }

    private static int[] generateProgression(int step, int progressionLength, int first) {
        int[] progression = new int[progressionLength];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = first + step * i;
        }
        return progression;
    }
}
