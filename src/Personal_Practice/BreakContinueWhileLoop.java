package Personal_Practice;

import java.util.Scanner;

public class BreakContinueWhileLoop {
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter an Integer");
            n = scan.nextInt();

            if(n != 0)
            {
                System.out.println("You entered: " +n + " Enter zero to break a loop ");
                continue;
            }

            else
            {
                break;
            }
        }

    }
}
