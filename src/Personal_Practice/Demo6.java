package Personal_Practice;

import java.util.Scanner;

public class Demo6 {

    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int n2 = scan.nextInt();

        //performing operations -

        System.out.println("Addition: " + (n1 + n2) );
        System.out.println("Subtraction: " + (n1 - n2) );
        System.out.println("Multiplication: " + (n1 * n2) );
        System.out.println("Division: " + (n1 / n2) );
        System.out.println("Reminder: " + (n1 % n2) );


scan.close();
    }
}