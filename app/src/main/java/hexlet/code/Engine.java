package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUND_COUNT = 3;
    private static String userName = "";

    public static void playGame(String rule, String[][] gameData) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule); // печатаем правило rule

        for (int i = 0; i < MAX_ROUND_COUNT; i++) {      //игровой цикл
            System.out.println("Question: " + gameData[i][0]);
            String userAnswer = sc.next();
            System.out.println("Your answer: " + userAnswer);
            if (!userAnswer.equals(gameData[i][1])) {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.print("Correct answer was '" + gameData[i][1] + "'. ");
                System.out.println("Let's try again, " + userName + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
