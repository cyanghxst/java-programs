import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.println();

        for (int i = 1; i <= number; i++) {
            for (int j = number - i + 1; j <= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
