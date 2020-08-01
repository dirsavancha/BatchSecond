package com.training.practice.inheritance;

class Flipkart{
	void m1() {
		System.out.println("Iam A class method");
	}
}
class Amazon extends Flipkart{
	
	void m2()
	{
		System.out.println("I am B class M2 method");
	}
}
class Customer extends Flipkart{
	void m3() {
		System.out.println("I am C class m3 method");
	}
}
class Cust1 extends Amazon{
	
}


public class HirarchcalInterface {
public static void main(String[] args) {
	
}
}
