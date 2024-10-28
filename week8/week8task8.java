package test10;

public class week8task8 {
    public static void main(String[] args) {
        int[] mylist =new int[10];
        System.out.println("Arry before shuffling: ");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i]=(int)(Math.random()* mylist.length);
            System.out.print(mylist[i]+" ");
        }
        System.out.println("\nArry after shuffling: ");
        for (int i = 0; i < mylist.length; i++) {
            int j=(int)(Math.random()*mylist.length);
            int temp=mylist[i];
            mylist[i]=mylist[j];
            mylist[j]=temp;
            System.out.println(mylist[i]+" ");
        }
    }
}
