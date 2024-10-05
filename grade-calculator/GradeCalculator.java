public class GradeCalculator {
    public static void main(String[] args) {
        printGrade(78.5);
        printGrade(69.6);
        System.out.println("The grade is " + getGrade(79.5));
        System.out.println("The grade is " + getGradeNew(40.3));
    }

    public static void printGrade(double gradePoints) {
        if (gradePoints >= 90) {
            System.out.println("The grade is A");
        } else if (gradePoints >= 80) {
            System.out.println("The grade is B");
        } else if (gradePoints >= 70) {
            System.out.println("The grade is C");
        } else if (gradePoints >= 60) {
            System.out.println("The grade is D");
        } else if (gradePoints >= 50) {
            System.out.println("The grade is E");
        } else {
            System.out.println("The grade is F");
        }
    }
    public static char getGrade(double gradePoints) {
        char grade;

        if (gradePoints >= 90) {
            grade = 'A';
        } else if (gradePoints >= 80) {
            grade = 'B';
        } else if (gradePoints >= 70) {
            grade = 'C';
        } else if (gradePoints >= 60) {
            grade = 'D';
        } else if (gradePoints >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static char getGradeNew(double gradePoints) {
        if (gradePoints >= 90) {
            return 'A';
        } else if (gradePoints >= 80) {
            return 'B';
        } else if (gradePoints >= 70) {
            return 'C';
        } else if (gradePoints >= 60) {
            return 'D';
        } else if (gradePoints >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
