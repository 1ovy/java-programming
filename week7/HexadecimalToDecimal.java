package test9;

import java.util.Scanner;

public class HexadecimalToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hexInput = scanner.nextLine();

        int decimalValue = convertHexToDecimal(hexInput);

        System.out.println("Decimal value: " + decimalValue);

        scanner.close();
    }

    public static int convertHexToDecimal(String hex) {
        int decimal = 0;
        int base = 1;

        hex = hex.toUpperCase();

        for (int i = hex.length() - 1; i >= 0; i--) {
            char hexChar = hex.charAt(i);
            int hexValue;

            if (hexChar >= '0' && hexChar <= '9') {
                hexValue = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                hexValue = hexChar - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal character: " + hexChar);
            }
            decimal += hexValue * base;
            base *= 16;
        }
        return decimal;
    }
}