import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 String name1="john";
		String name2="Manish";
		String name3="janab";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		*/
		
		//own order
		HashSet<String> fruits=new HashSet<>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("pineapple");
		
		System.out.println("fruits:"+fruits);
		
		//insetion order
		LinkedHashSet<String> fruits2 = new LinkedHashSet<>();
		fruits2.add("mango");
		fruits2.add("banana");
		fruits2.add("apple");
		fruits2.add("mango");
		fruits2.add("apple");
		fruits2.add("pineapple");
		System.out.println("Insertion fruits:"+fruits2);
		
		//Sorted order
		TreeSet<String> fruits3=new TreeSet<>();
		fruits3.add("mango");
		fruits3.add("banana");
		fruits3.add("apple");
		fruits3.add("mango");
		fruits3.add("apple");
		fruits3.add("pineapple");
		
		System.out.println("Sorted fruits:"+fruits3);
		
		
	}

}
