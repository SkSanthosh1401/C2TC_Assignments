package Assignment6;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, 1000.0);

        try {
            account.deposit(500);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        try {
            account.withdraw(2000); 
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}