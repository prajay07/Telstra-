package telstra.day4.inheritance;


class Person
{
	public Person()
	{
		System.out.println("Person Constructor");
	}
}

class Employee extends Person
{
	public Employee() 
	{
		System.out.println("employee constructor");
	}
	

}


public class inheritanceDemo1 {

	public static void main(String[] args) 
	{
		Person person=new Person();
		
		System.out.println("=================");
		
		Employee employee=new Employee();
	}

}
