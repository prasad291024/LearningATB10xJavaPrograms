package Task7thFeb;

import java.util.Scanner;

public class Multi_Table_ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to generate it's Multiplication Table: ");
        int num = in.nextInt();

        System.out.println("Here is the Multiplication Table of " + num + " : ");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
