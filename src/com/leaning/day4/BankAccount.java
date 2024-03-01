package com.leaning.day4;

public class BankAccount {
	
	private int accountNumber;
	
	public String accountHolderName;
	public int phonenumber;
	public String address;
	
	private double balance;
	private int pin;
	private String password;
	
	public String userName;
	
	private int SSN;
	
	protected double loanAmount= 5000;
	protected double loanRate= 5.5;
	
	public BankAccount(int accountNumber, double balance, int pin, String userName, String password, int SSN ) {
		this.accountNumber = accountNumber;
		this.balance= balance;
		this.userName = userName;
		this.password= password;
		this.pin = pin;
		this.SSN=SSN;
		
	}
	
	
	
	
	public void deposit(double money) {
		this.balance = this.balance + money;
	}
	
	
	public double withdraw(double money) {
		 this.balance = this.balance- money;
		 return money;
		
	}
	
	public double checkBalance() {
		return this.balance;
	}
	
	public void chnagePin() {
		
	}
	
	
	protected void takeALoan(double loanMoney) {
		this.loanAmount = loanAmount+loanMoney;
	}
	
	

}
