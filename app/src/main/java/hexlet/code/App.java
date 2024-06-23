package hexlet.code;

import hexlet.code.games.ArithmeticProgression;
import hexlet.code.games.Calculator;
import hexlet.code.games.EvenOddGame;
import hexlet.code.games.Gcd;
import hexlet.code.games.Greet;
import hexlet.code.games.PrimeNumber;

import java.util.Scanner;

//Файл App.java предназначен только для отображения игрового меню, выбора и запуска нужной игры
public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        String firstUserChoice = new Scanner(System.in).next();
        System.out.println("Your choice: " + firstUserChoice);
        switch (firstUserChoice) {
            case "1" -> Greet.start();
            case "2" -> EvenOddGame.start();
            case "3" -> Calculator.start();
            case "4" -> Gcd.start();
            case "5" -> ArithmeticProgression.start();
            case "6" -> PrimeNumber.start();
            default -> {
            }
        }
    }
}
