package Task29thJan_Basic_If_Else;

import java.util.Scanner;

public class PositiveNegativeCheckEdgeCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0; // Initialize number

        System.out.print("Enter a number: ");

        // Handle invalid input (non-numeric)
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Invalid input! Please enter a valid number.");
            scanner.close();
            return; // Exit program
        }

        // Check for special floating-point cases
        if (Double.isNaN(number)) {
            System.out.println("The number is Not-a-Number (NaN).");
        } else if (Double.isInfinite(number)) {
            System.out.println("The number is Infinity.");
        } else if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
