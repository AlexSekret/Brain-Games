package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final Scanner sc = new Scanner(System.in);
    private static String userName = "";
    private static int correctAnswersCounter;
    private static int wrongAnswersCount = 0;

    public static void playGame(String rule, String[] questions, String[] answers, int roundCount) {
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule); // печатаем правило rule

        for (int i = 0; i < roundCount; i++) {      //игровой цикл
            if (wrongAnswersCount == 0) {
                System.out.println("Question: " + questions[i]);
                String userAnswer = sc.next();
                System.out.println("Your answer: " + userAnswer);
                if (userAnswer.equals(answers[i])) {
                    correctAnswersCounter++;
                    System.out.println("Correct!");
                } else {
                    wrongAnswersCount++;
                    System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '" + answers[i] + "'.");
                    System.out.println("Let's try again, " + userName + "!");
                }
            }
        }
        if (correctAnswersCounter == roundCount) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static void playGame() {
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
}
