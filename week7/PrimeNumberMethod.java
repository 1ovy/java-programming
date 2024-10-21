package test9;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNUmbers(50);
    }
    public static void printPrimeNUmbers(int n) {
        final int NUMBER_OFPRIMES_PER_LINE = 10;
        int count =0;
        int number = 2;
        while (count<n){
            if(isPrime(number)){
                count++;
                if (count%NUMBER_OFPRIMES_PER_LINE == 0){
                    System.out.printf("%-5d\n",number);
                }
                else
                    System.out.printf("%-5d",number);
            }
            number++;
        }
    }
    public static boolean isPrime(int n){
        for (int divisor = 2; divisor <= n/2; divisor++){
            if(n % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
