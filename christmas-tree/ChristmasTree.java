import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.println();

        printTree(number);
        printBase(number);
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

    public static void printBase(int number) {
        for (int i = 1; i <= 2; i++) {
            printBlank(number - 2);
            printStar(3);
            System.out.println();
        }
    }

    public static void printTree(int number) {
        for (int i = 1; i <= number; i++) {
            printBlank(number - i);
            printStar(2 * i - 1);
            System.out.println();
        }
    }
}
