import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        
        for (int i = 1; i <= input; i++) {
            if (i == n) {
                System.out.println(fibonacci(i));
            }

            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int number) {
        if (number <= 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
