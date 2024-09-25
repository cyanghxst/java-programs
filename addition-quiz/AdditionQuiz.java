import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = (int) (Math.random() * 101);
        int num2 = (int) (Math.random() * 101);
        int answer = num1 + num2;
        int input;

        do {
            System.out.print(num1 + " + " + num2 + " = ");
            input = scan.nextInt();

            if (input != answer) {
                System.out.println("\nTry Again!\n");
            }
        } while (input != answer);

        System.out.println("\nCorrect!");
    }
}
