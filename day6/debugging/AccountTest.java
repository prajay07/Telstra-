package com.telstra.day6_debugging;



public class AccountTest {

	public static void main(String[] args) {
		Account1 account=new Account1();
		
		account.getBalance();
		
		account.setId(1);
		account.setName("ramesh");
		account.setBalance(2000);
		
		account.getBalance();
	}

}
