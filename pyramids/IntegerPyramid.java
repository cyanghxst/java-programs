import java.util.Scanner;

public class IntegerPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer between 1-9: ");
        int number = scan.nextInt();

        if (number < 1 || number > 9) {
            System.out.println("\nError: The input value must be between 1-9");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int blank = 1; blank <= number - row; blank++) {
                System.out.print(" ");
            }

            for (int integer = 1; integer <= row; integer++) {
                System.out.print(integer);
            }
        }
    }
}
