package Task7thFeb;

import java.util.Scanner;

public class PrimeNum_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to num/2 (no need to check beyond num/2)
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) { // If divisible, not prime
                    isPrime = false;
                    break; // No need to check further
                }
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
