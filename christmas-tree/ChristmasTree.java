import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.println();

        for (int i = 1; i <= number; i++) {
            printBlank(number - i);
            printStar(i);
            printStar(i - 1);
            System.out.println();
        }
    }

    public static void printStar(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
    }

    public static void printBlank(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }
}
