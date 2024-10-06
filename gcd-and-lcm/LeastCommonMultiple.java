import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = scan.nextInt();

        System.out.printf("\nThe least common multiple of %d and %d is %d", num1, num2, lcm(num1, num2));
    }

    public static int lcm(int num1, int num2) {
        return num1 * num2 / gcd(num1, num2);
    }

    public static int gcd(int num1, int num2) {
        int dividend = Math.max(num1, num2);
        int divisor = Math.min(num1, num2);
        int remainder;

        while (true) {
            remainder = dividend % divisor;

            if (remainder == 0) {
                break;
            }

            dividend = divisor;
            divisor = remainder;
        }

        return divisor;
    }
}
