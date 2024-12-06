public class Median {
    public static void main(String[] args) {
        int[] array = generate(getRandomSize());
        java.util.Arrays.sort(array);

        System.out.printf("Array:\n%s\n", java.util.Arrays.toString(array));

        double median = getMedian(array);

        if (median == Math.round(median)) {
            System.out.printf("\nThe median of the array is %.0f\n", median);
            return;
        }

        System.out.printf("\nThe median of the array is %.1f\n", median);
    }

    public static int getRandomSize() {
        return (int) (Math.random() * 19) + 2;
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
            int half = length / 2;
            int sum = array[half - 1] + array[half];
            return (double) sum / 2;
        }

        return array[length / 2];
    }
}
