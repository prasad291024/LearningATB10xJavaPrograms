package Personal_Practice;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();

        System.out.println("Equal to: "+ (a == b));
        System.out.println("Not Equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b ));
        System.out.println("Greater than and equal to: " + (a >= b));
        System.out.println("Less than and equal to: " + (a <=b ));





        scan.close();

    }
}
