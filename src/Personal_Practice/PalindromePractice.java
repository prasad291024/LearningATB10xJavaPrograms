package Personal_Practice;

import java.util.Scanner;

public class PalindromePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        // Loop until a valid integer is entered
        while (true) {
            System.out.println("Enter a positive integer: ");

            // Check if the input is an integer
            if (scan.hasNextInt()) {
                num = scan.nextInt();

                // Ensure the number is positive
                if (num >= 0) {
                    break; // Valid input, exit the loop
                } else {
                    System.out.println("Invalid number! Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scan.next(); // Clear invalid input from scanner
            }
        }

        // Palindrome logic
        int temp = num;
        int rev = 0;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        // Check if the number is a palindrome
        if (num == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scan.close();
    }
}
