package Task29thJan_Basic_If_Else;

import java.util.Scanner;

public class EvenOddCheckEdgeCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // Check if the input is an integer
        if (scanner.hasNextLong()) {
            long number = scanner.nextLong(); // Using long to handle very large numbers

            if (number == 0) {
                System.out.println("0 is neither even nor odd, but it is divisible by 2.");
            } else if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        scanner.close();
    }
}
