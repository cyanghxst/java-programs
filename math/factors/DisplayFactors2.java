import java.util.Scanner;

public class DisplayFactors2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        displayFactors(number);
    }

    public static void displayFactors(int number) {
        System.out.print("Factors: ");

        if (number == 1) {
            System.out.println(1);
            return;
        }

        while (true) {
            boolean isPrime = true;

            if (number < 2) {
                isPrime = false;
            }

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
                break;
            }

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    System.out.print(divisor + " ");
                    number /= divisor;
                    break;
                }
            }
        }
    }
}
