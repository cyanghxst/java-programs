import java.util.Scanner;

public class DisplayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scan.nextInt();

        reverse(number);
    }

    public static void reverse(int number) {
        while (number > 0) {
            System.out.println(number % 10);
            number /= 10;
        }
    }
}
