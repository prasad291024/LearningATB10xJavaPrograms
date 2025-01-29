package Task29thJan_Basic_If_Else;

import java.util.Scanner;
public class VotingEligibilityEdgeCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid age.");
        } else {
            int age = scanner.nextInt();

            if (age < 0 || age > 150) {
                System.out.println("Invalid age! Please enter a realistic age.");
            } else if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }

        scanner.close();
    }
}
