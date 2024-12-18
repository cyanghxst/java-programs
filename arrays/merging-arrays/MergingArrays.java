public class MergingArrays {
    public static void main(String[] args) {
        int[] array1 = generate(10);
        int[] array2 = generate(3);

        System.out.printf("\nArray1:\n%s\n", java.util.Arrays.toString(array1));
        System.out.printf("\nArray2:\n%s\n", java.util.Arrays.toString(array2));

        int[] merged = mergeArrays(array1, array2);

        System.out.printf("\nMerged:\n%s\n", java.util.Arrays.toString(merged));
    }

    public static int[] generate(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        return array;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];

        int[] shortArray, longArray;

        if (array1.length < array2.length) {
            shortArray = array1;
            longArray = array2;
        } else {
            shortArray = array2;
            longArray = array1;
        }

        for (int i = 0; i < shortArray.length * 2; i++) {
            if (i % 2 == 0) {
                array[i] = array1[i / 2];
            } else {
                array[i] = array2[i / 2];
            }
        }

        for (int i = shortArray.length * 2, j = shortArray.length; i < array.length; i++, j++) {
            array[i] = longArray[j];
        }

        return array;
    }
}
