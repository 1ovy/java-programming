package test11;

public class Circle {
    double radius;
    Circle(){
        radius =1;
    }

    Circle(double r){
        radius = r;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
    double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    void setRadius(double r){
        radius = r;
    }
}
