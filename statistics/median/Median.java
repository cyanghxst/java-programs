public class Median {
    public static void main(String[] args) {
        int[] array = generate(20);
        java.util.Arrays.sort(array);

        System.out.printf("Array:\n%s\n", java.util.Arrays.toString(array));

        double median = getMedian(array);

        System.out.printf("\nThe median of the array is %d\n", median);
    }

    public static int[] generate(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        return array;
    }

    public static double getMedian(int[] array) {
        int length = array.length;

        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2;
        }

        return array[length / 2];
    }
}
