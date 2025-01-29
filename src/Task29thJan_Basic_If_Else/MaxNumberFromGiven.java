package Task29thJan_Basic_If_Else;

import java.util.Scanner;

public class MaxNumberFromGiven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Using if-else to find the maximum
        if (num1 > num2) {
            System.out.println("The maximum number is: " + num1);
        } else {
            System.out.println("The maximum number is: " + num2);
        }

        scanner.close();
    }
}
