import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = generate(10);

        System.out.printf("Array:\n%s\n", java.util.Arrays.toString(array));

        System.out.print("Enter an element to search: ");
        int key = scan.nextInt();

        if (key == -1) {
            System.out.printf("\n%d is not found\n", key);
            return;
        }

        System.out.printf("\nThe index of %d is %d", key, findIndex(array, key));
    }

    public static int findIndex(int[] array, int key) {
        int first = 0;
        int last = array.length - 1;

        return something(array, first, last, key);
    }

    public static int something(int[] array, int index1, int index2, int key) {
        int middle = (index1 + index2) / 2;

        if (middle > key) {
            return something(array, index1, middle - 1, key);
        }

        if (middle < key) {
            return something(array, middle + 1, index2, key);
        }

        return middle;
    }
}
