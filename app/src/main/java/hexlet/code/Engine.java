package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static String userName = "";

    public static void playGame(String rule, String[] questions, String[] answers, int roundCount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule); // печатаем правило rule

        for (int i = 0; i < roundCount; i++) {      //игровой цикл
            System.out.println("Question: " + questions[i]);
            String userAnswer = sc.next();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.print("Correct answer was '" + answers[i] + "'. ");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
}
