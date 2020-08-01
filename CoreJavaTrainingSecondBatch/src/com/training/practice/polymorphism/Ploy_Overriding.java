package com.training.practice.polymorphism;

class Animal{
	void speak() {
		System.out.println("Speaks as a animal");
	}
	void m2() {
		System.out.println("I am m 2");
	}
}
class cat1 extends Animal {
	 void speak() {
		 System.out.println("Speaks as meow");
	 }
}
class Dog1 extends Animal{
	void speak() {
		System.out.println("Speaks as  bow-bow");
	}
	void m3() {
		System.out.println("I am m3");
	}
}

public class Ploy_Overriding {
  public static void main(String[] args) {
	
	
	Animal a=new Dog1();
	   a.speak();
	   a.m2();
	   
			
}
}
