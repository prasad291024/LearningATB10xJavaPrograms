package Personal_Practice;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer");

        n = scan.nextInt();

        while (n != 0)
        {
            System.out.println("You entered " +n);
            System.out.println("Please input another integer (or 0 to exit):");
            n = scan.nextInt(); // Update the value of n
        }

        System.out.println("Out of loop");
        scan.close(); // Close the scanner to release resources

    }
}
