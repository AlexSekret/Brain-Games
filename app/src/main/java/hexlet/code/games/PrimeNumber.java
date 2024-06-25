package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class PrimeNumber {

    private static final int MAX_NUMBER_BOUNDARY = 9;

    public static void start() {
        String[][] gameData = new String[Engine.MAX_ROUND_COUNT][Engine.QA_COUNT];
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (String[] gd : gameData) {
            int number = 1 + Util.getRandomNumber(MAX_NUMBER_BOUNDARY);
            gd[0] = String.valueOf(number);
            gd[1] = isPrime(number) ? "yes" : "no";
        }
        Engine.playGame(gameRule, gameData);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= num / 2) {
            if (num % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }
}
