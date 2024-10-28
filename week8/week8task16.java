package test10;

public class week8task16 {
    public static void main(String[] args) {
        int[] a={1,2};
        System.out.println("Before invoking swap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        swap(a[0],a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        swapFirstInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
    }

    private static void swapFirstInArray(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
