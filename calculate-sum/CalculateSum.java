import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter a number (0 to stop): ");

        do {
            int input = scan.nextInt();

            if (input == 0) {
                break;
            }

            sum += input;
        } while (input != 0);

        System.out.println("The sum is " + sum);
    }
}
