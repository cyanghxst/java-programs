import java.util.Scanner;

public class RockPaperScissors3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1: ");
        String p1 = scan.nextLine();

        System.out.print("Player 2: ");
        String p2 = scan.nextLine();

        if (p1.equals("rock")) {
            switch (p2) {
                case "scissors":
                    System.out.println("\nPlayer 1 wins");
                    break;
                case "paper":
                    System.out.println("\nPlayer 2 wins");
                    break;
                case "rock":
                    System.out.println("\nDraw");
                    break;
            }
        }

        if (p1.equals("paper")) {
            switch (p2) {
                case "rock":
                    System.out.println("\nPlayer 1 wins");
                    break;
                case "scissors":
                    System.out.println("\nPlayer 2 wins");
                    break;
                case "paper":
                    System.out.println("\nDraw");
                    break;
            }
        }

        if (p1.equals("scissors")) {
            switch (p2) {
                case "paper":
                    System.out.println("\nPlayer 1 wins");
                    break;
                case "rock":
                    System.out.println("\nPlayer 2 wins");
                    break;
                case "scissors":
                    System.out.println("\nDraw");
                    break;
            }
        }
    }
}
