package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUND_COUNT = 3;
    public static final int QA_COUNT = 2;

    public static void playGame(String rule, String[][] gameData) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);

        for (int i = 0; i < MAX_ROUND_COUNT; i++) {
            System.out.println("Question: " + gameData[i][0]);
            String userAnswer = sc.next();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(gameData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.print("Correct answer was '" + gameData[i][1] + "'. ");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
