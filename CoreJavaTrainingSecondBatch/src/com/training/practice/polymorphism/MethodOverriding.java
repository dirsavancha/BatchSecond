package com.training.practice.polymorphism;


class Dog{
	void speak() {
		System.out.println("I will shout as Bow Bow");
	}
}
class Cat extends Dog{
	@Override
	void speak() {
		System.out.println(" I will shout as Meow");
	}
}
class Human extends Dog{
	@Override
	void speak() {
		System.out.println("I will shout as Hi");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Dog obj=new Human();
		  obj.speak();
	}
	  

}
