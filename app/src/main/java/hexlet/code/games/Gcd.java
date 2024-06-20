package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Gcd {
    private static int[] numbers = {0, 0};
    private static final int MAX_RAND_BOUND = 21;

    public static void start(int roundsCount) {
        //генерируем игровые данные
        String gameRule = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[roundsCount];
        String[] answers = new String[roundsCount];
        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`
        for (int i = 0; i < roundsCount; i++) {
            questions[i] = generateQuestion();
            answers[i] = generateAnswer();
        }
        Engine.playGame(gameRule, questions, answers, roundsCount);
    }

    private static int[] getRandomNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + Util.getRandomNumber(MAX_RAND_BOUND);
        }
        return numbers;
    }

    private static String generateQuestion() {
        numbers = getRandomNumbers();
        return numbers[0] + " " + numbers[1];
    }

    private static String generateAnswer() {
        return String.valueOf(gcd(numbers[0], numbers[1]));
    }

    private static int gcd(int a, int b) {
        a = numbers[0];
        b = numbers[1];
        if (a == 0) {
            return b;
        }
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}

