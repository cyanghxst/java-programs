import java.util.Scanner;

public class LuhnCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        String number = scan.nextLine();

        String printout = "The number is " + (isValid(number) ? "valid" : "invalid");
        System.out.println(printout);
    }

    public static boolean isValid(String number) {
        int length = number.length();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = number.charAt(i) - '0';
        }

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

        int sum1 = 0;

        for (int i = length - 2; i >= 0; i -= 2) {
            int result = array[i] * 2;

            if (result > 9) {
                String numStr = Integer.toString(result);
                int[] digits = new int[numStr.length()];

                for (int j = 0; j < numStr.length(); j++) {
                    digits[j] = numStr.charAt(j) - '0';
                }

                result = digits[0] + digits[1];
            }

            sum1 += result;
        }

        System.out.println(sum1);

        return true;
    }
}
