package test8;

public class lab6task8 {
    public static void main(String[] args) {

        System.out.print("Multiplication Table: ");
        System.out.println("    ");
        // Print table body
        for (int i = 1; i <= 9; i++) {
            System.out.println("    "+i); // number should be defined from user input
        }
        System.out.println("-------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.println(i+" | ");
            for(int j = 1; j <= 9; j++){
                System.out.printf("%5d",i * j);
            }
        }
        System.out.println(); // Additional formatting
    }
}