package Task30thJan;

import java.util.Scanner;

public class Q4_LeapYearChecker {
    public static void main(String[] args) {

        System.out.println(" ++ Lets check if year is leap or not ++ ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }

}


