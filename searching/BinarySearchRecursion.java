import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = generate(10, 22);

        System.out.printf("Array:\n%s\n", java.util.Arrays.toString(array));

        System.out.print("\nEnter an element to search: ");
        int key = scan.nextInt();

        int index = binarySearch(array, key);

        if (index == -1) {
            System.out.printf("\n%d is not found\n", key);
            return;
        }

        System.out.printf("\nThe index of %d is %d\n", key, index);
    }

    public static int[] generate(int size, int start) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + start;
        }

        return array;
    }

    public static int binarySearch(int[] array, int key) {
        int first = 0;
        int last = array.length - 1;

        return findIndex(array, first, last, key);
    }

    public static int findIndex(int[] array, int index1, int index2, int key) {
        if (index1 > index2) return -1;

        int middle = (index1 + index2) / 2;

        if (array[middle] == key) return middle;

        return (array[middle] > key)
            ? findIndex(array, index1, middle - 1, key)
            : findIndex(array, middle + 1, index2, key);

    }
}
