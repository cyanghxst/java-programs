import java.util.*;

public class Transpose02 {
    public static void main(String[] args) {
        int height = genRandom(2, 5);
        int width = genRandom(2, 5);
        int[][] matrix = genMatrix(height, width);

        display(matrix);

        int[][] transposed = transpose(matrix);

        System.out.println();
        display(transposed);
    }

    public static int genRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int[][] genMatrix(int height, int width) {
        int[][] matrix = new int[height][width];

        int i = 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = i++;
            }
        }

        return matrix;
    }

    public static void display(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        int[][] transposed = new int[width][height];

        for (int row = 0; row < transposed.length; row++) {
            for (int col = 0; col < transposed[row].length; col++) {
                transposed[row][col] = matrix[col][row];
            }
        }

        return transposed;
    }
}
