import java.util.*;

public class Customer 
{
    private String customerID;
    public String name;
    private String pan;
    private long aadhar;
    public String address;
    public int dob;
    public long phoneNo;

    // Each customer can have multiple accounts
    ArrayList<Account> accounts = new ArrayList<>();

    // Constructor
    public Customer(String customerID, String name, String pan, long aadhar, int dob, long phoneNo)
    {
        this.customerID = customerID;
        this.name = name;
        this.pan = pan;
        this.aadhar = aadhar;
        this.dob = dob;
        this.phoneNo = phoneNo;
    }

    public String getCustomerID()
    {
        return customerID;
    }
    public String getPAN()
    {
        return pan;
    }
    public long getAadhar()
    {
        return aadhar;
    }

    public void setCustomerID(String customerID)
    {
        this.customerID = customerID;
    }
    public void setPAN(String pan)
    {
        this.pan = pan;
    }
    public void setAadhar(long aadhar)
    {
        this.aadhar = aadhar;
    }

    // add account to Customer
    public void addAccount(Account acc)
    {
        accounts.add(acc);
    }

    public void checkBalance()
    {
        for(Account acc : accounts)
            acc.checkBalance();
    }

    public void updateDetails(String address, long phoneNo)
    {
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void viewTxnHistory()
    {
        System.out.println("Transaction history feature not implemented");
    }

    public void checkCreditScore()
    {
        System.out.println("Credit Score: 750 (sample)");
    }
}
