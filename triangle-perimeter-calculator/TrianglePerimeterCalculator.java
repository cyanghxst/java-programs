import java.util.Scanner;

public class TrianglePerimeterCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1, y1, x2, y2, x3, y3;
        double perimeter;
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

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double deltaXSquare = Math.pow(x1 - x2, 2);
        double deltaYSquare = Math.pow(y1 - y2, 2);
        double distance = Math.sqrt(deltaXSquare + deltaYSquare);
        return distance;
    }

    public static boolean isValid(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (x1 < 0 || x1 > 40 || y1 < 0 || y1 > 40 ||
            x2 < 0 || x2 > 40 || y2 < 0 || y2 > 40 ||
            x3 < 0 || x3 > 40 || y3 < 0 || y3 > 40) {
            return false;
        }

        double distance1to2 = calculateDistance(x1, y1, x2, y2);
        double distance2to3 = calculateDistance(x2, y2, x3, y3);
        double distance3to1 = calculateDistance(x3, y3, x1, y1);

        if (distance1to2 + distance2to3 == distance3to1) {
            return false;
        }

        return true;
    }
}
