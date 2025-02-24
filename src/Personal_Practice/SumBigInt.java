package Personal_Practice;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigInt {
    public static void main(String[] args) {
        String number1, number2;
        // Declare two string variables to store the input numbers
        Scanner sc = new Scanner(System.in);
         // Create a Scanner object to read input

        System.out.println("Enter first large integer: ");
         // Prompt the user to enter the first number
        number1 = sc.nextLine();
        // Read the first number as a string

        System.out.println("Enter second large integer: ");
        // Prompt the user to enter the second number
        number2 = sc.nextLine();
        // Read the second number as a string

        BigInteger first = new BigInteger(number1);
        // Convert the first string to a BigInteger object
        BigInteger second = new BigInteger(number2);
        // Convert the second string to a BigInteger object

        BigInteger sum;
        sum = first.add(second);
        // Add the two BigInteger objects and store the result in 'sum'

        System.out.println("Result of addition = " + sum);


    }
}
