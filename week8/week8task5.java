package test10;

public class week8task5 {
    public static void main(String[] args) {
        double[] list = new double[5];
        for (int i = 0; i < list.length; i++) {
            list[i]=Math.random()*10;

        }
        double total=0;
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
            total+=list[i];
        }
        System.out.println();
        System.out.println("Sum of all element is :"+total);
    }
}
