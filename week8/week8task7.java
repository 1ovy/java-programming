package test10;

public class week8task7 {
    public static void main(String[] args) {
        float[] mylist = new float[5];

        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = (float) Math.random()*10;
        }
        for (int i = 0; i < mylist.length; i++) {
            System.out.println(mylist[i]+" ");
        }
        float max=mylist[0];
        int indexOfMax=0;
        for (int i = 1; i < mylist.length; i++) {
            if(max<mylist[i]){
                max=mylist[i];
                indexOfMax=i;
            }
        }
        System.out.println();
        System.out.println("Largest element in the arry is :"+ max);
        System.out.println("The index of the largest element in the arry is :"+ indexOfMax);
    }
}
