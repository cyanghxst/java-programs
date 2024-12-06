public class DisplayingPrimes5 {
    public static void main(String[] args) {
        final int TOTAL_PRIMES = 50;
        int number = 1;
        int count = 1;

        while (count <= TOTAL_PRIMES) {
            boolean isPrime = true;

            if (number < 2) {
                isPrime = false;
            }

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (count % 10 == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }

                count++;
            }

            number++;
        }
    }
}
