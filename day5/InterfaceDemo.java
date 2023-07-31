package telstra.day5.staticDemo;

interface Bank
{
	int salary=5000;
	
	void greet();
}

class Axis implements Bank 
{

	@Override
	public void greet() 
	{
		System.out.println("Vamos");
		
	}
	
}



public class InterfaceDemo {

	public static void main(String[] args) 
	{
		Axis axis=new Axis();
		axis.greet();
		
	}

}
