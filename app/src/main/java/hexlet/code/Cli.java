package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = sc.next();
        System.out.println("Hello, " + userName);
    }
}
