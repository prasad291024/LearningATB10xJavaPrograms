package Task29thJan_Basic_If_Else;

import java.util.Scanner;
public class VowelOrConsonantEdgeCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = scanner.next();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Invalid input! Please enter a single letter.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }

        scanner.close();
    }
}