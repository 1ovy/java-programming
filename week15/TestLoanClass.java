package test14;

import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate,for example, 8.25");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan  amount , for example, 120000.95");
        double loanAmount = input.nextDouble();
        input.close();

        Loan loan =new Loan(loanAmount, annualInterestRate, numberOfYears);

        System.out.printf("The loan was created on %s\n"+
                        "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate(),loan.getMonthlyPayment(),loan.getTotalPayment());
    }
}
