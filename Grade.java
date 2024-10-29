import java.util.Scanner;

public class Grade {

    public static String getGrade(int score) {
        int grade = score / 10;  // Get the tens digit

        switch (grade) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your score (or enter 0 to exit): ");
            int score = scanner.nextInt();

            if (score == 0) {
                System.out.println("Exiting...");
                break;  // Exit the loop if the score is 0
            }

            String grade = getGrade(score);
            System.out.println("Your grade is: " + grade);
        }

        scanner.close();
    }
}