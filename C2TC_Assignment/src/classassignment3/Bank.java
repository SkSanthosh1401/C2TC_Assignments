package classassignment3;

public class Bank {
    private static int totalAccounts = 0;

    public static void incrementAccountCount() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}