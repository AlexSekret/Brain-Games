package hexlet.code;

import hexlet.code.games.ArithmeticProgression;
import hexlet.code.games.Calculator;
import hexlet.code.games.EvenOddGame;
import hexlet.code.games.Gcd;
import hexlet.code.games.PrimeNumber;

import java.util.Scanner;

public class Engine {

    static Scanner sc = new Scanner(System.in);
    private static String userName = "";
    static String userChoice = "";
    private static String userAnswer;
    private static String correctAnswer;
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
        System.out.println("Your answer: " + userAnswer);
    }

    private static boolean checkCalculatorCorrectAnswer() {
        correctAnswer = Calculator.getAnswer();
        return userAnswer.equals(correctAnswer);
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
            printGcdQuestion();
            printAnswer();
            printGcdResult();
        }
        printWinLoose();
    }

    private static void printGcdResult() {
        if (checkGcdAnswer()) {
            System.out.println("Correct!");
            counterCorrectAnswers++;
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                    + correctAnswer + ".\nLet's try again, " + userName);
        }
    }

    private static boolean checkGcdAnswer() {
        correctAnswer = Gcd.getAnswer();
        return userAnswer.equals(correctAnswer);
    }

    private static void printGcdQuestion() {
        System.out.println("Question: " + Gcd.getQuestion());
    }

    private static void printGcdGreetings() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void playArithmeticProgression(int roundCount) {
        startGreeting();
        printAPGreetings();
        for (int i = 0; i < roundCount; i++) {
            printAPQuestion();
            printAnswer();
            printAPResult();
        }
        printWinLoose();
    }

    private static void printAPResult() {
        if (checkAPAnswer()) {
            System.out.println("Correct!");
            counterCorrectAnswers++;
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                    + correctAnswer + ".\nLet's try again, " + userName);
        }
    }

    private static boolean checkAPAnswer() {
        correctAnswer = ArithmeticProgression.getAnswer();
        return userAnswer.equals(correctAnswer);
    }

    private static void printAPQuestion() {
        System.out.println("Question: " + ArithmeticProgression.getQuestion());
    }

    private static void printAPGreetings() {
        System.out.println("What number is missing in the progression?");
    }

    public static void playPrime(int roundCount) {
        startGreeting();
        printPrimeGreetings();
        for (int i = 0; i < roundCount; i++) {
            printPrimeQuestion();
            printAnswer();
            printPrimeResult();
        }
        printWinLoose();
    }

    private static void printPrimeGreetings() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static void printPrimeQuestion() {
        System.out.println("Question: " + PrimeNumber.getQuestion());
    }

    private static void printPrimeResult() {
        if (checkPrimeAnswer()) {
            System.out.println("Correct!");
            counterCorrectAnswers++;
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                    + correctAnswer + ".\nLet's try again, " + userName);
        }
    }

    private static boolean checkPrimeAnswer() {
        correctAnswer = PrimeNumber.getAnswer();
        return userAnswer.equals(correctAnswer);
    }
}
