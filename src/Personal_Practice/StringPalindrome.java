package Personal_Practice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Reverse the string
        String reversed = reverseString(original);

        // Print original and reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        // Check if it is a palindrome
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a palindrome.");
        }

        sc.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}


