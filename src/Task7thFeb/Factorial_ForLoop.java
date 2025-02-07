package Task7thFeb;

import java.util.Scanner;

public class Factorial_ForLoop {
    public static void main(String[] args) {
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int num = sc.nextInt();
        for(int i =1; i<=num; i++)
        {
            fact = fact * i;
        }
        System.out.print("Factorial of number " + num + " is: " + fact);
    }
}
/* input - num - int
output - factorial of num - int

for i= 1; i<=num; i++
fact = fact*i





 */