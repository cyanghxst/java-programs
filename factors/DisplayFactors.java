import java.util.Scanner;

public class DisplayFactors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();

        if (isValid(number)) {
            displayFactors(number);
        } else {
            System.out.println("The number is invalid");
        }
    }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void displayFactors(int number) {
        System.out.printf("The factors are: ");

        while (!isPrime(number)) {
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    System.out.print(divisor + " ");
                    number /= divisor;
                    break;
                }
            }
        }

        System.out.println(number);
    }
}
