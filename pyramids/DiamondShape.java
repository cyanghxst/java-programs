import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
