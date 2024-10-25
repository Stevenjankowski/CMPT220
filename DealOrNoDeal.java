import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DealOrNoDeal {
    static double[] caseValues = {
        0.01, 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> cases = new ArrayList<>();

        for (int i = 1; i <= caseValues.length; i++) {
            cases.add(i);
        }

        Collections.shuffle(cases);

        System.out.print("Choose your case (1-26): ");
        int userCase = scanner.nextInt();

        double userCaseValue = caseValues[cases.get(userCase - 1) - 1];

        System.out.println("Your case is case #" + userCase);

        ArrayList<Integer> openedCases = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            System.out.print("Pick a case to open (1-26): ");
            int chosenCase = scanner.nextInt();


            while (chosenCase == userCase || openedCases.contains(chosenCase)) {
                System.out.println("You cannot choose your own case or an already opened case.");
                System.out.print("Pick a different case: ");
                chosenCase = scanner.nextInt();
            }

            openedCases.add(chosenCase);
            double chosenCaseValue = caseValues[cases.get(chosenCase - 1) - 1];
            System.out.println("Case Number" + chosenCase + " contains: $" + chosenCaseValue);
        }
        System.out.println("\nRemaining unopened cases and their values:");
        for (int i = 1; i <= caseValues.length; i++) {
            if (i != userCase && !openedCases.contains(i)) {
                double caseValue = caseValues[cases.get(i - 1) - 1];
                System.out.println("Case #" + i + " contains: $" + caseValue);
            }
        }
        System.out.println("\nGame Over. You chose case Number" + userCase + " with a value of $" + userCaseValue);

        scanner.close();

    }
}
