import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int input = scan.nextInt();

        printDigits(input);

        System.out.println();

        printDigits2(input);
    }

    public static void printDigits(int number) {
        String input = String.valueOf(number);
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.println(input.charAt(i));
        }
    }

    public static void printDigits2(int number) {
        int dividend = number;
        while (dividend > 0) {
            System.out.println(dividend % 10);
            dividend = dividend / 10;
        }
    }
}
