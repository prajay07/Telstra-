import java.util.ArrayList;
import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println("nums="+nums);
		
		ListIterator<Integer> listItr=nums.listIterator();
		
		System.out.println("Forward Direction:");
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
		
		
		
		System.out.println("Backward Direction");
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}
	}

}
