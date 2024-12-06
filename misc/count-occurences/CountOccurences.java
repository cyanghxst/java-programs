public class CountOccurences {
    public static void main(String[] args) {
        final int SIZE = 100;
        char[] array = genRandomArray(SIZE);

        System.out.println("In this array");
        printArray(array);

        System.out.println();

        countCharInArray(array);
    }

    public static char[] genRandomArray(int size) {
        char[] array = new char[size];
        int random;

        for (int i = 0; i < array.length; i++) {
            random = (int) ((Math.random() * 26) + 97);
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
        System.out.println("There are");

        for (int charNum = 97; charNum <= 122; charNum++) {
            char charName = (char) charNum;
            int count = countChar(charName, array);

            if (count > 0) {
                System.out.printf("%d %c's\n", count, charName);
            }
        }
    }

    public static void printArray(char[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf("%c]", array[i]);
            } else {
                System.out.printf("%c, ", array[i]);
            }

            if ((i + 1) % 10 == 0 && i < array.length - 1) {
                System.out.printf("\n ");
            } else if (i == array.length - 1){
                System.out.println();
            }
        }
    }
}
