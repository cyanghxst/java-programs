public class ArrayReversing {
    public static void main(String[] args) {
        final int SIZE = 10;

        int[] array = genRandomArray(SIZE);
        int[] newArray = reverseArray(array);

        System.out.println("Before swapping:");
        System.out.println(java.util.Arrays.toString(array));

        System.out.println();

        System.out.println("After swapping:");
        System.out.println(java.util.Arrays.toString(newArray));
    }

    public static int[] genArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public static int[] genRandomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        return array;
    }

    public static int[] reverseArray(int[] array) {
        int lastIndex = array.length - 1;
        int[] newArray = copyArray(array);

        for (int i = 0; i < array.length / 2; i++) {
            swap(newArray, i, lastIndex - i);
        }

        return newArray;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}
