package test11;

public class Circle2 {
    double radius;
    static int numberOfObjets = 0;
    Circle2 (){
        radius =1;
        numberOfObjets++;
    }
    Circle2 (double r){
        radius = r;
    }

    static int getNumberOfObjets(){
        return numberOfObjets;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
}
