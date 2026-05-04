public class SavingsAccount extends Account
{
    public double interestRate;
    public double minBalance;

    public SavingsAccount(long accountNumber, double balance, String createdOn, String accountType,
                          double interestRate, double minBalance)
    {
        super(accountNumber, balance, createdOn, accountType);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    // override debit
    @Override
    public void debit(double amount)
    {
        if((balance - amount) >= minBalance)
        {
            balance -= amount;
            System.out.println("Debited from Savings:" + amount);
        }
        else
            System.out.println("Minimum balance violation!");
    }
}
