package Personal_Practice;

import java.util.Scanner;

//Program to Compare Strings Using .equals() Method
public class CompareString2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();


        if (str1.equals(str2))
        {
            System.out.println("The strings are equal in content.");
        }
        else
        {
            System.out.println("The strings are not equal in content.");
        }
        scanner.close();
    }
}
