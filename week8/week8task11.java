package test10;

public class week8task11 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = sc.nextInt();
        double[] numbers= new double[n];
        double sum=0;
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i]=sc.nextDouble();
            sum+=numbers[i];
        }

        double average=sum/n;
        int count =0;
        for (int i = 0; i < n; i++) {
            if(numbers[i] > average){
                count++;
            }
        }
        System.out.println("Average is "+average);
        System.out.println("Number of elements above the average is "+count);
    }
}
