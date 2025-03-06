package Task5thMarch;


class BankAccount {
    private double balance;  // Private variable

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        }
    }

    // Getter method (read access)
    public double getBalance() {
        return balance;
    }

    // Setter method (write access with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Cannot access balance directly: System.out.println(account.balance); ❌ ERROR
        System.out.println("Current Balance: " + account.getBalance()); // ✅ Correct

        account.deposit(500); // ✅ Correct
        System.out.println("Updated Balance: " + account.getBalance());
    }
}




