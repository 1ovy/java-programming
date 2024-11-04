package test11;

public class week9test1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("The are of the ciecle of radius " + circle.radius+"is" +circle.getArea() );

        Circle circle2 = new Circle(25);
        System.out.println("The are of the ciecle of radius " + circle2.radius+"is" +circle2.getArea() );

        Circle circle3 = new Circle(125);
        System.out.println("The are of the ciecle of radius " + circle3.radius+"is" +circle3.getArea() );

        circle.setRadius(100);
        System.out.println("The are of the ciecle of radius " + circle2.radius+"is" +circle2.getArea() );
    }
}

