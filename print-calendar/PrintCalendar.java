import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2001): ");
        int year = scan.nextInt();

        System.out.print("Enter month in number between 1 and 12: ");
        int month = scan.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("\nYou entered invalid month");
            return;
        }

        printHeader(month, year);
        printBody(month, year);
    }

    public static void printBody(int month, int year) {
        printDaysInAWeek();
    }

    public static void printDaysInAWeek() {
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printHeader(int month, int year) {
        String monthName = monthName(month);
        String line = "-----------------------------";

        System.out.println();
        printPreceedingSpaces(monthName, year, line);
        System.out.println(monthName + " " + year);
        System.out.println(line);
    }

    public static void printPreceedingSpaces(String monthName, int year, String line) {
        String yearString = String.valueOf(year);

        int lineLength = line.length();
        int monthNameLength = monthName.length();
        int yearLength = yearString.length();

        int count = (lineLength - (monthNameLength + yearLength + 1)) / 2;

        for (int i = 1; i <= count; i++) {
            System.out.print(" ");
        }
    }

    public static String monthName(int month) {
        String monthName;

        switch(month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "Febuary";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "none";
        }

        return monthName;
    }
}
