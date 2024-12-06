public class LastIndex {
    public static void main(String[] args) {
        String str = "Hello, world! Hello!";

        System.out.println("01234567890123456789");
        System.out.println(str);

        int firstIndex = str.indexOf("Hello");
        int lastIndex = str.lastIndexOf("Hello");

        System.out.printf("\nFirst index of \"Hello\" is %d\n", firstIndex);
        System.out.printf("\nLast index of \"Hello\" is %d\n", lastIndex);
    }
}
