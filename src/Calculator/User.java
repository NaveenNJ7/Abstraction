package Calculator;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Calsi c = new Operators();
	
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Select operators\n1.Add\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 :
					System.out.println("Enter value of a");
					int a = sc.nextInt();
					System.out.println("Enter value of b");
					int b = sc.nextInt();
					int result = c.add(a, b);
					System.out.println("Sum of "+a+" and "+b+" = "+result);
					break;
					
			case 2 :
				    System.out.println("Enter value of a and b");
				    System.out.println("Substraction "+c.sub(sc.nextInt(), sc.nextInt()));   
				    break;
				    
			case 3 :
				    System.out.println("Enter value of a and b");
			        System.out.println("Multiplication "+c.multi(sc.nextInt(), sc.nextInt()));   
			        break;
			        
			case 4 :
				    System.out.println("Enter value of a and b");
			        System.out.println("Division "+c.dvs(sc.nextInt(), sc.nextInt()));   
			        break;
			        
			case 5 : 
				    System.out.println("Exit");
				    return;
				    
				    default : System.out.println("Invalid choice");
			         
			 }
		}
		
		
		
		
	}
}
