package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenOddGame;

import java.util.Scanner;

public class Engine {

    static Scanner sc = new Scanner(System.in);
    static String userName = "";
    static String userChoice = "";
    private static int answer;

    public static void getUserChoice() {
        userChoice = sc.next();
        printUserChoice();
    }

    public static void printUserChoice() {
        System.out.println("Your choice: " + userChoice);
    }

    public static void defaultGreet() {
        if (!userChoice.equals("0")) {
            System.out.println("""
                    Welcome to the Brain Games!
                    May I have your name?""");
        }
    }

    public static void setUserName() {
        userName = sc.next();
        System.out.println("Hello, " + userName);
    }

    public static void printCalculatorQuestion() {
        System.out.println(Calculator.getQuestion());
    }

    public static void printAnswer() {
        answer = Integer.parseInt(sc.next());
        System.out.println("Answer: " + answer);
    }

    public static void getCalculatorCorrectAnswer() {
        answer = Calculator.getAnswer();
    }
}
