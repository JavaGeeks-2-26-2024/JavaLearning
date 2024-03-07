package com.leaning.day8and9;

public class ATM {
	

	
	public void withdraw(int amount) throws MinBalanceException {
		if(amount < 100) {
			throw new MinBalanceException("Enter min 100 $");
		}
	}
	
	

}
