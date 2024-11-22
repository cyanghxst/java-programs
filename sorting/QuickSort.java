public class QuickSort {
    public static void main(String[] args) {
        int[] array = generate(20);

        shuffle(array);
        System.out.printf("Original Array:\n%s\n", java.util.Arrays.toString(array));

        quickSort(array, 0, array.length - 1);
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

    public static void quickSort(int[] array, int first, int last) {
        if (first >= last) return;

        int pivotIndex = partition(array, first, last);
        quickSort(array, first, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, last);
    }

    public static int partition(int[] array, int first, int last) {
        int random = getRandomIndex(first, last);
        int pivot = array[random];

        System.out.printf("\nPivot is %d\n", pivot);

        swap(array, random, last);

        int j = first - 1;

        // lomuto's partition
        for (int i = first; i <= last; i++) {
            if (array[i] > pivot) continue;
            j++;
            if (i > j) swap(array, i, j);
        }

        System.out.printf("\nPass:\n%s\n", java.util.Arrays.toString(array));

        return j;
    }

    public static int getRandomIndex(int first, int last) {
        return (int) (Math.random() * (last - first + 1) + first);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
