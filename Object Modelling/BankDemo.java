class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }
}

class Bank {
    void openAccount(Customer c) {
        System.out.println("Account opened for " + c.name);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice", 1000);
        Bank b = new Bank();
        b.openAccount(c1);
        c1.viewBalance();
    }
}
