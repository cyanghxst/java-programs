public class Overloading {
    public static void main(String[] args) {
        calculate(5, 3);
        calculate(5.0, 3);
        calculate(5.0, 3.0);
    }

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a * b;
    }

    public static double calculate(int a, double b) {
        return a - b;
    }
}
