package com.training.practice.polymorphism;

public class MethodOverLoading {

	void m1(int a) {
		System.out.println("I am only int");
	}

	void m1(String a) {
		System.out.println("I am only string");
	}

	void m1(int a, String b) {
		System.out.println("I am int and String");
	}

	void m1(int a, int b) {
		System.out.println("I am int and int");
	}

	

	/*void m1(float a, float b) {
		System.out.println("I am Float and Float");
	}*/

	void m1(double a, double b) {
		System.out.println("I am Double and Double");
	}

	void m1(int a, float b) {
		System.out.println("I am int and Float");
	}

	void m1(float a, double b) {
		System.out.println("I am Float and double");
	}
		void m1(float a) {
		System.out.println("i am float ");
	}
	void m1(double a) {
		System.out.println("I am Double");
	}

	public static void main(String[] args) {

		MethodOverLoading obj = new MethodOverLoading();
		obj.m1(10, 10);//int and int
		obj.m1(10);    //int
		obj.m1("Ram");  //String
		obj.m1(10,"Raj");//int String
		obj.m1(10.1f,20.1f);// float float----> float and double -->double and double
		obj.m1(200.254f,4852.256);// double double
		obj.m1(10.2f,500.250);// float double
		obj.m1( 452.10000f);
		obj.m1(45895.256);
		
  
	}

}
