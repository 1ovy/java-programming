package test11;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random generator1 = new Random();
        System.out.println("From generator1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(generator1.nextInt(1000) + " ");
        }
        Random generator2 = new Random();
        System.out.println("From generator2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(generator2.nextInt(1000) + " ");
        }
    }

}
