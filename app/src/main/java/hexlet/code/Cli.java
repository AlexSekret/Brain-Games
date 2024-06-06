package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                0 - Exit""");
        String userChoice = sc.next();
        System.out.println("Your choice: " + userChoice);
        if (userChoice.equals("1")) {
            System.out.println("Welcome to the Brain Games!\nMay I have your name?");
            String userName = sc.next();
            System.out.println("Hello, " + userName);
        }
    }
}
