package telstra.day5.staticDemo;

public class StaticDemo {

	static {
		System.out.println("THis is a static block 1");
	}
	public static void main(String[]args)
	{
		System.out.println("THis is a main method");
	}
	
	static 
	{
		System.out.println("THis is a static block 2");
	}
}
