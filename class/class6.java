public class class6 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <10 ; i++) {
            sum += i;
            if (i!=9)
                System.out.print(i+"+");
            else
                System.out.print(i+"=");
        }
        System.out.println(sum);
    }
}
