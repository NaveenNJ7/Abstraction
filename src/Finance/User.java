package Finance;

import java.util.Scanner;

public class User {

	
	public static void main(String[] args) {
		
		// up casting
		Bank b = new ATM();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome Dummy Bank ATM");
		while(true)
		{
			
			System.out.println("Enter the choice\n1.Deposit\n2.Withdraw\n3.Available balance\n4.Thank you");
			int choice  = sc.nextInt();
			switch(choice)
			{
			case 1: 
				   System.out.println("Enter amount to be deposit :");
				   b.deposit(sc.nextInt());
				   break;
				   
			case 2:
				   System.out.println("Enter amount to be withdrawn :");
				   b.withdraw(sc.nextInt());
				   break;
				   
			case 3:
				   b.checkbalance();
				   break;
				   
			case 4:
				   System.out.println("Thank you visit again");
				   System.exit(0); // can also write return;
				   
				   default : System.out.println("Invalid entry");
			}
		}
		
		
	}
}
