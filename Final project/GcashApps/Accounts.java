package GcashApps;

public class Accounts {
    //private String accountName;
    private double balance;

    public Accounts(String accountName, double initialBalance) {
        //this.accountName = accountName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Successfully deposited ₱" + amount);
            showBalance();
        } else {
            System.out.println("⚠️ Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Successfully withdrew ₱" + amount);
            showBalance();
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    public void showBalance() {
        System.out.println("💼 Current balance: ₱" + balance);
    }

    public double getBalance() {
        return balance;
    }
}
