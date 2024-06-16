package hexlet.code;

import java.util.Arrays;

//Файл App.java предназначен только для отображения игрового меню, выбора и запуска нужной игры
public class App {
    public static final int MAX_ROUND_COUNT = 3;
    public static String userName;

    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                0 - Exit""");

        Engine.getUserChoice();
        switch (Engine.userChoice) {
            case "1":
                Engine.startGreeting();
                System.out.println(Arrays.toString(new String[]{"1", "2"}));
                break;
            case "2":
                Engine.playEvenOdd(MAX_ROUND_COUNT);
                break;
            case "3":
                Engine.playCalculator(MAX_ROUND_COUNT);
                break;
            case "4":
                Engine.playGcd(MAX_ROUND_COUNT);
                break;
            case "5":
                Engine.playArithmeticProgression(MAX_ROUND_COUNT);
                break;
            default:
                break;
        }
    }

}
