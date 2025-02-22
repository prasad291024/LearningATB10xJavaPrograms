package Task20thFeb;

class BankAccount {
    private double balance; // Private variable

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter method to access private variable
    public double getBalance() {
        return balance;
    }

    // Setter method to modify private variable
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }
}

// Main class
public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(500);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
