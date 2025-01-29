package Task26thJan;

import java.util.Scanner;

public class Q1_Reverse_Number {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to reverse: ");
            int num = scanner.nextInt();

            int reverse = 0;

            // Using for loop to reverse the number
            for (; num != 0; num /= 10) {
                int digit = num % 10; // Extract last digit
                reverse = reverse * 10 + digit; // Append digit to reverse
            }

            System.out.println("Reversed Number: " + reverse);
            scanner.close();
        }
    }


