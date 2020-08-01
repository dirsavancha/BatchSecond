package com.training.practice.inheritance;

class JNTU_University {

	void Electronics() {
		System.out.println(" Total number of seats are 100");
	}

	void ComputerScience() {
		System.out.println("Total number of seats are 120");
	}
}

class GECEngineering extends JNTU_University {

	@Override
	void ComputerScience() {

		System.out.println(" Total number of seats are 150");
	}
}

class CBIT extends JNTU_University {

	@Override
	void Electronics() {
		System.out.println("Total seats are 200");
	}

	void bioTech() {
		System.out.println("I am bio tech branch");
	}
}

public class Prog1 {
	public static void main(String[] args) {
		CBIT obj=new CBIT();/// 
		obj.Electronics();
		obj.bioTech();
		
		
		
	}

}
