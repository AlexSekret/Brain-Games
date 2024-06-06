package hexlet.code;

import java.util.Scanner;

/* Файл, который мы добавили ранее (src/main/java/hexlet/code/Cli.java), оставьте, как есть,
 * и не смешивайте с остальным кодом, дальше в проекте он не используется. Он не предназначен для описания логики игр.
 */
public class Cli {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
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
