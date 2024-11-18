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
            for (int j = i; j > 0; j--) {
                int index = j;

                if (array[index] < array[index - 1]) {
                    swap(array, index, index - 1);
                    index = index - 1;
                }
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
