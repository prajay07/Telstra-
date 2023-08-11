import java.util.*;
public class TaskDemo {

	public static void main(String[] args) {
		
		ArrayList<String> batch1=new ArrayList<String>();
        
		ArrayList<String> batch2=new ArrayList<String>();
		
		batch1.add("Rohit");
		batch1.add("John");
		batch1.add("Ankit");
		batch1.add("Sourabh");
		batch1.add("Rahul");
		
		System.out.println(batch1);
		
		batch2.add("Anil");
		batch2.add("Manas");
		batch2.add("Rohit");
		batch2.add("Rahul");
		batch2.add("Karan");
		
		System.out.println(batch2);
		
		batch2.removeAll(batch1);
		System.out.println(batch2);
		
		batch1.addAll(batch2);
		System.out.println(batch1);
		
		
		
		batch1.sort(null);
		System.out.println(batch1);
		
	}

}
