package Employee;

public class User {

	
	
	public static void main(String[] args) {
		
		Employee e  = new Employee();
		
		/*by creating an object of subclass and using that we can call method but we need to 
		   hide implementations so we will do upcasting
		we can check by key press control over on the reference e and enter it will take to the
		employee class and we can see implementations, but abstraction main intention is hiding 
		implementations
		
		*/
		
		Person p = new Employee();
		p.m();
		
		
	}
}
