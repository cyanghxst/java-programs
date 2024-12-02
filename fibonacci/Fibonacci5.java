public class Fibonacci5 {
    public static void main(String[] args) {
        int n = 1;
        System.out.printf("%dth fibonacci is %d\n", n, fib(n));
    }

    public static int fib(int n) {
        int fib1 = 1, fib2 = 1, fib3;
        int result = fib1;

        for (int i = 1; i <= n; i++) {
            result = fib1;
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }

        return result;
    }
}
