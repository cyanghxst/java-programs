import java.util.*;

public class OrdinalForms01 {
    public static void main(String[] args) {
        int size = genRandom(5, 10);
        int[] array = genArray(size, false);
        display(array);
    }

    public static int genRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int[] genArray(int size, boolean fixedSeed) {
        Random random = fixedSeed ? new Random(69) : new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
        }

        return array;
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(format(array[i]) + " ");
        }

        System.out.println();
    }

    public static String format(int number) {
        if (11 <= number && number <= 13) {
            return number + "th";
        }

        int lastDigit = number % 10;

        switch(lastDigit) {
            case 1:
                return number + "st";
            case 2:
                return number + "nd";
            case 3:
                return number + "rd";
            default:
                return number + "th";
        }
    }
}
