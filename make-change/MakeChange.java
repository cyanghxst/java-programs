import java.util.Scanner;

public class MakeChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a purchase less than one dollar: ");
        int purchase = scan.nextInt();

        makeChange(purchase);
    }

    public static void makeChange(int purchase) {
        if (purchase >= 100) {
            System.out.println("The purchase is invalid");
            return;
        }

        int change = 100 - purchase;

        int[] coins = {25, 10, 5, 1};
        String[] names = {"quarter", "dime", "nickle", "penny"};

        for (int i = 0; i < coins.length; i++) {
            System.out.print(change / coins[i] + " ");
            System.out.println(names[i]);
            change %= coins[i];
        }
    }
}
