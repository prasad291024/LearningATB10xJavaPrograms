package Task29thJan_Basic_If_Else;

import java.util.Scanner;
public class MaxOfTwoNumbersEdgeCases {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println("The maximum number is: " + num1);
            } else if (num2 > num1) {
                System.out.println("The maximum number is: " + num2);
            } else {
                System.out.println("Both numbers are equal: " + num1);
            }

            scanner.close();
        }
    }


