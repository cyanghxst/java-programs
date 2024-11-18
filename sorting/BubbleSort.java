public class BubbleSort {
    public static void main(String[] args) {
        int[] array = generateArray(10);
        System.out.println("Original Array:\n" + java.util.Arrays.toString(array));

        sort(array);

        System.out.println("Sorted Array:\n" + java.util.Arrays.toString(array));
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        return array;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; i < array.length - 1; j++) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
            System.out.printf("Pass %d:\n%s\n", i + 1, java.util.Arrays.toString(array));
        }
    }
}
