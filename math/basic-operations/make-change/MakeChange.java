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
            System.out.println("\nThe purchase is invalid");
            return;
        }

        int change = 100 - purchase;

        int[] coins = {25, 10, 5, 1};
        String[] names = {"quarter", "dime", "nickle", "penny"};

        System.out.println();

        for (int i = 0; i < coins.length; i++) {
            int count = change / coins[i];

            System.out.print(count + " ");

            switch (i) {
                case 3:
                    if (count == 1) {
                        System.out.println(names[i]);
                    } else {
                        System.out.println("pennies");
                    }

                    break;
                default:
                    System.out.print(names[i]);
                    if (count != 1) System.out.print("s");
                    System.out.println();
            }

            change %= coins[i];
        }
    }
}
