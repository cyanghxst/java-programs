import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the first integer: ");
        int num2 = scan.nextInt();

        System.out.printf("\nThe GCD of %d and %d is %d\n", num1, num2, gcd(num1, num2));
        System.out.printf("The LCM of %d and %d is %d\n", num1, num2, lcm(num1, num2));
    }

    public static int gcd(int num1, int num2) {
        int dividend = Math.max(num1, num2);
        int divisor = Math.min(num1, num2);

        while (true) {
            int remainder = dividend % divisor;

            if (remainder == 0) {
                break;
            }

            dividend = divisor;
            divisor = remainder;
        }

        return divisor;
    }

    public static int lcm(int num1, int num2) {
        return num1 * num2 / gcd(num1, num2);
    }
}
