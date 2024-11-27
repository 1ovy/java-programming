import java.util.Scanner;

public class class8 {
    public static void main(String[] args) {
        System.out.println("Please enter the radius of the circle");
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();

        double C=2*r*Math.PI;
        double S=r*r*Math.PI;

        System.out.println("The area of the circle is:"+S);
        System.out.println("The ciclemference of the circle is:"+C);
    }
}
