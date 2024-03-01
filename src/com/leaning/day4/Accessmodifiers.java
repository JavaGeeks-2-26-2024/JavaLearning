package com.leaning.day4;

public class Accessmodifiers {

	public static void main(String[] args) {
	
		// Access Modifiers - controls the access level
		
		// public  - this will be accessible for all the classes 
		// private - thisill be accessible with in that declared class. (where its decleared)
		// default - this will be accessible with in the same package, if you dont specify a modifier
//		              Java will assign a default modifier.
		// protected - this will be  accessible with in the same package and subclasses. 
		
		BankAccount kwamiAccount = new BankAccount(123456789,1000.00,1234,"kkkk","sdfghjk",40520048 );
		kwamiAccount.accountHolderName ="kwami";
		kwamiAccount.address= " zxkjl";
		
		
		System.out.println(kwamiAccount.withdraw(100));
		
		
		System.out.println(kwamiAccount.checkBalance());
		
		
		kwamiAccount.deposit(500);
		
		System.out.println(kwamiAccount.checkBalance());
		
		
		System.out.println(kwamiAccount.loanAmount);
		kwamiAccount.takeALoan(20000);
		
		System.out.println(kwamiAccount.loanAmount);
		
		
		
		

	}

}
