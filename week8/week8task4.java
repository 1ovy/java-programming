package test10;

public class week8task4 {
    public static void main(String[] args) {
        double[] list=new double[5];

        for (int i = 0; i < list.length; i++) {
            list[i]=Math.random()*10;
        }
        for (int i = 1; i < list.length ; i++) {
            System.out.println(list[i]+" ");
        }
    }
}
