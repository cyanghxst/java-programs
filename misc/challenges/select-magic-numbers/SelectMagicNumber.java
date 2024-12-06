import java.io.*;
import java.util.*;

public class SelectMagicNumber {
    public static void main(String[] args) throws IOException {
        scanFile();
    }

    public static void scanFile() throws IOException {
        Scanner inFile = new Scanner(new File("input.txt"));
        PrintWriter outFile = new PrintWriter(new FileWriter("result.txt"));

        while (inFile.hasNextInt()) {
            int integer = inFile.nextInt();

            if (isMagicNumber(integer)) {
                output(outFile, integer);
            }
        }

        inFile.close();
        outFile.close();
    }

    public static boolean isMagicNumber(int integer) {
        if (containsZero(integer)) {
            return false;
        }

        if (hasRepeatedDigits(integer)) {
            return false;
        }

        if (!isDoubledValueValid(integer)) {
            return false;
        }

        return true;
    }

    public static boolean containsZero(int integer) {
        String str = String.valueOf(integer);
        return str.indexOf('0') != -1;
    }

    public static boolean hasRepeatedDigits(int integer) {
        String str = String.valueOf(integer);

        int[] array = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            array[digit]++;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1) {
                return true;
            }
        }

        return false;
    }

    public static boolean isDoubledValueValid(int integer) {
        int doubled = 2 * integer;

        if (containsZero(doubled)) {
            return false;
        }

        if (hasRepeatedDigits(doubled)) {
            return false;
        }

        if (!hasSameDigits(doubled, integer)) {
            return false;
        }

        return true;
    }

    public static boolean hasSameDigits(int int1, int int2) {
        String str1 = String.valueOf(int1);
        String str2 = String.valueOf(int2);

        for (int i = 0; i < str1.length(); i++) {
            char digit = str1.charAt(i);

            if (str2.indexOf(digit) == -1) {
                return false;
            }
        }

        return true;
    }

    public static void output(PrintWriter outFile, int integer) {
        outFile.println(integer + " " + integer * 2);
    }
}
