package week9;

	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	        System.out.println("Bank Account created with initial balance: " + initialBalance);
	    }

	    // Synchronized deposit method
	    public synchronized void deposit(double amount) {
	        if (amount > 0) {
	            System.out.println("Depositing amount: " + amount);
	            balance += amount;
	            System.out.println("New balance after deposit: " + balance);
	        } else {
	            System.out.println("Deposit amount must be positive");
	        }
	    }

	// Synchronized withdraw method
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            System.out.println("Withdrawing amount: " + amount);
            balance -= amount;
            System.out.println("New balance after withdrawal: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal of: " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }

    // Method to get the current balance
    public synchronized double getBalance() {
        System.out.println("Checking current balance: " + balance);
        return balance;
    }
}

