package telstra.day4.inheritance;


class Parent
{
	void mothertongue()
	{
		System.out.println("Speak english");
	}
}
class Child extends Parent 
{
	/*void education()
	{
		System.out.println("graduation");
	}
	*/
	void mothertongue()
	{
		super.mothertongue();
		System.out.println("Speak Marathi");
	}
}


public class singleInheritance {

	public static void main(String[] args) {
		Child child=new Child();
		child.mothertongue();
		//child.education();
	}

}
