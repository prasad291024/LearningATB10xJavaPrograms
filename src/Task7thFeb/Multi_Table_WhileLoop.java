package Task7thFeb;

import java.util.Scanner;

public class Multi_Table_WhileLoop {

    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to generate it's Multiplication Table: ");
        int num = in.nextInt();
        System.out.println("Here is the Multiplication Table of " + num + " : ");
        while(i<= 10)
        {
            i ++; // Incrementing the value of i
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
