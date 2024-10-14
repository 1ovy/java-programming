package test8;

public class lab6task14 {
    public static void main(String[] args) {
        double initialTuition = 10000;
        double targetTuition = initialTuition * 2;
        double increaseRate = 0.07;
        int years = 0;

        while (initialTuition < targetTuition) {
            initialTuition *= (1 + increaseRate);
            years++;
        }

        System.out.println("It will take " + years + " years for the tuition to double.");
    }
}