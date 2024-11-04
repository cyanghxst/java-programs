public class FibRecursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    public static int fibonacci(int num) {
        if (num == 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
