package Personal_Practice;

import java.util.Scanner;
//Program to Compare Strings Using == Operator

public class CompareString1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string");

        String s1 = scan.nextLine();

        System.out.println("Enter the second string");


        String s2 = scan.nextLine();


        if(s1 == s2)
        {

            System.out.println("The strings refer to the same memory location");
        }
        else
        {
            System.out.println("The strings does not refer to the same memory location");
        }
        scan.close();

    }
}
