public class class7 {
    public static void main(String[] args) {
        double sum=0,n=1;
        for (int j = 1; j <=11 ; j+=2) {
            sum+=n/j;
            n=-n;
        }
        System.out.println(4*sum);
        double count=0;
        for (int j = 1; j <=13 ; j+=2) {
            count+=n/j;
            n=-n;
        }
        System.out.println(4*count);
    }
}
