package test10;

import java.util.Scanner;

public class week8task10 {
    public static void main(String[] args) {
        String[] months={
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        System.out.println("Enter a month number (1 to 12): ");
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        System.out.println("The month is :"+months[month-1]);
        sc.close();
    }
}
