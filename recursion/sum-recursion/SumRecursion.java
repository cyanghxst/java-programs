public class SumRecursion {
    public static void main(String[] args) {
        System.out.println(sum(9));
    }

    public static int sum(int num) {
        if (num <= 1) {
            return 1;
        }

        return sum(num) + sum(num - 1);
    }
}
