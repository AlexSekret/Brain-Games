package hexlet.code;

import hexlet.code.games.ArithmeticProgression;
import hexlet.code.games.Calculator;
import hexlet.code.games.EvenOddGame;
import hexlet.code.games.Gcd;
import hexlet.code.games.PrimeNumber;

import java.util.Scanner;

public class Engine {

    private static Scanner sc = new Scanner(System.in);
    private static String userName = "";
    private static String userChoice = "";
    private static String userAnswer;
    private static String correctAnswer;
    private static int correctAnswersCounter;
    private static int wrongAnswersCount = 0;

    public static String returnUserChoice() {
        setUserChoice();
        return userChoice;
    }

    private static void setUserChoice() {
        userChoice = sc.next();
    }

    private static void printUserChoice() {
        System.out.println("Your choice: " + userChoice);
    }

    public static void startGreeting() {
        printUserChoice();
        defaultGreet();
        setUserName();
        System.out.println("Hello, " + userName + "!");
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


    private static void printCalculatorQuestion() {
        System.out.println("Question: " + Calculator.getQuestion());
    }

    private static void printAnswer() {
        userAnswer = sc.next();
        System.out.println("Your answer: " + userAnswer);
    }

    private static boolean checkCalculatorCorrectAnswer() {
        correctAnswer = Calculator.getAnswer();
        return userAnswer.equals(correctAnswer);
    }

    private static void printCalculatorResult() {
        if (checkCalculatorCorrectAnswer()) {
            correctAnswersCounter++;
            printCorrect();
        } else {
            wrongAnswersCount++;
            printWrong();
        }

    }

    public static void playCalculator(int roundCount) {
        startGreeting();
        printCalculatorGreetings();
        for (int i = 0; i < roundCount; i++) {
            if (wrongAnswersCount == 0) {
                printCalculatorQuestion();
                printAnswer();
                printCalculatorResult();
            }
        }
        printWinLoose();
    }

    private static void printWinLoose() {
        if (correctAnswersCounter == App.MAX_ROUND_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static void playEvenOdd(int roundCount) {
        startGreeting();
        printEvenOddGreetings();
        for (int i = 0; i < roundCount; i++) {
            if (wrongAnswersCount == 0) {
                printEvenOddQuestion();
                printAnswer();
                printEvenOddResult();
            }
        }
        printWinLoose();
    }

    private static void printEvenOddResult() {
        if (checkEvenOddAnswer()) {
            printCorrect();
            correctAnswersCounter++;
        } else {
            wrongAnswersCount++;
            printWrong();
        }
    }

    private static boolean checkEvenOddAnswer() {
        correctAnswer = EvenOddGame.getAnswer();
        return userAnswer.equals(correctAnswer);
    }

    private static void printEvenOddQuestion() {
        System.out.println("Question: " + EvenOddGame.getQuestion());
    }

    public static void playGcd(int roundCount) {
        startGreeting();
        printGcdGreetings();
        for (int i = 0; i < roundCount; i++) {
            if (wrongAnswersCount == 0) {
                printGcdQuestion();
                printAnswer();
                printGcdResult();
            }
        }
        printWinLoose();
    }

    private static void printGcdResult() {
        if (checkGcdAnswer()) {
            printCorrect();
            correctAnswersCounter++;
        } else {
            wrongAnswersCount++;
            printWrong();
        }
    }

    private static boolean checkGcdAnswer() {
        correctAnswer = Gcd.getAnswer();
        return userAnswer.equals(correctAnswer);
    }

    private static void printGcdQuestion() {
        System.out.println("Question: " + Gcd.getQuestion());
    }


    public static void playArithmeticProgression(int roundCount) {
        startGreeting();
        printAPGreetings();
        for (int i = 0; i < roundCount; i++) {
            if (wrongAnswersCount == 0) {
                printAPQuestion();
                printAnswer();
                printAPResult();
            }
        }
        printWinLoose();
    }

    private static void printAPResult() {
        if (checkAPAnswer()) {
            printCorrect();
            correctAnswersCounter++;
        } else {
            wrongAnswersCount++;
            printWrong();
        }
    }

    private static boolean checkAPAnswer() {
        correctAnswer = ArithmeticProgression.getAnswer();
        return userAnswer.equals(correctAnswer);
    }

    private static void printAPQuestion() {
        System.out.println("Question: " + ArithmeticProgression.getQuestion());
    }


    public static void playPrime(int roundCount) {
        startGreeting();
        printPrimeGreetings();
        for (int i = 0; i < roundCount; i++) {
            if (wrongAnswersCount == 0) {
                printPrimeQuestion();
                printAnswer();
                printPrimeResult();
            }
        }
        printWinLoose();
    }


    private static void printPrimeQuestion() {
        System.out.println("Question: " + PrimeNumber.getQuestion());
    }

    private static void printPrimeResult() {
        if (checkPrimeAnswer()) {
            printCorrect();
            correctAnswersCounter++;
        } else {
            wrongAnswersCount++;
            printWrong();
        }
    }

    private static void printCorrect() {
        System.out.println("Correct!");
    }

    private static void printWrong() {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    private static boolean checkPrimeAnswer() {
        correctAnswer = PrimeNumber.getAnswer();
        return userAnswer.equals(correctAnswer);
    }

    public static void printGameRule(String rule) {
        System.out.println(rule);
    }
}
