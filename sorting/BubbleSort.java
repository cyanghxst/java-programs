public class BubbleSort {
    public static void main(String[] args) {
        int[] array = generateArray(10);
        System.out.println("Original Array:\n" + java.util.Arrays.toString(array));

        sort(array);

        System.out.println("\nSorted Array:\n" + java.util.Arrays.toString(array));
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        return array;
    }

    public static void sort(int[] array) {
        int lastIndex = array.length - 1;

        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j < lastIndex; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            System.out.printf("\nPass %d:\n%s\n", i, java.util.Arrays.toString(array));
        }
    }
}
