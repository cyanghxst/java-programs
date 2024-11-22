import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = generate(10, 22);

        System.out.printf("Array:\n%s\n", java.util.Arrays.toString(array));

        System.out.print("\nEnter an element to search: ");
        int key = scan.nextInt();

        int index = findIndex(array, 0, array.length - 1, key);

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

    public static int findIndex(int[] array, int index1, int index2, int key) {
        if (index1 > index2) return -1; // base case: key not found

        int middle = (index1 + index2) / 2; // mid calculation

        if (array[middle] == key) return middle; // found the key

        // recursive case
        return (array[middle] > key)
            ? findIndex(array, index1, middle - 1, key) // search left half
            : findIndex(array, middle + 1, index2, key); // search right half

    }
}
