import java.util.Scanner;

public class MultiplicationRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = scan.nextInt();

        System.out.print("\nEnter a number of times: ");
        int times = scan.nextInt();

        System.out.printf("\n%d times %d = %d\n", integer, times, multiply(integer, times));
    }

    public static int multiply(int integer, int times) {
        if (times == 1) {
            return integer;
        }

        return integer + multiply(integer, times - 1);
    }
}
