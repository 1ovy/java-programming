package test12;

public class RandomShuffling {
    public static void main(String[] args) {
        // Initialize an array using array initializer
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Generate random indexes for rows and columns
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                int i1 = (int)(Math.random() * matrix.length);
                int i2 = (int)(Math.random() * matrix.length);
                int temp = matrix[i1][i2];
                matrix[row][column] = matrix[i1][i2];
                matrix[i1][i2] = temp;
            }
        }
        System.out.println("Array after shuffling: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
