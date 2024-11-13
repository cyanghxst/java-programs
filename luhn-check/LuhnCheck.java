import java.util.Scanner;

public class LuhnCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        String number = scan.nextLine();
    }

    public static boolean isValid(String number) {
        int[] array = number.split("");
        int length = array.length;

        if (length < 13 || length > 16) {
            return false;
        }

        switch (array[0]) {
            case 4:
            case 5:
            case 6:
                break;
            case 3:
                if (array[1] == 7) {
                    break;
                }
                return false;
            default:
                return false;
        }

        return true;
    }
}
