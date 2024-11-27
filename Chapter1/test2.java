public class test2{
    public static void main(String[] args) {
        int day=100;
        int week=7;
        int r=day%week;
        int m=(r+day)%week;
        if(m==0)
            System.out.println("Sunday");
        else if (m==1) {
            System.out.println("Monday");
        }
        else if (m==2) {
            System.out.println("Tusday");
        }
        else if (m==3) {
            System.out.println("Wednesday");
        }
        else if (m==4) {
            System.out.println("Thursday");
        }
        else if (m==5) {
            System.out.println("Firday");
        }
        else if (m==6) {
            System.out.println("Saturday");
        }

    }

}
