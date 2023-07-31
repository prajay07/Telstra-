package telstra.day5.staticDemo;


interface Breakfast
{
	void eat();
	void make();
}

class Idly implements Breakfast
{
	public void eat() {
		System.out.println("eating idly");
	}

	@Override
	public void make() {
		
		System.out.println("Give Steam for 10 mins");
	}
}

class Dosa implements Breakfast
{

	@Override
	public void eat() {
		
		System.out.println("eating Dosa");
	}

	@Override
	public void make() {
		System.out.println("cook in pan for 2 mins");
		
	}
	}
	

public class LooselyCoupled {

	public static void main(String[] args) {
		Breakfast bf=new Dosa();  // here it is loosely coupled as 
		//if we can change dosa to idly the code is changed
		
		bf.make();
		bf.eat();
	}

}
