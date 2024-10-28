package test10;

import java.util.Scanner;

public class week8task21 {
    public static double findSmallest(double[] numbers) {
        double min = numbers[0];
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double minValue = findSmallest(numbers);

        System.out.println("The minimum number is: " + minValue);

        scanner.close();
    }
}