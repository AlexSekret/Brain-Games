package hexlet.code;

import hexlet.code.games.EvenOddGame;
import hexlet.code.games.Greet;

import java.util.Scanner;

//Файл App.java предназначен только для отображения игрового меню, выбора и запуска нужной игры
public class App {
    public static final int MAX_ROUND_COUNT = 3;

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
        switch (firstUserChoice) {
            case "1":
                Greet.start();
                break;
            case "2":
                EvenOddGame.start(MAX_ROUND_COUNT);
                break;
            case "3":
                Engine.playGame();
                break;
            case "4":
                Engine.playGame();
                break;
            case "5":
                Engine.playGame();
                break;
            case "6":
                Engine.playGame();
                break;
            default:
                break;
        }
    }

}
