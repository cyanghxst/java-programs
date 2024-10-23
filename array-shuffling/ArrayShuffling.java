public class ArrayShuffling {
    public static void main(String[] args) {
        final int SIZE = 10;

        int[] array = genRandomArray(SIZE);

        System.out.println("Array is:");
        printArray(array);

        System.out.println();

        System.out.println("Shuffled array is:");
        printArray(array);
    }

    public static int[] genRandomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf("%d", array[i]);
                continue;
            }

            if ((i + 1) % 10 == 0) {
                System.out.printf("%d,\n ", array[i]);
            } else {
                System.out.printf("%d, ", array[i]);
            }
        }

        System.out.println("]");
    }
}
