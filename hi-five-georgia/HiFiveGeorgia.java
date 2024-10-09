public class HiFiveGeorgia {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i);
            if (i % 5 == 0 && i % 2 == 0 && i % 3 == 0) {
                System.out.println(" HiFive Georgia");
                continue;
            }

            if (i % 5 == 0) {
                System.out.println(" HiFive");
                continue;
            }

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(" Georgia");
                continue;
            }

            System.out.println();
        }
    }
}
