package com.telstra.day6;

import java.io.IOException;

class User
{
	//it is unchecked exception which is occur at Runtime
	public void checkEligibilty(int age) {
		if(age>=18) {
			System.out.println("you are eligible for voting");
		}
		else {
			throw new ArithmeticException("You are not eligible to vote");
		}
	}		
		
		//it is checked exception which throws error at compile time
		public void checkEligibilty2(int age) throws IOException {
			if(age>=18) {
				System.out.println("you are eligible for voting");
			}
			else {
				throw new IOException("You are not eligible to vote");
			}	
		
		
	}
	

}

public class ThrowDemo {

	public static void main(String[] args) throws IOException {
		User user=new User();
		
        
        try
        {
        	user.checkEligibilty(16);
            user.checkEligibilty2(34);
        }
        catch(Exception e)
        {
        	System.out.println("Something went wrong");
        }
	}

}

