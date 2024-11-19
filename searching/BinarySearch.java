public class BinarySearch {
    public static void main(String[] args) {
        int[] array = generate(10);

        System.out.println("Original Array:\n" + java.util.Arrays.toString(array));
    }

    public static int[] generate(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        return array;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = array[i];
            int smallestIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < smallest) {
                    smallest = array[j];
                    smallestIndex = j;
                }
            }

            array[smallestIndex] = array[i];
            array[i] = smallest;
        }
    }

    public static int findIndex(int[] array, int key) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int index = (first + last) / 2;
            int element = array[index];

            if (element == key) {
                return index;
            }

            if (element > key) {
                last = index - 1;
            }

            if (element < key) {
                first = index + 1;
            }
        }

        return -1;
    }
}
