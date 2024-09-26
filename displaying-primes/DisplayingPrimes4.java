public class DisplayingPrimes4 {
    public static void main(String[] args) {
        final int TOTAL_PRIMES = 50;

        int number = 2;
        int count = 0;

        for (int i = 1; i <= TOTAL_PRIMES / 10; i++) {
            while (true) {
                if (count == 10) {
                    break;
                }

                if (isPrime(number)) {
                    System.out.print(number + " ");
                    count++;
                }

                number++;
            }

            System.out.println();
        }
    }

    public static boolean isPrime(int integer) {
        if (integer < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(integer); divisor++) {
            if (integer % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
