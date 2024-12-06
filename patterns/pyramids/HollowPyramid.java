import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int k = 1; k <= 2 * i - 3; k++) {
                if (i == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            if (i == 1) {
                System.out.println();
            } else {
                System.out.print("*\n");
            }
        }
    }
}
