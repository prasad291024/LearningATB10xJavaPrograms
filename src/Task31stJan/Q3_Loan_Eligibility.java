package Task31stJan;

import java.util.Scanner;

public class Q3_Loan_Eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Age must be an integer.");
            return;
        }
        int age = scanner.nextInt();
        if (age <= 0) {
            System.out.println("Age must be a positive integer.");
            return;
        } else if (age < 18) {
            System.out.println("You must be at least 18 years old to apply for a loan.");
            return;
        } else if (age > 80) {
            System.out.println("Maximum eligible age for a loan is 80 years.");
            return;
        }
        System.out.print("Enter your salary: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Salary must be a positive number.");
            return;
        }
        double salary = scanner.nextDouble();
        if (salary <= 0) {
            System.out.println("Salary must be a positive number.");
            return;
        } else if (salary < 30000) {
            System.out.println("Minimum salary requirement is 30,000.");
            return;
        }
        System.out.print("Enter your credit score: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Credit score must be an integer.");
            return;
        }
        int creditScore = scanner.nextInt();
        if (creditScore <= 0) {
            System.out.println("Credit score must be a positive integer.");
            return;
        } else if (creditScore < 650) {
            System.out.println("Minimum credit score requirement is 650.");
            return;
        } else if (creditScore > 850) {
            System.out.println("Maximum credit score allowed is 850.");
            return;
        }
        System.out.println("Congratulations! You are eligible for a loan.");
        scanner.close();
    }

}
