import java.util.ArrayList;
import java.util.Collections;


public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println("Before sorting"+nums);
		Collections.sort(nums);
		
		System.out.println("After sorting"+nums);
		
		
		ArrayList<Product> products=new ArrayList<>();
		
		products.add(new Product(1,"laptop",50000,"Electronics"));
		products.add(new Product(2,"",50000,"Electronics"));
		products.add(new Product(3,"Mobile",20000,"Daily"));
		
		
		
		
		for(Product product : products)
		{
			System.out.println();
		}
		Collections.sort
	}
	
	

}
