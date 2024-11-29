import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IVGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a multiplier (integer): ");
        long multiplier = scanner.nextLong();

        
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nRun " + i + ":");
            generateIV(multiplier);
        }

        scanner.close();
    }

    public static void generateIV(long multiplier) {
       
        LocalDateTime now = LocalDateTime.now();

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyyHHmmssSSS");
        String formattedDateTime = now.format(formatter);

        
        long timeNumber = Long.parseLong(formattedDateTime);
        System.out.println("Current DateTime converted to number: " + timeNumber);

        
        long iv = timeNumber * multiplier;
        System.out.println("Generated IV/Nonce: " + iv);
    }
}