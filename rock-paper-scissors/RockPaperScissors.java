import java.util.HashMap;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1: ");
        String p1 = scan.nextLine();

        System.out.print("Player 2: ");
        String p2 = scan.nextLine();

        HashMap<String, String> map = new HashMap<>();

        map.put("rock", "scissors");
        map.put("scissors", "paper");
        map.put("paper", "rock");

        if (map.get(p1).equals(p2)) {
            System.out.println("\nPlayer 1 wins");
            return;
        }

        if (map.get(p2).equals(p1)) {
            System.out.println("\nPlayer 2 wins");
            return;
        }

        System.out.println("\nDraw");
    }
}
