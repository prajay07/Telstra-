package telstra.day4.looping;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		System.out.println("enter the number of times:");
		int b=sc.nextInt(); 
		for(int i=1;i<=b;i++) System.out.println(i*a); 
		} 
	}
		
      
	
