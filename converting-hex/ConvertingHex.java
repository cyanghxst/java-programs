import java.util.Scanner;

public class ConvertingHex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a hexadecimal value: ");
        String hex = scan.nextLine();

        int decimal = convertHexToDecimal(hex);

        if (decimal == -1) {
            System.out.println("\nThe input is invalid.");
        } else {
            System.out.println("\nThe decimal value of " + hex + " is: " + convertHexToDecimal(hex));
        }
    }

    public static int convertHexToDecimal(String hex) {
        int result = 0;
        int power = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char digit = hex.charAt(i);
            int value = 0;

            if (digit >= 'A' && digit <= 'F') {
                value = (int) (digit - 55);
            } else if (digit >= 'a' && digit <= 'f') {
                value = (int) (digit - 87);
            } else if (digit >= '0' && digit <= '9') {
                value = Integer.parseInt(String.valueOf(digit));
            } else {
                return -1;
            }

            result += (int) (value * Math.pow(16, power));
            power++;
        }

        return result;
    }
}
