import java.util.Scanner;

public class TrianglePerimeterCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1, y1, x2, y2, x3, y3;
        String input;

        System.out.println("This program calculates the perimetre of a triangle.");

        do {
            System.out.print("Please enter the x-coordinate for the point1: ");
            x1 = scan.nextInt();

            System.out.print("Please enter the y-coordinate for the point1: ");
            y1 = scan.nextInt();

            System.out.print("Please enter the x-coordinate for the point2: ");
            x2 = scan.nextInt();

            System.out.print("Please enter the y-coordinate for the point2: ");
            y2 = scan.nextInt();

            System.out.print("Please enter the x-coordinate for the point3: ");
            x3 = scan.nextInt();

            System.out.print("Please enter the y-coordinate for the point3: ");
            y3 = scan.nextInt();

            System.out.print("\nWould you like to repeat the program? ");
            input = scan.next();
        } while (!input.equalsIgnoreCase("no"));
    }
}
