package telstra.day5.staticDemo;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    System.out.println(2/0);
		} 
		catch(Exception e) {
		    System.out.println("two");
		}
		catch(AritheticException ae)
		{
		    System.out.println("one");
		}
		System.out.println("three");
	}

}
