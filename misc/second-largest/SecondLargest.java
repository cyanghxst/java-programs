import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 positive intergers");

        int n, largest, secondLargest;

        largest = 0;
        secondLargest = 0;

        for (int i = 1; i <= 10; i++) {
            n = scan.nextInt();

            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else {
                if (n > secondLargest) {
                    secondLargest = n;
                }
            }
        }

        System.out.println("\n" + secondLargest);
    }
}
