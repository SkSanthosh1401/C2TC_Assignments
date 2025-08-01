package classassignment3;

public class Transaction {
    public static void performTransaction(Account account, double depositAmt, double withdrawAmt) {
        System.out.println("\nAccount Number: " + account.getAccountNumber());
        account.deposit(depositAmt);
        account.withdraw(withdrawAmt);
        System.out.println("Balance after transaction: " + account.getBalance());
    }
}