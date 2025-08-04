package Personal_Practice;

import java.util.Scanner;

public class Demo5_bank {

    final double MIN_BALANCE = 500;

    public void openbalance(double deposit)
    {
        if(deposit < MIN_BALANCE)
        {
            System.out.println("Minimum balance should be " + MIN_BALANCE);
        }
        else {
            System.out.println("Account credited successfully");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner to take input

        System.out.print("Enter deposit amount: ");
        double deposit = scanner.nextDouble();     // Read user input

        Demo5_bank bank = new Demo5_bank();
        bank.openbalance(deposit);

        scanner.close(); // Close scanner
    }
}
