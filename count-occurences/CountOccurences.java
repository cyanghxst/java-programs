public class CountOccurences {
    public static void main(String[] args) {
        final int SIZE = 100;

        char[] array = genRandomArray(SIZE);
    }

    public static char[] genRandomArray(int size) {
        char[] array = new char[size];
        int random;

        for (int i = 0; i < array.length; i++) {
            random = (int) ((Math.random() * 16) + 97);
            array[i] = (char) random;
        }

        return array;
    }

    public static int countChar(char ch, char[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                count++;
            }
        }

        return count;
    }

    public static void countCharInArray(char[] array) {
        System.out.print("There are ");

        for (int charNum = 97; charNum <= 122; charNum++) {
            char charName = (int) charNum;
            int count = countChar(ch, array);

            if (count > 0) {
                System.out.printf("%d %c's ", count, charName);
            }
        }

        System.out.println();
    }
}
