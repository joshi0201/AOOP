package week9;

	public class Main {
	    public static void main(String[] args) {
	        // Create a shared bank account
	        BankAccount sharedAccount = new BankAccount(1000);

	        // Create multiple threads simulating users performing deposits and withdrawals
	        Thread user1 = new Thread(new BankUser(sharedAccount, 200, true));  // Deposit
	        Thread user2 = new Thread(new BankUser(sharedAccount, 150, false)); // Withdraw
	        Thread user3 = new Thread(new BankUser(sharedAccount, 500, true));  // Deposit
	        Thread user4 = new Thread(new BankUser(sharedAccount, 100, false)); // Withdraw
	        Thread user5 = new Thread(new BankUser(sharedAccount, 700, false)); // Withdraw

	        // Start all threads
	        user1.start();
	        user2.start();
	        user3.start();
	        user4.start();
	        user5.start();

	        // Wait for all threads to finish
	        try {
	            user1.join();
	            user2.join();
	            user3.join();
	            user4.join();
	            user5.join();
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted");
	        }

	        // Check final balance
	        sharedAccount.getBalance();
	    }
	}

