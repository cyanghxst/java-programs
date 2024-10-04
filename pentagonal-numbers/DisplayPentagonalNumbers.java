public class DisplayPentagonalNumbers {
    public static void main(String[] args) {
        System.out.println("This program displays the first 10 pentagonal numbers.\n");

        for (int i = 1; i <= 10; i++) {
            System.out.print(getPentagonal(i) + " ");
        }
        System.out.println();
    }

    public static int getPentagonal(int num) { 
        return num * (3 * num - 1) / 2;
    }
}
