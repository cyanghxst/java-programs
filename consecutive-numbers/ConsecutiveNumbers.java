public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int[] values = generateArray(20);

        System.out.printf("The array %s three consecutive numbers with the same value", (isConsecutiveThree(values) ? "has" : "doesn't have"));
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }

        return array;
    }

    public static boolean isConsecutiveThree (int[] values) {
        int key = values[0];
        int count = 1;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == key) {
                count++;
            } else {
                key = values[i];
                count = 1;
            }

            if (count == 3) {
                return true;
            }
        }

        return false;
    }
}
