package Personal_Practice;

import java.util.Scanner;

public class ReverseNoEdgeCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");

        // Validate user input to avoid non-numeric values
        if (!sc.hasNextLong()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            return;  // Exit program if input is invalid
        }

        long num = sc.nextLong(); // Use long for large numbers


        // Convert number to String to preserve leading zeros
        String numStr = String.valueOf(num);
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        // Handle negative numbers separately
        if (num < 0) {
            reversedStr = "-" + new StringBuilder(numStr.substring(1)).reverse().toString();
        }

        // Print reversed number
        System.out.println("Reversed number: " + reversedStr);



        sc.close(); // Close scanner to prevent resource leak
    }

}
