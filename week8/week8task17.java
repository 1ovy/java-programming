package test10;

public class week8task17 {
    public static void main(String[] args) {
        int[] list1={1,2,3,4,5};
        int[] list2=reverse(list1);
        System.out.println("List1: ");
        for (int value1 : list1){
            System.out.println(value1+" ");
        }
        System.out.println("\nList2: ");
        for (int value1 : list2){
            System.out.println(value1+" ");
        }
    }
    public static int[] reverse(int[] list){
        int[] result=new int[list.length];
        for(int i=0,j=list.length-1;i<list.length;i++,j--){
            result[j]=list[i];
        }
        return result;
    }
}
