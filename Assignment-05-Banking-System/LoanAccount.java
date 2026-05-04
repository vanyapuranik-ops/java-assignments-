public class LoanAccount extends Account
{
    public double principalAmt;
    public int tenure; // months
    public double interestRate;
    public String loanType;
    public double totalOutstanding;

    public LoanAccount(long accountNumber, double principalAmt, int tenure, double interestRate,
                       String loanType)
    {
        super(accountNumber, 0, "Today", "Loan");
        this.principalAmt = principalAmt;
        this.tenure = tenure;
        this.interestRate = interestRate;
        this.loanType = loanType;

        calculateTotalOutstanding();
    }

    public double calculateEMI()
    {
        double r = interestRate / 12 / 100;
        double emi = (principalAmt * r * Math.pow(1 + r, tenure)) / (Math.pow(1 + r, tenure) - 1);
        return emi;
    }

    public void calculateTotalOutstanding()
    {
        totalOutstanding = calculateEMI() * tenure;
    }

    public void payEMI()
    {
        double emi = calculateEMI();
        totalOutstanding -= emi;
        System.out.println("EMI paid:" + emi);
    }

    public void payTotalOutstanding()
    {
        totalOutstanding = 0;
        System.out.println("Loan cleared");
    }
}
