package Personal_Practice;

import java.util.Scanner;

public class SwappingNums2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers to swap");

        int x = in.nextInt();
        int y = in.nextInt();

        System.out.println("You have entered: X = " + x + " and Y = " + y );

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping, values are : X = " + x + " and Y = " + y );

        in.close();
    }
}
