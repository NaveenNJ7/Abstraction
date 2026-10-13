package Finance;

public class ATM implements Bank {
	
	int balance = 10000;
	
	public void deposit(int amt){
		System.out.println(amt+" Amount deposited successfully");
		balance = balance+amt;
	}
	
	public void withdraw(int amt){
		System.out.println(amt+" Amount withdrawn successfully");
		balance-=amt; // balance = balance-amt
	}
	
	public void checkbalance(){
		System.out.println("Available balance :"+balance);
	}

}
