package Task30thJan;

import java.util.Scanner;

public class Q5_GradeCalculator {
    public static void main(String[] args) {
        // Step 1: Take user input for marks
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks (0-100): ");
        int marks = scanner.nextInt();

        // Step 2: Check validity of marks
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else {
            // Step 3: Determine the grade using if-else-if conditions
            char grade;
            if (marks >= 90 && marks <= 100) {
                grade = 'A'; // A+
                System.out.println("Grade: A+");
            } else if (marks >= 80) {
                grade = 'A';
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                grade = 'B';
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                grade = 'C';
                System.out.println("Grade: C");
            } else if (marks >= 50) {
                grade = 'D';
                System.out.println("Grade: D");
            } else if (marks >= 40) {
                grade = 'E';
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: Fail");
            }
        }
    }
}
