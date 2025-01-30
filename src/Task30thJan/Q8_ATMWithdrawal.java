package Task30thJan;

import java.util.Scanner;

public class Q8_ATMWithdrawal {
        public static void main(String[] args) {
            double balance = 10000.0; // Initial balance
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the amount to withdraw: ₹");
            int withdrawalAmount = scanner.nextInt();

            if (withdrawalAmount <= 0) {
                System.out.println("Error: Withdrawal amount must be greater than zero.");
            } else if (withdrawalAmount % 100 != 0) {
                System.out.println("Error: Amount must be a multiple of 100.");
            } else if (withdrawalAmount > balance) {
                System.out.printf("Error: Insufficient balance. Your current balance is ₹%.2f%n", balance);
            } else {
                balance -= withdrawalAmount;
                System.out.printf("Withdrawal successful. Updated balance is ₹%.2f%n", balance);
            }

            scanner.close();
        }
    }

