import java.util.*;

public class MainForBank 
{
    public static void main(String args[])
    {
        ArrayList<Customer> customers = new ArrayList<>();

        // create customer
        Customer c1 = new Customer("C101", "Spandana", "PAN123", 147258369L, 2003, 987654321L);

        // create accounts
        SavingsAccount sa = new SavingsAccount(1001L, 5000, "2026-03-23", "Individual", 4.5, 1000);
        LoanAccount la = new LoanAccount(2001L, 2200000, 48, 11.5, "Education Loan");

        // link Account to Customer
        sa.customer = c1;
        la.customer = c1;

        // add accounts to Customer
        c1.addAccount(sa);
        c1.addAccount(la);

        // add customer to list
        customers.add(c1);

        // perform operations
        System.out.println("\n--- SAVINGS ACCOUNT OPERATIONS ---");
        sa.credit(2000);
        sa.debit(1500);
        sa.checkBalance();

        System.out.println("\n--- LOAN ACCOUNT OPERATIONS ---");
        System.out.println("EMI: " + la.calculateEMI());
        la.payEMI();
        System.out.println("Outstanding: " + la.totalOutstanding);

        // display consolidated info
        System.out.println("\n--- CUSTOMER DETAILS ---");
        for(Customer c : customers)
        {
            System.out.println("Customer ID: " + c.getCustomerID());
            System.out.println("Name: " + c.name);
            System.out.println("PAN: " + c.getPAN());
            System.out.println("Aadhar: " + c.getAadhar());

            System.out.println("\nAccounts:");
            c.checkBalance(); // shows all account balances
        }
    }
}
