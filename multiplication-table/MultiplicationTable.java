import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
