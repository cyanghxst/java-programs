import java.util.Scanner;

public class MatrixWithLargestSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = initialize(5, scan);

        System.out.printf("Row with largest sum is %d", rowWithLargestSum(matrix));
    }

    public static int[][] initialize(int size, Scanner scan) {
        int[][] matrix = new matrix[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    public static int rowWithLargestSum(int[][] matrix) {
        int rowWithLargestSum = 0;
        int largestSum = 0;
        int sumOfRow;

        for (int i = 0; i < matrix.length; i++) {
            sumOfRow = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sumOfRow += matrix[i][j];
            }

            if (sumOfRow > largestSum) {
                rowWithLargestSum = i;
                largestSum = sumOfRow;
            }
        }

        return rowWithLargestSum;
    }
}
