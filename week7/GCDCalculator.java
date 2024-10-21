package test9;

import java.util.Scanner;

public class GCDCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        int gcd = calculateGCD(firstNumber, secondNumber);

        System.out.println("The GCD of " + firstNumber + " and " + secondNumber + " is: " + gcd);
        scanner.close();
    }

    public static int calculateGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}