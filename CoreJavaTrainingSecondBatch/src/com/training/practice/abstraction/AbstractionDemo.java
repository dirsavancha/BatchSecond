package com.training.practice.abstraction;

abstract public class AbstractionDemo {
	
	abstract void m1();
	
	void m2() {
		System.out.println("I am imple method");
	}

}
class Child extends AbstractionDemo{
	public void m1() {
		System.out.println("I am m1 method from child class");
	}
	public static void main(String[] args) {
		Child ch=new Child();
			
			
	}
}
abstract class Child_2 extends AbstractionDemo{
	void m3() {
		
		
	}
}

