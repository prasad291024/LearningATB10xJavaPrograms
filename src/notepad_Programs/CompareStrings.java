package notepad_Programs;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = scan.nextLine();
        System.out.println("Enter the second string");
        String str2 = scan.nextLine();
        if (str1.compareTo(str2) > 0) {
            System.out.println("First string is greater than second.");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("First string is smaller than second.");
        } else {
            System.out.println("Both strings are equal.");
        }

        System.out.println("----------------------------------");

        if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.println("First string is greater than second.");
        } else if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println("First string is smaller than second.");
        } else {
            System.out.println("Both strings are equal.");
        }

        System.out.println("----------------------------------");

        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        System.out.println("----------------------------------");

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
        scan.close();
    }

}
