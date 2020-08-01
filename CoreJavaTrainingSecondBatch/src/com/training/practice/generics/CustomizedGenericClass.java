package com.training.practice.generics;

class Product {
	int id;

	void prodDetails() {
		System.out.println("I am product details");
	}
}

class Student {
	int id;

	void studentDetails() {
		System.out.println("I am Student details");
	}
}

class Customer {
	int id=0;

	void custDetails() {
		System.out.println("I am Customer Details");
	}
}

public class CustomizedGenericClass<T> {
	T t;
	void display() {
		System.out.println("I am Display");
	}
	public static void main(String[] args) {
		Customer c1=new Customer();
		CustomizedGenericClass<Customer> obj=new CustomizedGenericClass<>();
		obj.display();
		obj.t=c1;
		obj.t.custDetails(); 
		Student s1=new Student();
		CustomizedGenericClass<Student> obj1=new CustomizedGenericClass<>();
		obj1.t=s1;
		obj1.t.studentDetails();
		
	}

}
