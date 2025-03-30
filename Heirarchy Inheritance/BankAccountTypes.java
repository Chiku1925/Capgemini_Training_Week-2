class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNo, double bal, double interestRate) {
        super(accNo, bal);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(String accNo, double bal, int withdrawalLimit) {
        super(accNo, bal);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(String accNo, double bal, int tenure) {
        super(accNo, bal);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("SAV123", 5000, 4.5);
        CheckingAccount c = new CheckingAccount("CHK123", 10000, 3);
        FixedDepositAccount f = new FixedDepositAccount("FD123", 50000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
