package Banking;

public class User {

	
	
	public static void main(String[] args) {
		
		Bank b = new ATM();
		
		b.Deposit(2000);
		b.Checkbalance();
		
		System.out.println("--------");
		
		b.Withdraw(1000);
		b.Checkbalance();
		
	
		
	    
		
	}
}
