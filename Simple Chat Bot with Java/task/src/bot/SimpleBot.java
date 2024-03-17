package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Introducing the bot
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        // User inputs their name
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");

        // Guessing the age
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        // Read the remainders
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        // Calculate the age based on the remainders and the formula provided
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        // Display the guessed age
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        scanner.close();
    }
}
