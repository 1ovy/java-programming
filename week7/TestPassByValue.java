package test9;

public class TestPassByValue {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;

        System.out.println("Before invoking the swap method,num1 is" +num1
          + "and num2 is" + num2);

        swap(num1,num2);

        System.out.println("After invoking the swap method,num1 is" +num1 +
                "and num2 is" + num2);
    }
    public static void swap(int a, int b) {
        System.out.println("\tInside swap method");
        System.out.println("\t\tBefore invoking the swap method,a is" +a+
                "and b is" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\t\tAfter swapping,a is"+ a +
                "and b is" + b);
    }
}
