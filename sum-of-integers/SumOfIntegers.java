public class SumOfIntegers {
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is " + sum(1, 10));
    }

    public static int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
