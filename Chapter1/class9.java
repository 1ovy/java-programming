import java.util.Scanner;

public class class9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the width and height of the rectangle");
        double input1=input.nextDouble();
        double input2=input.nextDouble();

        double area=0,Perimerter=(0);
        area=input1*input2;
        Perimerter=input1+input2;
        System.out.println(area);
        System.out.println(2*Perimerter);
    }
}
