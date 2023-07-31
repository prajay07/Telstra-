package telstra.day5.staticDemo;

class Emp
{
	int id;
	String name;
	static String dept;
	
}




public class Employee {

	public static void main(String[] args) {
		
		
		
		Emp e1=new Emp();
		e1.id=1;
		e1.name="Rahul";
		e1.dept="dept 1";
		
		Emp e2=new Emp();
		e2.id=2;
		e2.name="Virat";
		e2.dept="dept 2";
		
		Emp e3=new Emp();
		e3.id=3;
		e3.name="Rohit";
		e3.dept="dept 3";
		
        System.out.println();
        System.out.println();
	}

}
