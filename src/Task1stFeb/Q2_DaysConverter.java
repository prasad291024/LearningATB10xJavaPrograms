package Task1stFeb;

import java.util.Scanner;

public class Q2_DaysConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of days: ");
        int days = scan.nextInt();

        // Validate input
        if (days < 0) {
            System.out.println("Invalid input! Days cannot be negative.");
        } else {
            // Conversion logic
            int years = days / 365;
            int remainingDays = days % 365;
            int months = remainingDays / 30;
            int finalDays = remainingDays % 30;

            // Print the result
            System.out.println(days + " days = " + years + " years, " + months + " months, and " + finalDays + " days.");
        }

        scan.close();
    }
}
