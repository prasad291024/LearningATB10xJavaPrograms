package Personal_Practice;

import java.util.Scanner;

public class SwappingNums1
{
    public static void main(String[] args)
    {
        int x, y, temp;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Numbers to swap");

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("You have entered number X = " + x + " and Y = " + y +" " );

        temp = x;
        x = y ;
        y = temp;

        System.out.println("After swapping, Numbers are X = " + x + " and Y = " + y +" " );

        in.close();

    }

}

