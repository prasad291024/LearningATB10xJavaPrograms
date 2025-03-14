package ex_09_Switch;

import java.util.Scanner;

public class LabP1_Switch_Basics {
    public static void main(String[] args) {
        // Program to display day name based on number input
        // Input: Number from 1 to 7
        // Output: Corresponding day name (Mon, Tue, etc.)
        // Invalid input: Numbers outside 1-7 range
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number(1 to 7)");
        int day = sc.nextInt();

        // Validate input
        if (day < 1 || day > 7) {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
            sc.close();
            return;
        }

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
        
        sc.close(); // Close the scanner
    }
}