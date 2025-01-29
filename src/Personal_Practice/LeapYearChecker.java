package Personal_Practice;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        System.out.println(" ++ Lets check if year is leap or not ++ ");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner to free resources
        scanner.close();
    }

}
