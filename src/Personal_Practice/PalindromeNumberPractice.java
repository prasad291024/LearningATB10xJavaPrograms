package Personal_Practice;

/*  inputs - number (int)
    output - message saying if it is a palindrome or not
    process - take user input
                  reverse the number
                  compare the number with the reversed number
                  if they are equal then it is a palindrome
                  if they are not equal then it is not a palindrome
                  print the message
 */

import java.util.Scanner;

public class PalindromeNumberPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome or not: ");
        int number = input.nextInt();

        while (number < 0) {
            System.out.println("Please enter a positive number: ");
            number = input.nextInt();
        }
        int reversedNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number");
        } else {
            System.out.println(originalNumber + " is not a palindrome number");
        }

        input.close();
    }

}
