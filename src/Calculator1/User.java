package Calculator1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Calsi c = new Operators();
		
		Scanner sc  = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Select Operators\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 :{
				     System.out.println("Enter value of a");
				     double a = sc.nextDouble();
				     System.out.println("Enter value of b");
				     double b = sc.nextDouble();
				     c.add(a, b);
				     break;
				    }
			
			case 2 :{
			         System.out.println("Enter value of a");
			         double a = sc.nextDouble();
			         System.out.println("Enter value of b");
			         double b = sc.nextDouble();
			         c.sub(a, b);
			         break;
			        }
			
			case 3 :{
			         System.out.println("Enter value of a");
			         double a = sc.nextDouble();
			         System.out.println("Enter value of b");
			         double b = sc.nextDouble();
			         c.multi(a, b);
			         break;
			        }
			case 4 :{
			         System.out.println("Enter value of a");
			         double a = sc.nextDouble();
			         System.out.println("Enter value of b");
			         double b = sc.nextDouble();
			         c.dvs(a, b);
			         break;
			        }
			case 5 : 
				    System.out.println("Exit");
				    System.exit(0);
				    
				   default : System.out.println("Invalid entry"); 
			}
		}
	}
}
