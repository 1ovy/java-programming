package test9;

public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.println("The grade is");
        printGrade(78.9);

        System.out.println("The grade is");
        printGrade(59.5);

    }
    public static void printGrade(double grade) {
        if (grade >= 90.0) {
            System.out.println("A");
        }
        else if (grade >= 80.0) {
            System.out.println("B");
        }
        else if (grade >= 70.0) {
            System.out.println('C');
        }
        else if (grade >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}
