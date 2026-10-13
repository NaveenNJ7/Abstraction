package Banking;

public class ATM implements Bank{

	
	int Balance = 10000;
	
	@Override
	public void Deposit(int amount)
	{
		System.out.println("Amount deiposite successfully :"+amount);
		Balance = Balance+amount;
	}
	
	public void Withdraw(int amount)
	{
		System.out.println("Amount withdrawn successfully :"+amount);
		Balance = Balance - amount;
	}
	
	public void Checkbalance()
	{
		System.out.println("Balance amount :"+Balance);
		
	}
}
