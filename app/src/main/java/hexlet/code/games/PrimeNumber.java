package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Util;

public class PrimeNumber {

    private static final int MAX_NUMBER_BOUNDARY = 9;
    private static int number;
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final String[] questions = new String[App.MAX_ROUND_COUNT];
    private static final String[] answers = new String[App.MAX_ROUND_COUNT];

    public static void play() {
        Engine.playGame();
        //генерируем игровые данные

        //и передаем их в `Engine`, здесь должен дергаться класс `Engine`

        System.out.println("Nothing happen here. Method `play` does not implemented yet.");
    }

    public static String getQuestion() {
        generateRandomNumber();
        return String.valueOf(number);
    }

    public static String getAnswer() {
        return isPrime(number) ? "yes" : "no";
    }

    private static boolean isPrime(int num) {
        if (number < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }

    private static void generateRandomNumber() {
        number = 1 + Util.getRandomNumber(MAX_NUMBER_BOUNDARY);
    }
}
