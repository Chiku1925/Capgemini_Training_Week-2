
class BankAccount {
    public String accountNumber;       
    protected String accountHolder;    
    private double balance;            
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public void displaySavingsInfo() {
        System.out.println("Savings Account Info:");
        System.out.println("Account Number (public): " + accountNumber);  
        System.out.println("Account Holder (protected): " + accountHolder); 
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class 
public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", "Om", 1000.0);
        acc1.displayInfo();
        System.out.println();

        acc1.deposit(500.0);
        acc1.withdraw(300.0);
        System.out.println("Updated Balance: " + acc1.getBalance());
        System.out.println();

        SavingsAccount savAcc = new SavingsAccount("789012", "Ram", 2000.0, 4.5);
        savAcc.displaySavingsInfo();
        savAcc.deposit(250.0);
    }
}

