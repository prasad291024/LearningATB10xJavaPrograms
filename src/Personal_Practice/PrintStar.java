package Personal_Practice;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        // now use loop for number of rows
        for(int i = 1; i <=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
