package test11;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);
        System.out.println("The area of the rectangle is: " + r1.getArea() +
                "and the perimeter of the rectangle is: " + r1.getPerimeter());
        System.out.println("The area of the rectangle is: " + r2.getArea() +
                "and the perimeter of the rectangle is: " + r2.getPerimeter());
    }
}
