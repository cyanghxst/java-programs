import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Fibonacci sequence number: ");
        int input = scanner.nextInt();

        fibonacci(input);
    }

    public static void fibonacci(int number) {
        int fib1 = 0;
        int fib2 = 1;
        int fib3;

        for (int i = 1; i <= number; i++) {
            if (i == number) {
                System.out.println(fib1);
            } else {
                System.out.print(fib1 + " ");
            }

            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
