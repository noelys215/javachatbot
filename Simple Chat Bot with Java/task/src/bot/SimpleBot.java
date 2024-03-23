package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Scanner for input

    public static void main(String[] args) {
        greet("Aid", "2018"); // Starts the interaction
        remindName(); // Asks for the user's name
        guessAge(); // Infers the user's age
        count(); // Counts to a number provided by the user
        test(); // Tests the user's programming knowledge
        end(); // Ends the interaction
    }

    // Prints a greeting message with the bot's name and creation year
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    // Prompts for and echoes the user's name
    static void remindName() {
        System.out.println("What a great name you have, " + scanner.nextLine() + "!");
    }

    // Asks for remainders to guess the user's age using a mathematical formula
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int age = (scanner.nextInt() * 70 + scanner.nextInt() * 21 + scanner.nextInt() * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    // Counts from 0 to the number specified by the user
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) System.out.printf("%d!\n", i);
    }

    // Presents a multiple-choice question and waits for the correct answer (option 2)
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while (scanner.nextInt() != 2) System.out.println("Please, try again.");
    }

    // Signals the end of the interaction with the user
    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
