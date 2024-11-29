import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IVGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a multiplier
        System.out.print("Enter a multiplier (integer): ");
        long multiplier = scanner.nextLong();

        // Run the program three times
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nRun " + i + ":");
            generateIV(multiplier);
        }

        scanner.close();
    }

    public static void generateIV(long multiplier) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format it to MMDDYYYYHHMMSSNNN
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyyHHmmssSSS");
        String formattedDateTime = now.format(formatter);

        // Convert the formatted string to a number
        long timeNumber = Long.parseLong(formattedDateTime);
        System.out.println("Current DateTime converted to number: " + timeNumber);

        // Multiply by the user-provided multiplier
        long iv = timeNumber * multiplier;
        System.out.println("Generated IV/Nonce: " + iv);
    }
}