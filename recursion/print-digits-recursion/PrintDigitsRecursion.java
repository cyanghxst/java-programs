import java.util.Scanner;

public class PrintDigitsRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scan.nextInt();

        printDigits(number);
    }

    public static void printDigits(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        printDigits(number / 10);
        System.out.println(number % 10);
    }
}
