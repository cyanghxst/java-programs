public class BubbleSort {
    public static void main(String[] args) {
        int[] array = shuffle(generate(10));
        System.out.println("Original Array:\n" + java.util.Arrays.toString(array));

        sort(array);

        System.out.println("\nSorted Array:\n" + java.util.Arrays.toString(array));
    }

    public static int[] generate(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public static void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * array.length);
            swap(array, i, index2);
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            bubble(array);
            System.out.printf("\nPass %d:\n%s\n", i, java.util.Arrays.toString(array));
        }
    }

    public static void bubble(int[] array) {
        int lastIndex = array.length - 1;

        for (int j = 0; j < lastIndex; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}
