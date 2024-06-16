package hexlet.code.games;

public class ArithmeticProgression {
    private static final int MIN_LENGTH = 5;
    private static int currentLength;
    private static int position;
    private static int[] progression;

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
        return (int) (1 + Math.random() * 9);
    }

    private static int getProgLength() {
        return (int) (MIN_LENGTH + (Math.random() * MIN_LENGTH));

    }
}
