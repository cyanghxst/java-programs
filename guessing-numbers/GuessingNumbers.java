import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int random = (int) (Math.random() * 101);
        int input = -1;

        while (input != random) {
            System.out.print("Guess a number from 0 to 100 (inclusive): ");
            input = scan.nextInt();

            if (input > random) {
                System.out.println("\nToo High!");
            } else if (input < random){
                System.out.println("\nToo Low!");
            }
        }

        System.out.println("\nYou guessed it!");
    }
}
