package test10;

public class week8task12 {
    public static void main(String[] args) {
        int[] sourceArray = {2,3,1,5,10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("Target array is :");
        for (int value : targetArray) {
            System.out.print(value + " ");
        }
    }
}
