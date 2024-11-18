package test12;

import java.util.Arrays;
import java.util.Random;

public class Shuffle_rows {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Original matrix:");
        printMatrix(matrix);

        shuffle(matrix);
        System.out.println("\nShuffled matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void shuffle(int[][] m) {
        Random rand = new Random();
        for (int i = 0; i < m.length; i++) {
            int randomIndex = rand.nextInt(m.length);
            // Swap the current row with the randomly selected row
            int[] temp = m[i];
            m[i] = m[randomIndex];
            m[randomIndex] = temp;
        }
    }
}
