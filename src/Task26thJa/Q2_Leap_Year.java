package Task26thJa;

import java.util.Scanner;

public class Q2_Leap_Year {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            // Ask the user to enter a year
            System.out.print("Enter a year: ");
            int year = in.nextInt();

            // Check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

            // Close the scanner
            in.close();
        }

        // Method to check if a year is a leap year
        public static boolean isLeapYear(int year) {
            // A year is a leap year if it is divisible by 4
            // However, if the year is divisible by 100, it is not a leap year unless
            // it is also divisible by 400
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    // If divisible by 100, it must also be divisible by 400 to be a leap year
                    return year % 400 == 0;
                } else {
                    // If not divisible by 100, but divisible by 4, it's a leap year
                    return true;
                }
            } else {
                // If not divisible by 4, it's not a leap year
                return false;
            }
        }

    }


