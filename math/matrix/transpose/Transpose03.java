import java.util.*;

public class Transpose03 {
    public static void main(String[] args) {
        int height = genRandom(2, 5);
        int width = genRandom(2, 5);

        char[][] matrix = genMatrix(height, width);
        display(matrix);

        char[][] transposed = transpose(matrix);
        System.out.println();
        display(transposed);
    }

    public static int genRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static char[][] genMatrix(int height, int width) {
        char[][] matrix = new char[height][width];

        char ch = 'a';

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = ch++;
            }
        }

        return matrix;
    }

    public static void display(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }

    public static char[][] transpose(char[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        char[][] transposed = new char[width][height];

        for (int row = 0; row < transposed.length; row++) {
            for (int col = 0; col < transposed[row].length; col++) {
                transposed[row][col] = matrix[col][row];
            }
        }

        return transposed;
    }
}
