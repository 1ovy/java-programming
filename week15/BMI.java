package test14;

public class BMI {
    private String name;
    private int age;

    public BMI(String name, int age,double weight,double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight,double height) {
        this(name,20,weight,height);
    }

    public double getBMI(){
        double bmi=weight/Math.pow(height*METERS_PEr_CM,2);
        return Math.round(bmi*100)/100.0;
    }
    public String getStatus(){
        double bmi=getBMI();
        if(bmi<18.5)
            return "Underweight";
        if (bmi<25)
            return "Normal";
        if (bmi<30)
            return "Overweight";
        else
            return "Obese";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double height;
    private double weight;
    final double METERS_PEr_CM=0.01;

}
