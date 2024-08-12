package Singleton;

public class Mainbank {
	public static void main(String[] args) {
   	 Banking obj=Banking.getinstance();
   	 obj.viewbalance();
   	 obj.deposit(2000.0);
   	 obj.withdrawal(100.0); 
    }    	

            }
