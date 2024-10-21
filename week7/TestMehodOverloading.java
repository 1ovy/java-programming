package test9;


public class TestMehodOverloading {
    public static void main(String[] args) {
        System.out.println("The maximun of 3 and 4 is" +
                max(3,4));

        System.out.println("The maximun of 3.0 and 5.4 is " +
                max(3.0,5.4));

        System.out.println("The maximun of 3.0,5.4 and 10.14 is"
                + max(3.0,5.4,10.14));
    }
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static double max(double a, double b) {
        return a > b ? a : b;
    }
    public static double max(double a, double b, double c) {
        return max(max(a, b), c);
    }
}
