package com.training.practice.interfaces;


interface I3{
	default void details() {
		System.out.println("I am interface details method");
	}
}
class A1 implements I3{
	
	public void details() {
		System.out.println("I am class details method");
	}
}
public class Pref2  extends A1 implements I3{
 
	public static void main(String[] args) {
		Pref2 obj=new Pref2();
		obj.details();
	}
}
