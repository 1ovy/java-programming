package test8;

import java.util.Scanner;
public class lab6task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int questionCount = 0;

        while (questionCount < NUMBER_OF_QUESTIONS) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.print(number1 + " - " + number2 + " = ");
            int answer = input.nextInt();

            if (answer == (number1 - number2)) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Wrong! The correct answer is " + (number1 - number2));
            }

            questionCount++;
        }

        System.out.println("Correct count is " + correctCount);
    }
}
