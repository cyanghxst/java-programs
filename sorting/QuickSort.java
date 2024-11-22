public class QuickSort {
    public static void main(String[] args) {
        int[] array = generate(20);

        shuffle(array);
        System.out.printf("Original Array:\n%s\n", java.util.Arrays.toString(array));

        quickSort(array);
        System.out.printf("\nSorted Array:\n%s\n", java.util.Arrays.toString(array));
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
            int temp = array[i];

            array[i] = array[random];
            array[random] = temp;

        }
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
