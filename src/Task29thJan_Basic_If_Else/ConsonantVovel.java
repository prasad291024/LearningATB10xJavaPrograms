package Task29thJan_Basic_If_Else;

import java.util.Scanner;

public class ConsonantVovel {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0); // Read first character input

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }

            scanner.close();
        }
}


