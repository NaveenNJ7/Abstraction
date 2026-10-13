package Banking;

import java.util.Scanner;

public class LoopTest {
	
	
	
	public static void main(String[] args) {
		
		
		Bank b = new ATM();
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the Choice");
			System.out.println("1.Deposit\n2.Withdrwa\n3.Balance\n4Thank You");
			
			int choice = s.nextInt();
			
			switch(choice)
			{
			case 1:
				  System.out.println("Enter the amount to be deposit");
				  int amount = s.nextInt();
				  b.Deposit(amount);    // b.Deposit(s.nextInt());
				  break;
				  
			case 2:
			      System.out.println("Enter the amount to be Withdraw");
				  amount = s.nextInt();
				  b.Withdraw(amount);  // b.Withdraw(s.nextInt());
				  break;
				  
			case 3:
				  System.out.println("Balance remaining");
				  b.Checkbalance();
				  break;
				  
			case 4:
				  System.out.println("Thank you");
				  System.exit(0);
		    		  
		    
			default:
	              System.out.println("Invalid data");			
			}
			
			System.out.println("---------------");
			
		}
		
		
		
		
	}

}
