


package com.training.practice.abstraction;



abstract public class ATMmachine {
	int i;
	
	
	abstract protected void withDraw();

	public abstract void deposit();

	public void accountSummary() {
		System.out.println("Having the account details");
	}

}
class HDFC extends ATMmachine{
	@Override
	public void withDraw() {
		System.out.println("I am HdFC With Draw Method");
	}
	@Override
	public void deposit() {
		System.out.println("I am HDFC Deposit method");
	}
	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.accountSummary();
		obj.deposit();
		obj.withDraw();
	}
}
abstract class ICICI extends ATMmachine{
	void m5() {
		
		
	}
	public static void main(String[] args) {
		
	}
}

