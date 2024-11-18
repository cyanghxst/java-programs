public class InsertionSort {
    public static void main(String[] args) {
        int[] array = generateArray(10);
        System.out.println("Original Array:\n" + java.util.Arrays.toString(array));

        sort(array);
        System.out.println("\nSorted Array:\n" + java.util.Arrays.toString(array));
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        return array;
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int index = i;
            int previous = i - 1;

            if (array[index] < array[previous]) {
                swap(array, index, previous);
            }

            System.out.printf("\nPass %d: \n%s\n", i, java.util.Arrays.toString(array));
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
