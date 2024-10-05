public class PrintDigits {
    public static void main(String[] args) {
        printDigits(749);

        System.out.println();

        printDigits2(749);
    }

    public static void printDigits(int number) {
        String input = String.valueOf(number);
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.println(input.charAt(i));
        }
    }

    public static void printDigits2(int number) {
        int dividend = number;
        while (dividend > 0) {
            System.out.println(dividend % 10);
            dividend = dividend / 10;
        }
    }
}
