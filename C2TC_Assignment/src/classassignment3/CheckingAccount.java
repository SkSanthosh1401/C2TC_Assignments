package classassignment3;

public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 500;

    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded in Checking Account");
        }
    }
}