package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenOddGame;

//import java.util.Arrays;


//Файл App.java предназначен только для отображения игрового меню, выбора и запуска нужной игры
public class App {
    public static final int MAX_ROUND_COUNT = 3;
    public static String userName;

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit""");

        Engine.getUserChoice();
        switch (Engine.userChoice) {
            case "1":
                Engine.defaultGreet();
                Engine.setUserName();
                break;
            case "2":
                Engine.defaultGreet();
                Engine.setUserName();

                EvenOddGame.play();
                break;
            case "3":
                Engine.defaultGreet();
                Engine.setUserName();
                Engine.printCalculatorGreetings();
                Engine.playCalculator(MAX_ROUND_COUNT);
                Engine.printWinLoose();
                break;
            default:
                break;
        }
    }

}
