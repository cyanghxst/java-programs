import java.util.Scanner;

public class MultiplicationRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = scan.nextInt();

        System.out.print("\nEnter a number of times: ");
        int times = scan.nextInt();

        String result = (times >= 0) ? String.valueOf(multiply(integer, times)) : "-" + String.valueOf(multiply(integer, (int) Math.abs(times)));

        System.out.printf("\n%d x %d = %s\n", integer, times, result);
    }

    public static int multiply(int integer, int times) {
        if (times == 0) return 0;
        return integer + multiply(integer, times - 1);
    }
}
