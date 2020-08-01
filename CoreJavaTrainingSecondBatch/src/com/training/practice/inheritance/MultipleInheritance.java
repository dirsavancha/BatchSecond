package com.training.practice.inheritance;

interface Parent1 {
	void m1();

}

interface Parent2  {
	void m2();

}



class Child implements Parent1, Parent2 {

	@Override
	public void m1() {
		System.out.println(" I am Parent 1 m1 method");

	}
	@Override
	public void m2() {
		
		System.out.println("I am from Parent 2 method");
	}

}

public class MultipleInheritance {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1();
		ch.m2();
	}
	

}
