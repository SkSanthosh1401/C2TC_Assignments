package classassignment3;

public class Executor {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV123", 1000);
        CheckingAccount checking = new CheckingAccount("CHK456", 500);

        Transaction.performTransaction(savings, 200, 300);
        Transaction.performTransaction(checking, 100, 800);

        System.out.println("\nTotal Accounts Created: " + Bank.getTotalAccounts());
    }
}