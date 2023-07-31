package telstra.day5.staticDemo;



interface Payment
{
	void doPayment();
}

class UPI implements Payment
{

	@Override
	public void doPayment() {
		System.out.println("Payment using UPIs");
		
	}
	
}

class OnlineBanking implements Payment
{

	@Override
	public void doPayment() {
		System.out.println("Using Online banking");
		
	}
	
}


public class PaymentApp {
	  
	
	
	public static void main(String[] args) {
		 Payment payment=new UPI();
           payment.doPayment();
	}

}
