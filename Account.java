// This class implements Account class

public class Account
{
    // constants
    public static final double DEFAULT_BALANCE = 0.0;
    
    // variables
    private int accountNumber;
    private double balance;

    // constructor
    public Account(int accountNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = DEFAULT_BALANCE;
    }
    public Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // methods
    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public void credit(double amount)
    {
        this.balance += amount;
    }

    public void debit(double amount)
    {
        this.balance = this.balance - amount;
    }

    public String toString()
    {
        return "accountNumber = " + accountNumber + ";  balance = " + balance;
    }

    public static void main(String[] args)
    {
        Account a1 = new Account(10001);
        Account a2 = new Account(10002, 5);
        System.out.println("a1: " + a1.toString());
        System.out.println("a2: " + a2.toString());

        a2.setBalance(29);
        System.out.println(a2);

        a2.credit(15);
        System.out.println(a2);

        a2.debit(4);
        System.out.println(a2);
    }

}
