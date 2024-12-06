public class Fibonacci4 {
    public static void main(String[] args) {
        int n = 10;
        printFib(n);
    }

    public static void printFib(int n) {
        int fib1 = 1, fib2 = 1, fib3;

        for (int i = 1; i <= n; i++) {
            System.out.print(fib1 + " ");
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }

        System.out.println();
    }
}
