package telstra.day5.staticDemo;


class Parent{
	int id;
	public Parent(int id) 
	{
		System.out.println("parent constructor"+id);
	}
}

class Child extends Parent
{
	public Child() 
	{
		//here the super is required when there is arguments in parent class
		//otherwise default constructor is used here no need to use super.
		super(3);
		System.out.println("Child constructor");
	}
}



public class InheritanceSuper {

	public static void main(String[] args) {
		Child c=new Child();

	}

}
