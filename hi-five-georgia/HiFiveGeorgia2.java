public class HiFiveGeorgia2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i);
            if (i % 5 == 0 && i % 2 == 0 && i % 3 == 0) {
                System.out.println(" HiFive Georgia");
            } else if (i % 5 == 0) {
                System.out.println(" HiFive");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(" Georgia");
            } else {
                System.out.println();
            }
        }
    }
}
