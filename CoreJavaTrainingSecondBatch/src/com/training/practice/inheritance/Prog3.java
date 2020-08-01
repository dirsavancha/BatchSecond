package com.training.practice.inheritance;

class Person {

	void personName(String name) {

		System.out.println("Name of a person is :" + name);
	}

	void mobile() {
		System.out.println("Contact number of Person class is 123");
	}

	void adharNumber() {
		System.out.println("I am person adhar number");
	}
	
	private void m1() {
		
	}

}

class Employee extends Person {

	void empId(int emp_Id) {
		System.out.println("Employee Id is " + emp_Id);
	}

	void empDesig(String designation) {
		System.out.println("Emp deignation is" + designation);
	}

	@Override
	void mobile() {
		super.mobile();
		System.out.println("Mobile number of employee class is 789");
	}

}

public class Prog3 {
	public static void main(String[] args) {

		System.out.println("UpCasting");

		Person obj = new Employee(); // child is pointing to parent employee---->Person

		obj.personName("Raj");
		obj.mobile();
        obj.adharNumber();
		
        
        System.out.println("Downcasting");
		Employee emp1 = (Employee) obj;
		
		emp1.adharNumber();
		emp1.empDesig("Staff");
		emp1.empId(105);
		emp1.mobile();
		emp1.personName("ABC");
		

	}

}
