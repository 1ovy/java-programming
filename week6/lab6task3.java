package test8;

import java.util.Random;
import java.util.Scanner;
public class lab6task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        int userGuess = -1;
        System.out.println("I have selected a number between 0 and 100. Try to guess it!");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
            }
        }

        scanner.close();
    }
}