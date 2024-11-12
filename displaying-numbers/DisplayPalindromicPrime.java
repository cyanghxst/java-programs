public class DisplayPalindromicPrime {
    public static void main(String[] args) {
        displayPalindromicPrime();
    }

    public static void displayPalindromicPrime() {
        int number = 0;
        int count = 0;

        while (true) {
            if (count == 100) {
                break;
            }

            if (isPrime(number) && isPalindrome(number)) {
                System.out.println(number);
                count++;
            }

            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);

        int size = numberString.length();
        int lastIndex = size - 1;

        for (int i = 0; i < size / 2; i++) {
            char ch = numberString(lastIndex - i);

            if (numberString(i) != ch) {
                return false;
            }
        }

        return true;
    }
}
