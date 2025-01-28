package Task25thJan;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.println("Enter a string:");
        String originalString = scanner.nextLine();

        // Reverse the string using charAt()
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        // Check if the original string is equal to the reversed string
        if (originalString.equals(reversedString)) {
            System.out.println("The string \"" + originalString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + originalString + "\" is not a palindrome.");
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
