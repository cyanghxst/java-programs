public class Transpose01 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2},
                          {3, 4},
                          {5, 6}};

        display(matrix);

        int[][] transposed = transpose(matrix);

        display(transposed);
    }

    public static void display(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        int[][] transposed = new int[width][height];

        for (int row = 0; row < transposed.length; row++) {
            for (int col = 0; col < transpoed[0].length; col++) {
                transposed[row][col] = matrix[col][row];
            }
        }

        return transposed;
    }
}
