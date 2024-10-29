import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read the age from user input

        // Ternary operator to check drinking eligibility
        String result = (age < 21) ? "cannot drink" : "can drink";

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}