import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {101, 203, 305, 407, 509};

        System.out.println(Arrays.toString(array));

        System.out.println();

        int keyIndex = binarySearch(array, 450);
        System.out.println(keyIndex);
    }

    public static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        int count = 1;

        System.out.println("Key: " + key);

        System.out.println();

        while (start <= end) {
            int middle = (start + end) / 2;

            System.out.println("Interation: " + count);
            System.out.println("Start: " + start + ", End: " + end + ", Middle: (" + start + " + " + end + ") / 2 = " + middle);
            System.out.println("Now at: " + array[middle]);

            System.out.println();

            count++;

            if (key == array[middle]) {
                return middle;
            }

            if (key < array[middle]) {
                end = middle - 1;
                continue;
            }

            if (key > array[middle]) {
                start = middle + 1;
                continue;
            }
        }

        return -1;
    }
}
