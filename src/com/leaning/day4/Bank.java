package com.leaning.day4;

public class Bank {
	
	BankAccount[] accountsAry= new BankAccount[10];
     int accountposition=0;
     
     
     public void openAccount(int accountNumber, double balance, int pin, String userName, String password, int SSN ) {
    	 
    	if(accountposition < 10) {
    		 BankAccount account = new BankAccount(accountNumber,  balance,  pin,  userName,  password,  SSN);
        	 accountsAry[accountposition] = account;
        	 accountposition++;
    	}else {
    		System.out.println("account limit is reached");
    	}
    	 
     }
     
     
     public void closeAccount(int position) {
    	 
    	 accountsAry[position] = null;
     }
     
     
     public BankAccount getMyaccountByPosition(int position) {
    	
    	 BankAccount a = accountsAry[position];
    	 
    	 return a;
    	 
     }
}
