package test11;

import javafx.geometry.Point2D;
import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point's x-,y-coordinates: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter point2's x-,y-coordinates: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        System.out.println("p1 is "+p1.toString());
        System.out.println("p2 is "+p2.toString());
        System.out.println("The distance between points is "+p1.distance(p2));
        System.out.println("The distance between points is "+p1.midpoint(p2).toString());
    }
}
