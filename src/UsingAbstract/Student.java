package UsingAbstract;

public class Student extends College {

	@Override
	void cName(String name)
	{
		System.out.println("College name :"+name);
	}
	
	@Override
	void sName(String name, int id)
	{
		System.out.println("Student name :"+name+" and id :"+id);
	}
}
