public class SelectionSort {
    public static void main(String[] args) {
        int[] array = generateArray(10);
        System.out.println(java.util.Arrays.toString(array));

        sort(array);
        System.out.println(java.util.Arrays.toString(array));
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        return array;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, findIndexOfSmallestFrom(array, i));
        }
    }

    public static int findIndexOfSmallestFrom(int[] array, int index) {
        int smallest = array[index];
        int smallestIndex = index;

        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
