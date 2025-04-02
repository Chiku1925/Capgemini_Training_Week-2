interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
}

abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public abstract void displayAccountInfo();
}

class SavingsAccount extends BankAccount implements AccountOperations {
    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void displayAccountInfo() {
        System.out.println("Savings Account: " + getAccountNumber() + " Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        AccountOperations acc = new SavingsAccount("SB1001", 5000);
        acc.deposit(2000);
        acc.withdraw(1000);
        ((SavingsAccount) acc).displayAccountInfo();
    }
}
