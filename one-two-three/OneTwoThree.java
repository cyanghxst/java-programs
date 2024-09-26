import java.util.Scanner;

public class OneTwoThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {
            count = count % 3 + 1;
            System.out.println(count);
        }
    }
}
