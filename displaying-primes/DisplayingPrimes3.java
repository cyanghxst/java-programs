public class DisplayingPrimes3 {
    public static void main(String[] args) {
        final int NUMBERS_OF_PRIMES = 50;

        int number = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (number < 2) {
                    continue;
                }

                for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                    if (number % divisor == 0) {
                        continue;
                    }

                    System.out.print(number + " ");
                }
            }

            System.out.println();
        }
    }
}
