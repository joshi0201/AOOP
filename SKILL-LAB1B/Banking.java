package Singleton;

public class Banking{ 
	 private static Banking instance=null;
	 private static double balance=10000;
	 private Banking() {
	 }
	 public static Banking getinstance(){
		 if(instance==null) {
			 instance=new Banking();
		 }
		 return instance;
	 }
	  public double viewbalance() {
		  System.out.println("balance:"+balance);
		  return balance;
	  }
	  public double deposit(double amount) {
		     balance+=amount;
		     System.out.println("Amount Deposited:"+balance);
		     return amount;
	  }
	  public double withdrawal(double amount) {
		  balance-=amount;
		  System.out.println("Amount withdrawed:"+balance);
		  return amount;
		  
	  }
}
 
	


