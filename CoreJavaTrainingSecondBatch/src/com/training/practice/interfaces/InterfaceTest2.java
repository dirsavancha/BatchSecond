package com.training.practice.interfaces;

interface One {

	default void m1() {
		System.out.println("I am Interface One m1 method ");
	}
}

interface Two extends One{
	default void m1() {
		
		System.out.println("I am Interface Two m1 method ");
	}
}

class First implements Fourth{
	
	public void m1() {
		System.out.println("I am class m1");
	}
}
interface Fourth {
	default void m1() {
		System.out.println("I am Interface fourth m1");
	}
}



public class InterfaceTest2 extends First implements Fourth {

	

	public static void main(String[] args) {
		InterfaceTest2 obj = new InterfaceTest2();
		obj.m1();
	}

}


