import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stack<Integer> nums=new Stack<>();
	nums.push(1);
	nums.push(2);
	nums.push(3);
	
	System.out.println("Elements:"+nums);
	
	nums.pop();
	
	System.out.println("Elements:"+nums);
	nums.pop();
	System.out.println("Elements:"+nums);
		
	}

}
