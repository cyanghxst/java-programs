public class BinarySearch {
    public static void main(String[] args) {
        int[] array = generate(10);

        System.out.println("Original Array:\n" + java.util.Arrays.toString(array));
    }

    public static int[] generate(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        return array;
    }
}
