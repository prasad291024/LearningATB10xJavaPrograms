package Task31stJan;

import java.util.Scanner;

public class Q4_Electric_Bill_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid positive integer value for units.");
            scanner.close();
            return;
        }
        int units = scanner.nextInt();

        if (units < 0) {
            System.out.println("Units cannot be negative. Please enter a valid number of units.");
            scanner.close();
            return;
        }

        double billAmount = 0;
        if (units <= 100) {
            billAmount = units * 0.50;
        } else if (units <= 200) {
            billAmount = (100 * 0.50) + ((units - 100) * 0.75);
        } else if (units <= 300) {
            billAmount = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
        } else {
            billAmount = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
        }

        System.out.println("Total electricity bill: Rs. " + billAmount);
        scanner.close();
    }
}
