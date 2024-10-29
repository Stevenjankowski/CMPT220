import java.util.Scanner;

public class Drinking {

    public static void checkDrinkingEligibility(int age) {
        
        int ageGroup = (age / 10) * 10;

        switch (ageGroup) {
            case 0:
            case 10:
                System.out.println("You cannot drink.");
                break;
            case 20:
                System.out.println("You may be able to drink, depending on your location.");
                break;
            default:
                System.out.println("You can drink.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        
        checkDrinkingEligibility(age);

        scanner.close();
    }
}