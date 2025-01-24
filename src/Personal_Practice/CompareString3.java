package Personal_Practice;

import java.util.Scanner;

//Program to Compare Strings Using .compareTo() Method
public class CompareString3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();


        int result = str1.compareTo(str2);

        if (result == 0)
        {
            System.out.println("Using .compareTo(): The strings are equal.");
        }
        else if (result > 0)
        {
            System.out.println("Using .compareTo(): The first string is lexicographically greater than the second.");
        }
        else
        {
            System.out.println("Using .compareTo(): The first string is lexicographically smaller than the second.");
        }

        scanner.close();
    }
}
