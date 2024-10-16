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

        printHeader(year, month);
    }

    public static void printHeader(int year, int monthNumber) {
        String monthName;

        switch(monthNumber) {
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

        System.out.printf("          %s %d          \n", monthName, year);
    }
}
