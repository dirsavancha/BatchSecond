package com.training.practice.encapsulation;

public class BankAccount {
	
	private int accNumber;
	private int bal =10000;
	private double mobile=1234567890;
	
	public void setAccountNumber(int accNumber) {  // Write operations
		this.accNumber=accNumber;
	}
	public int  getAccountNumber() {//---readOpeartion
		return accNumber;
		
	}
	public int getBalance() {
		return bal;
	}
	public double getMobile() {
		return mobile;
	}
	
	

}
