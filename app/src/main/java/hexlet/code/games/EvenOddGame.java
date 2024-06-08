package hexlet.code.games;

import hexlet.code.App;

import java.util.Scanner;

public class EvenOddGame {
    private static String userName;
    private static int wrongCount = 0;

    public static void play() {
        Scanner sc = new Scanner(System.in);
        int questionsCount = 3;
        EvenOddGame.greet();
        EvenOddGame.doCycle(questionsCount, sc);
        EvenOddGame.processingResult();
    }

    private static void processingResult() {
        if (wrongCount == 0) {
            System.out.println("Congratulations, " + App.userName);
        } else {
            System.out.println("You lose! Try again!");
        }
    }

    private static void doCycle(int questionsCount, Scanner sc) {
        for (int i = 0; i < questionsCount; i++) {
            int number = getRandomNumber();
            String correctAnswer = getCorrectAnswer(number);
            System.out.println("Question: " + number);
            String answer = sc.next();
            processUserAnswer(answer, correctAnswer);
        }
    }

    private static void greet() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }


    private static void processUserAnswer(String answer, String correct) {
        if (answer.equals(correct)) {
            System.out.println("Your answer: " + answer + "\nCorrect!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was" + " '"
                    + correct + "'.\nLet's try again, " + userName);
            wrongCount++;
        }
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }

    private static String getCorrectAnswer(int number) {
        String result = "no";
        if (number % 2 == 0) {
            result = "yes";
        }
        return result;
    }
}
