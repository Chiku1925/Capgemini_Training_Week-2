public class BankAccount{
    private String accountHolder;
    private long  accountNumber;
    private double balance;
    

    public BankAccount(String accountHolder, long  accountNumber, double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double  amount){

        if (amount>0){
            balance+=amount;
            System.out.println("Deposited Amount= "+ amount);
        }
        else{
            System.out.println("Invalid Amount");
        }


    }

    public void Withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn Amount= "+ amount);
        }

        else if(amount>balance){
            System.out.println("Insufficient Balance....");

        }

        else{
            System.out.println("Invalid Withdrawn Amount!!!!");
        }
    }

    public void displayBalance(){
        System.out.println("AccountHolder Name = "+ accountHolder);
        System.out.println("Account Number = "+ accountNumber);
        System.out.println("Balance = "+ balance);

    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Kaustuk Saraf", 1110002223,1500);
        obj.deposit(200);
        obj.Withdraw(100);
        obj.displayBalance();
    }




}