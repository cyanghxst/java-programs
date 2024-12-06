public class DisplayingPrimes2 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 10;
        int count = 0;
        int number = 1;

        while (count <= NUMBER_OF_PRIMES) {
            if (isPrime(number)) {
                count++;
                System.out.println(count + ": " + number);
            }
            number++;
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
