public class BankAccount {
    static String bankName = "HDFC Bank";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Om", "123456");
        BankAccount acc2 = new BankAccount("Ram", "789012");

        acc1.displayAccountDetails();
        System.out.println();

        acc2.displayAccountDetails();
        System.out.println();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
