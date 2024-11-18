package test12;

import java.util.Random;

import java.util.Random;

public class MatrixFinder {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }

        // Print the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxOnes = 0;
        int maxOnes2 = 0;
        int maxRowIndex = 0;
        int maxColumnIndex = 0;
        for (int i = 0; i < 4; i++) {
            int onesInRow = 0;
            for (int j = 0; j < 4; j++) {
                onesInRow += matrix[i][j];
            }
            if (onesInRow > maxOnes) {
                maxOnes = onesInRow;
                maxRowIndex = i;
            }
        }
        for (int j = 0; j < 4; j++) {
            int onesInColumn = 0;
            for (int i = 0; i < 4; i++) {
                onesInColumn += matrix[i][j];
            }
            if (onesInColumn > maxOnes2) {
                maxOnes2 = onesInColumn;
                maxColumnIndex = j;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColumnIndex);
    }
}