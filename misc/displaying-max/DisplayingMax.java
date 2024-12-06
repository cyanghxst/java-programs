import java.util.Scanner;

public class DisplayingMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 0;

        System.out.println("Enter 10 positive integers: ");

        for (int i = 1; i <= 10; i++) {
            int input = scan.nextInt();
            if (input > max) {
                max = input;
            }
        }

        System.out.printf("\nMax is %d\n", max);
    }
}
