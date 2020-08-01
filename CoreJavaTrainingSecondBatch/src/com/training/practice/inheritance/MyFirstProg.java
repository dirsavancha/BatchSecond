
// Single level Inheitance
package com.training.practice.inheritance;

class RBI {
	void carLoan() {
		
	}
	void educationLoan() {
		
	}
}
class SBI extends RBI {
	void personalLoan() {
		
	}
}




public class MyFirstProg {
	public static void main(String[] args) {
		SBI obj=new SBI();
		
		obj.personalLoan();
	}

}



