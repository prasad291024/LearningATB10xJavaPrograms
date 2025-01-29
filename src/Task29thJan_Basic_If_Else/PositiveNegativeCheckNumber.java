package Task29thJan_Basic_If_Else;

import java.util.Scanner;

public class PositiveNegativeCheckNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Create Scanner object

            // Ask the user to enter a number
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble(); // Read user input (double for handling decimal values)

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number is Positive.");
            } else if (number < 0) {
                System.out.println("The number is Negative.");
            } else {
                System.out.println("The number is Zero.");
            }

            scanner.close(); // Close the scanner to prevent resource leaks
        }
    }


