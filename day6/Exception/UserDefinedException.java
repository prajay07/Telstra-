package com.telstra.day6;

 
//For custom exception -
class InValidAgeException extends RuntimeException
{
	String msg;

	public InValidAgeException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
//normal Exception
class Customer
{
	public void CheckEligibility(int age) {
		if(age>=18)
			System.out.println("Elgible to vote");
		else
			throw new InValidAgeException("age is less,Minimum should be 18");
	
}
}	
	

//Main function used to call:
public class UserDefinedException 
{
	
	public  void main(String[] args) 
	{
		Customer customer = new Customer();
		
		try 
		{ 
			customer.CheckEligibility(23); 
		} 
	    catch(InValidAgeException e) 
		{ 
			System.out.println(e.getMsg()); 
		}
	}
}
}

