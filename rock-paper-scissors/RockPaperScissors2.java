import java.util.Scanner;

public class RockPaperScissors2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1: ");
        String p1 = scan.nextLine();

        System.out.print("Player 2: ");
        String p2 = scan.nextLine();

        if (p1.equals("rock")) {
            if (p2.equals("scissors")) {
                System.out.println("\nPlayer 1 wins");
                return;
            }

            if (p2.equals("paper")) {
                System.out.println("\nPlayer 2 wins");
                return;
            }

            if (p2.equals("rock")) {
                System.out.println("\nDraw");
                return;
            }
        }

        if (p1.equals("paper")) {
            if (p2.equals("rock")) {
                System.out.println("\nPlayer 1 wins");
                return;
            }

            if (p2.equals("scissors")) {
                System.out.println("\nPlayer 2 wins");
                return;
            }

            if (p2.equals("paper")) {
                System.out.println("\nDraw");
                return;
            }
        }

        if (p1.equals("scissors")) {
            if (p2.equals("paper")) {
                System.out.println("\nPlayer 1 wins");
                return;
            }

            if (p2.equals("rock")) {
                System.out.println("\nPlayer 2 wins");
                return;
            }

            if (p2.equals("scissors")) {
                System.out.println("\nDraw");
                return;
            }
        }
    }
}
