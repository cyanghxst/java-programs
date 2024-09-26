import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer between 1-26: ");
        int number = scan.nextInt();

        if (number < 1 || number > 26) {
            System.out.println("\nError: You entered an invalid value. Must be between 1-26");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int blank = 1; blank <= number - row; blank++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= row; i++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
