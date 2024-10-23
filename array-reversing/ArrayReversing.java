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
}
