package com.training.practice.interfaces;

interface RBI {

	void accountType();

	void loan();
	
	default void insurance() {
		System.out.println("I am Rbi standard insurance");
	}
	default void govtScheme() {
		System.out.println("I am RBI Govt Scheme 100");
	}
	static void govtScheme2() {
		System.out.println("I am govt scheme2 5000");
	}

}


class SBI implements RBI {
	public void accountType() {
		System.out.println("I am SBI Savings Account");
	}

	public void loan() {
		System.out.println("I am SBI Education Loan");
	}

	
	public void insurance() {
		System.out.println("I am SBi insurance");
	}
	@Override
	public void govtScheme() {
		
		RBI.govtScheme2();
		System.out.println("50");
	}
	

}

class ICICI implements RBI{   //HAS-A-RelationShip
	@Override
	public void accountType() {
		System.out.println("I am ICICi Saving Account");
	}

	@Override
	public void loan() {
		System.out.println("I am ICICI Loan");
		
	}
	
	
}



public class InterfaceTest {

	
	public static void main(String[] args) {
		ICICI obj=new ICICI();
		obj.govtScheme();
		SBI obj1=new SBI();
		obj1.govtScheme();
			
			
	}
}
