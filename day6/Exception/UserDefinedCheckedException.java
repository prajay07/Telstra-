class userInvalidException extends Exception
{
	String msg;

	public  userInvalidException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


class Customer2 
	{
		public void CheckEligibility(int age) throws userInvalidException {
			if(age>=18)
				System.out.println("Elgible to vote");
			else
				throw new userInvalidException("age is not valid");
		}
	}

public class UserDefinedCheckedException 
{

	public  void main(String[] args) 
	{
		
		Customer2 customer2= new Customer2();
		try
		{
			customer2.CheckEligibility(4);
		}
		catch (userInvalidException ae) 
		{
			System.out.println(ae.getMsg());
		}
		
	}
}
}
