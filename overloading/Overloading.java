public class Overloading {
    public static void main(String[] args) {
        System.out.println(calculate(5, 3));
        System.out.println(calculate(5.0, 3));
        System.out.println(calculate(5.0, 3.0));
    }

    public static int calculate(int a, int b) {
        System.out.println("\nFirst method is called");
        return a + b;
    }

    public static double calculate(double a, double b) {
        System.out.println("\nSecond method is called");
        return a * b;
    }

    public static double calculate(int a, double b) {
        System.out.println("\nThird method is called");
        return a - b;
    }

    public static double calculate(double a, int b) {
        System.out.println("\nForth method is called");
        return a / b;
    }
}
