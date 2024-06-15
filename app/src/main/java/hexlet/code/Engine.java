package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenOddGame;

import java.util.Scanner;

public class Engine {

    static Scanner sc = new Scanner(System.in);
    private static String userName = "";
    static String userChoice = "";
    private static String userAnswer;
    private static int correctAnswer;
    private static int counterCorrectAnswers;

    public static void getUserChoice() {
        userChoice = sc.next();
        printUserChoice();
    }

    private static void printUserChoice() {
        System.out.println("Your choice: " + userChoice);
    }

    public static void startGreeting() {
        defaultGreet();
        setUserName();
        System.out.println("Hello, " + userName);
    }

    private static void defaultGreet() {
        if (!userChoice.equals("0")) {
            System.out.println("""
                    Welcome to the Brain Games!
                    May I have your name?""");
        }
    }

    private static void setUserName() {
        userName = sc.next();
    }

    private static void printCalculatorGreetings() {
        System.out.println("What is the result of the expression?");
    }

    public static void printEvenOddGreetings() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static void printCalculatorQuestion() {
        System.out.println("Question: " + Calculator.getQuestion());
    }

    private static void printAnswer() {
        userAnswer = sc.next();
        System.out.println("Answer: " + userAnswer);
    }

    private static int getCalculatorCorrectAnswer() {
        return Calculator.getAnswer();
    }

    private static boolean checkCalculatorCorrectAnswer() {
        return Integer.parseInt(userAnswer) == getCalculatorCorrectAnswer();
    }

    private static void printCalculatorResult() {
        if (checkCalculatorCorrectAnswer()) {
            System.out.println("Correct!");
            counterCorrectAnswers++;
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                    + correctAnswer + ".\nLet's try again, " + userName);
        }

    }

    public static void playCalculator(int roundCount) {
        startGreeting();
        printCalculatorGreetings();
        for (int i = 0; i < roundCount; i++) {
            printCalculatorQuestion();
            printAnswer();
            printCalculatorResult();
        }
        printWinLoose();
    }

    private static void printWinLoose() {
        if (counterCorrectAnswers == 3) {
            System.out.println("Congratulations, " + userName);
        } else {
            System.out.println("Sorry! You loose. Try again.");
        }
    }

    public static void playEvenOdd(int roundCount) {
        startGreeting();
        printEvenOddGreetings();
        for (int i = 0; i < roundCount; i++) {
            printEvenOddQuestion();
            printAnswer();
            printEvenOddResult();
        }
        printWinLoose();
    }

    private static void printEvenOddResult() {
        if (checkEvenOddAnswer()) {
            System.out.println("Correct!");
            counterCorrectAnswers++;
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                    + correctAnswer + ".\nLet's try again, " + userName);
        }
    }

    private static boolean checkEvenOddAnswer() {
        return userAnswer.equals(getEvenOddCorrectAnswer());
    }

    private static String getEvenOddCorrectAnswer() {
        return EvenOddGame.getAnswer();
    }

    private static void printEvenOddQuestion() {
        System.out.println("Question: " + EvenOddGame.getQuestion());
    }

    public static void playGcd(int roundCount) {
        startGreeting();
        printGcdGreetings();
        for (int i = 0; i < roundCount; i++) {
            printGcdQuestion();
            printAnswer();
            printGcdResult();
        }
        printWinLoose();
    }

    private static void printGcdResult() {

    }

    private static void printGcdQuestion() {

    }

    private static void printGcdGreetings() {

    }
}
