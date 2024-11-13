public class SumMajorDiagonal {
    public static void main(String[] args) {
        double[][] matrix = generateMatrix(4);

        printMatrix(matrix);
        System.out.println(sumMajorDiagonal(matrix));
    }

    public static void printMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static double[][] generateMatrix(int size) {
        double[][] m = new double[size][size];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Math.random() * 20 + 1;
            }
        }

        return m;
    }

    public static double sumMajorDiagonal(double[][] m) {
        int sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }

        return sum;
    }
}
