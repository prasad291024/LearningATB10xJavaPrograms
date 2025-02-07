package Task7thFeb;

import java.util.Scanner;

public class PrimeNum_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            int i = 2; // Start checking from 2
            while (i <= num / 2) {
                if (num % i == 0) { // If divisible, not prime
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }

        sc.close();
    }
}
