import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter a number: ");
       int number = scan.nextInt();

       int integer = 1;

       for (int i = 1; i <= number; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(integer + " ");
               integer++;
           }
           System.out.println();
       }
    }
}
