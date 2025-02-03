package Task1stFeb;

import java.util.Scanner;

public class Q1_NumberDivisibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // taking input from user
        int num;

        // Edge case - ensure user enters a valid integer
        while (true) {
            System.out.print("Enter a valid integer: ");
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                break; // Valid input, exit loop
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scan.next(); // Clear invalid input
            }
        }

        // Edge case - Handling special case for zero
        if (num == 0) {
            System.out.println("0 is not valid input.");
        }
        // Logic - Check divisibility conditions
        else if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11.");
        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5 only.");
        } else if (num % 11 == 0) {
            System.out.println(num + " is divisible by 11 only.");
        } else {
            System.out.println(num + " is not divisible by 5 and 11.");
        }

        scan.close();
    }
}
