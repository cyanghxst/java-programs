import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter full year (e.g., 2001): ");
            int year = scan.nextInt();

            System.out.print("Enter month in number between 1 and 12: ");
            int month = scan.nextInt();

            if (isValid(month, year)) {
                printHeader(month, year);
                printBody(month, year);
            }

            while (true) {
                System.out.print("\nWould you like to continue? [yes/no]: ");
                String input = scan.next();

                if (input.equalsIgnoreCase("yes")) {
                    break;
                } else if (input.equalsIgnoreCase("no")) {
                    System.out.println("\nGoodbye Senpai (⌒ω⌒)ﾉ~");
                    return;
                }
            }

            System.out.println();
        }
    }

    public static boolean isValid(int month, int year) {
        if (year < 1582 && (month < 1 || month > 12)) {
            System.out.println("\nBoth month and year are invalid.");
            return false;
        }

        if (month < 1 || month > 12) {
            System.out.println("\nThe month is invalid.");
            return false;
        }

        if (year < 1582) {
            System.out.println("\nThe year is invalid.");
            return false;
        }

        return true;
    }

    public static void printHeader(int month, int year) {
        String monthName = monthName(month);
        String line = "-----------------------------";

        System.out.println();

        printSpaces(monthName, year, line);
        System.out.println(monthName + " " + year);
        System.out.println(line);
    }

    public static String monthName(int month) {
        switch(month) {
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            default:
                return "December";
        }
    }

    public static void printSpaces(String monthName, int year, String line) {
        String yearString = String.valueOf(year);

        int lineLength = line.length();
        int monthNameLength = monthName.length();
        int yearLength = yearString.length();

        int count = (lineLength - (monthNameLength + yearLength + 1)) / 2;

        for (int i = 1; i <= count; i++) {
            System.out.print(" ");
        }
    }

    public static void printBody(int month, int year) {
        printDaysInAWeek();
        printDays(month, year);
    }

    public static void printDaysInAWeek() {
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printDays(int month, int year) {
        int start = startDay(month, year);
        int days = daysInAMonth(month, year);

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

    public static int startDay(int month, int year) {
        switch (month) {
            case 1:
                month = 11;
                year = year - 1;
                break;
            case 2:
                month = 12;
                year = year - 1;
                break;
            default:
                month = month - 2;
        }

        // Zeller's congruence (Sunday-is-0 variant)
        int twoDigitsOfYear = year % 100;
        int century = year / 100;

        int dayOfTheWeek = ((1 + (13 * month - 1) / 5) + twoDigitsOfYear + (twoDigitsOfYear / 4) + (century / 4) - (2 * century)) % 7;

        while (dayOfTheWeek < 0) {
            dayOfTheWeek += 7;
        }

        return dayOfTheWeek;
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
}
