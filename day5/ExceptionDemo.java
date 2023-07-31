package telstra.day5.staticDemo;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        
        try {
        	  a=s.nextInt();
        }
        catch(Exception e) {
        	System.out.println("Exception occured");
        }
        finally{
        	System.out.println("The output is here:");
        }
	}

}
