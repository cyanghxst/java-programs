public class DisplayingPrimes3 {
    public static void main(String[] args) {
        final int NUMBERS_OF_PRIMES = 50;

        int count = 0;
        int number = 1;
        boolean isPrime = true;

        while (true) {
            if (count == NUMBERS_OF_PRIMES) {
                break;
            }

            if (number < 2) {
                number++;
                continue;
            }

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
            isPrime = true;
        }
    }
}
