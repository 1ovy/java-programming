package test13;

public class testStudent {
    public static void main(String[] args) {
        Student student=new Student(20,"Alice");
        System.out.println("Name:"+student.getName());
        System.out.println("Age:"+student.getAge());
        student.setName("Bob");
        student.setAge(25);
        student.setAge(-5);
        System.out.println("Name:"+student.getName());
        System.out.println("Age:"+student.getAge());
    }
}