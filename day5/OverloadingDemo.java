package telstra.day5.staticDemo;


class Flipkart{
	
	void filter()
	{
		System.out.println("default System");
	}
	void filter(int price) 
	{
		System.out.println("filter by price");
	}
	void filter(String brand)
	{
		System.out.println("filter by brand");
	}
	void filter(String brand,int price)
	{
		System.out.println("filter by brand n price");
	}

	
}


public class OverloadingDemo {

	public static void main(String[] args) {
		Flipkart f=new Flipkart();
		f.filter("Nike",2500);
	}

}
