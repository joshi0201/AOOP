package week9;

	class BankUser implements Runnable {
	    private BankAccount account;
	    private double amount;
	    private boolean deposit;

	    public BankUser(BankAccount account, double amount, boolean deposit) {
	        this.account = account;
	        this.amount = amount;
	        this.deposit = deposit;
	    }

	    @Override
	    public void run() {
	        if (deposit) {
	            account.deposit(amount);
	        } else {
	            account.withdraw(amount);
	        }
	    }
	}

