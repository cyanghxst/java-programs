import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.println();

        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(number - i);
            }
            System.out.println();
        }
    }
}
