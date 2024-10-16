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
        printDays(month, year);
    }

    public static void printDaysInAWeek() {
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printDays(int month, int year) {
        int days = daysInAMonth(month, year);
        int start = startDay(month, year);

        int count = 1;

        for (int i = 1; i <= start; i++) {
            System.out.printf("    ");
            count++;
        }

        for (int day = 1; day <= days; day++) {
            if (day / 10 == 0) {
                System.out.printf("   " + day);
            } else {
                System.out.printf("  " + day);
            }

            if (count % 7 == 0) {
                System.out.println();
            }

            count++;
        }

        System.out.println();

    }

    public static int daysInAMonth(int month, int year) {
        int days;

        switch (month) {
            case 2:
                days = (isLeap(year) ? 29 : 28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        return days;
    }

    public static boolean isLeap(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }

    public static int startDay(int month, int year) {
        switch (month) {
            case 1:
                month = 13;
                year = year - 1;
                break;
            case 2:
                month = 14;
                year = year - 1;
                break;
        }

        // Zeller's congruence
        int twoDigitsOfYear = year % 100;
        int century = year / 100;

        int dayOfTheWeek = (1 + (13 * (month + 1) / 5) + twoDigitsOfYear + twoDigitsOfYear / 4 + century / 4 - 2 * century) % 7;

        return dayOfTheWeek;
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
