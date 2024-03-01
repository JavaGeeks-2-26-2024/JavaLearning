package com.leaning.day3;

import com.leaning.day4.BankAccount;

public class Xyz {

	public static void main(String[] args) {
	
		BankAccount kwamiAccount = new BankAccount(123456789,1000.00,1234,"kkkk","sdfghjk",40520048 );
		kwamiAccount.accountHolderName ="kwami";
		kwamiAccount.address= " zxkjl";
		
		
		System.out.println(kwamiAccount.withdraw(100));
		
		
		System.out.println(kwamiAccount.checkBalance());
		
		
		kwamiAccount.deposit(500);
		
		System.out.println(kwamiAccount.checkBalance());
		
		
	
	}

}
