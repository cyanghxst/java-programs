import java.util.Arrays;

public class Fibonacci7 {
    public static void main(String[] args) {
        int n = 7;
        int[] array = fibArray(n);
        System.out.println(Arrays.toString(array));
    }

    public static int[] fibArray(int size) {
        int[] array = new int[size];

        if (size >= 1) {
            array[0] = 1;
        }

        if (size >= 2) {
            array[1] = 1;
        }

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array;
    }
}
