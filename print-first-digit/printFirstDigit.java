import java.util.Scanner;

public class PrintFirstDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scan.nextInt();

        if (input == 0) {
            System.out.println("-1");
            return;
        }

        int dividend = input;
        int quotient;

        while (true) {
            quotient = dividend / 10;

            if (quotient == 0) {
                break;
            }

            dividend = quotient;
        }

        System.out.println(dividend);
    }
}
