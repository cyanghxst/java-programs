public class Fibonacci3 {
    public static void main(String[] args) {
        int n = 3;
        System.out.printf("%dth fibonacci is %d\n", n, fib(n));
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int fib1 = 1, fib2 = 1, fib3 = fib1 + fib2;

        for (int i = 1; i <= n - 2; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }

        return fib3;
    }
}
