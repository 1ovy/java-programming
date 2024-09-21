public class class11 {
    public static void main(String[] args) {
        int sum=312032486;
        double birth=1.0/7,dead=1.0/13,move=1.0/45;
        int year=365*24*3600;

        int firstyear=(int)(sum+year*birth-year*dead+year*move);
        int secondyear=(int)(firstyear+year*birth-year*dead+year*move);
        int thirdyear=(int)(secondyear+year*birth-year*dead+year*move);
        int fourthyear=(int)(thirdyear+year*birth-year*dead+year*move);
        int fifthyear=(int)(fourthyear+year*birth-year*dead+year*move);

        System.out.println("First year:"+firstyear);
        System.out.println("Second year:"+secondyear);
        System.out.println("Third year:"+thirdyear);
        System.out.println("Tourth year:"+fourthyear);
        System.out.println("Fifth year:"+fifthyear);
    }
}
