package Task1stFeb;

import java.util.Scanner;

public class Q4_Age_Category {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask for the age input
        System.out.print("Enter your age: ");

        // Check if the next input is a valid integer
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            // Check if the age is valid (non-negative)
            if (age < 0) {
                System.out.println("Please enter a valid age (age cannot be negative).");
            } else {
                // Implement age category logic
                if (age >= 65) {
                    System.out.println("You are a Senior Citizen.");
                } else if (age >= 20) {
                    System.out.println("You are an Adult.");
                } else if (age >= 13) {
                    System.out.println("You are a Teenager.");
                } else if (age >= 0) {
                    System.out.println("You are a Child.");
                }
            }
        } else {
            System.out.println("Invalid input! Please enter a valid number for age.");
        }

        // Close the scanner
        scanner.close();
        }
    }


