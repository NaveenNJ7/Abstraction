package Calculator1;

public class Operators implements Calsi{

	public void add(double a, double b)
	{
		System.out.println("Sum of "+a+" and "+b+" = "+(a+b));
	}
	
	public void sub(double a, double b)
	{
		System.out.println("Substraction of "+a+" and "+b+" = "+(a-b));
	}
	
	public void multi(double a, double b)
	{
		System.out.println("Multiplication of "+a+" and "+b+" = "+(a*b));
	}
	
	public void dvs(double a, double b)
	{
		if(b!=0) // != is not equal
		{
			System.out.println("Division of "+a+" and "+b+" = "+(a/b));
		}
		else
		{
			System.out.println("value of b can not be "+b);
		}
		
	}
}
