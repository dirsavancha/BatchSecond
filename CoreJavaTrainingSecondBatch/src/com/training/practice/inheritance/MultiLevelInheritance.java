
// Multi level level Inheitance
package com.training.practice.inheritance;

class GrandFather{
	void house() {
		System.out.println("I am grandfather house");
	}
}
class Father extends GrandFather{
	void house() {
		//super.house();
	System.out.println("I am Fathers house");	
	}
	void car() {
		System.out.println("I am Fathers car");
	}
	
}
class Son extends Father{
	void car() {
		super.car();
		System.out.println("I am sons car");
	}
	
}





public class MultiLevelInheritance {
	public static void main(String[] args) {
		Son obj=new Son();
		
		obj.car();
		obj.house();
	}

}



