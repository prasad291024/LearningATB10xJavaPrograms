package Task31stJan;

import java.util.Scanner;

public class Q5_Bonus_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking salary input
        System.out.print("Enter your salary: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Salary must be a positive number.");
            return;
        }
        double salary = scanner.nextDouble();

        // Taking years of experience input
        System.out.print("Enter your years of experience: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Years of experience must be a positive integer.");
            return;
        }
        int yearsOfExperience = scanner.nextInt();

        // Input validation
        if (salary <= 0) {
            System.out.println("Invalid input! Salary must be greater than zero.");
            return;
        }
        if (yearsOfExperience < 0) {
            System.out.println("Invalid input! Years of experience cannot be negative.");
            return;
        }

        // Bonus calculation logic
        double bonusPercentage = 0;
        if (yearsOfExperience < 1) {
            bonusPercentage = 0;
        } else if (yearsOfExperience >= 1 && yearsOfExperience <= 3) {
            bonusPercentage = 5;
        } else if (yearsOfExperience >= 4 && yearsOfExperience <= 6) {
            bonusPercentage = 10;
        } else {
            bonusPercentage = 15;
        }

        // Calculate bonus amount
        double bonusAmount = (salary * bonusPercentage) / 100;

        // Display output
        System.out.println("Your bonus percentage: " + bonusPercentage + "%");
        System.out.println("Your bonus amount: Rs." + bonusAmount);

        scanner.close();
    }

}
