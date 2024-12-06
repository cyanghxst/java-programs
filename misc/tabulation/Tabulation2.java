public class Tabulation2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            long power = 1;

            for (int j = 1; j <= i; j++) {
                power *= 2;
            }

            System.out.printf("2 ^ %d = %d\n", i, power);
        }
    }
}
