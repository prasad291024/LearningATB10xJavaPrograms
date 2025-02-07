package Task7thFeb;

import java.util.Scanner;

public class Factorial_WhileLoop {
    public static void main(String[] args) {
        int fact = 1;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int num = sc.nextInt();
        while(i<=num)
        {
            fact = fact * i;
            i++;
        }
        System.out.print("Factorial of number " + num + " is: " + fact);
    }
}
