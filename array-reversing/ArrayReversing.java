public class ArrayReversing {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] array = genArray(SIZE);
    }

    public static int[] genArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public static int[] reverseArray(int[] array) {
        int lastIndex = array.length - 1;
        int[] newArray = copyArray(array);

        for (int i = 0; i < size / 2; i++) {
            swap(newArray, i, lastIndex - i);
        }

        return newArray;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
