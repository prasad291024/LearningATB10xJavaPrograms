package Task31stJan;

import java.util.Scanner;

public class Q6_Net_Salary_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for basic pay
        System.out.print("Enter Basic Pay of the Employee: ");

        // Validating user input
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Basic Pay must be a positive number.");
            return;
        }

        double basicPay = scanner.nextDouble();

        if (basicPay <= 0) {
            System.out.println("Basic Pay must be greater than zero.");
            return;
        }

        // HRA is 20% of basic pay
        double hra = 0.20 * basicPay;
        // DA is 15% of basic pay
        double da = 0.15 * basicPay;

        // Calculate Gross Salary
        double grossSalary = basicPay + hra + da;

        // Calculate tax based on salary slabs
        double tax = 0;
        if (grossSalary > 200000) {
            tax = 0.30 * grossSalary; // 30% tax
        } else if (grossSalary > 100000) {
            tax = 0.20 * grossSalary; // 20% tax
        } else if (grossSalary > 50000) {
            tax = 0.10 * grossSalary; // 10% tax
        }

        // Calculate Net Salary
        double netSalary = grossSalary - tax;

        // Display all calculations
        System.out.println("\n=== Salary Breakdown ===");
        System.out.println("Basic Pay: ₹" + basicPay);
        System.out.println("HRA (20% of Basic Pay): ₹" + hra);
        System.out.println("DA (15% of Basic Pay): ₹" + da);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax Deduction: ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);

        scanner.close();
    }
}
