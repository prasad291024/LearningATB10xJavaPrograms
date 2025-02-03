package Task1stFeb;

import java.util.Scanner;

public class Q2_DaysConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days;

        // Edge case - Ensure positive integer input from user
        while (true) {
            System.out.print("Enter the number of days: ");
            if (scan.hasNextInt()) {
                days = scan.nextInt();

                if (days >= 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Invalid input! Days cannot be negative. Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scan.next(); // Clear invalid input
            }
        }

        // Conversion logic
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int finalDays = remainingDays % 30;

        // Print result
        System.out.println(days + " days = " + years + " years, " + months + " months, and " + finalDays + " days.");

        scan.close();
    }
}
