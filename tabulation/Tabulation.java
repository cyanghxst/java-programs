public class Tabulation {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.printf("2 ^ %d = %.0f\n", i, Math.pow(i, 2));
        }
    }
}
