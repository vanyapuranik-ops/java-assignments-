public class Account 
{
    private long accountNumber;
    public Customer customer;
    public double balance;
    public String createdOn;
    public String accountType; // individual/joint
    public String[] creditCards;

    public Account(long accountNumber, double balance, String createdOn, String accountType)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.createdOn = createdOn;
        this.accountType = accountType;
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void checkBalance()
    {
        System.out.println("Account Number:" + accountNumber + "\nBalance:" + balance);
    }

    public void credit(double amount)
    {
        balance += amount;
        System.out.println("Amount Credited:" + amount);
    }

    public void debit(double amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
            System.out.println("Amount debited:" + amount);
        }
        else
            System.out.println("Insufficient balance");
    }

    public void transfer(Account acc, double amount)
    {
        if(balance >= amount)
        {
            this.debit(amount);
            acc.credit(amount);
        }
        else
            System.out.println("Transfer failed due to insufficient balance");
    }

    public void closeAccount()
    {
        System.out.println("Account" + accountNumber + "closed");
    }

    public void createFD()
    {
        System.out.println("Fixed Deposit created");
    }
}
