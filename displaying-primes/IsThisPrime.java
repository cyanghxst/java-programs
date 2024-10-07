import java.util.Scanner;

public class IsThisPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an interger: ");
        int input = scan.nextInt();

        String output = (isPrime(input) ? "prime" : "not prime");

        System.out.printf("\n%d is %s\n", input, output);
    }

    public static boolean isPrime(int num) {
        for (int divisor = 2; divisor < Math.sqrt(num); divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
