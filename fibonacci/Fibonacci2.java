import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        
        int fib1 = 1;
        int fib2 = 1;
        int fib3;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
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
