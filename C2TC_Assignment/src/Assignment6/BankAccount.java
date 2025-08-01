package Assignment6;


public void deposit(double amount) throws InvalidAmountException {
    if (amount <= 0) {
        throw new InvalidAmountException("Deposit amount must be greater than zero.");
    }
    balance += amount;
    System.out.println("Deposited: " + amount);
}


public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
    if (amount <= 0) {
        throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
    }
    if (amount > balance) {
        throw new InsufficientFundsException("Insufficient balance for withdrawal.");
    }
    balance -= amount;
    System.out.println("Withdrawn: " + amount);
}


public void displayBalance() {
    System.out.println("Current Balance: " + balance);
}
}
