package com.training.practice.polymorphism;

public class Poly_Overloading {
	static void m1(int a) {
   System.out.println("I am Only int");
	}

	static void m1(String a) {
  System.out.println("I am only String");
	}
	/*static void m1(float a) {
		System.out.println("I am only float");
	}*/
	static void m1(double a) {
		System.out.println("I am Only double");
	}

	static void m1(int a, int b) {
		System.out.println("I am it and int");
	}

	static void m1(int a, String b) {
		System.out.println("I am int and String");

	}

	static void m1(String a, int b) {
		System.out.println("I am String and int");
	}

	static void m1(String a, String b) {
		System.out.println("I am STring and String");
	}

	/*static void m1(float a, float b) {
		System.out.println("I am float and float");
	}

	static void m1(float a, double b) {
		System.out.println("I am float and double");
	}

	static void m1(double a, double b) {
		System.out.println("I am double and double");
	}

	static void m1(double a, float b) {
		System.out.println("I am double and float");
	}*/

	public static void main(String[] args) {
		
		m1(45);
		m1("Ram",45);
		m1("Hari");
		//m1(10.2f,458.025);//float and double
		//m1(45.02,145.00);//double and double
		m1((int)45000.800f,(int)65.02f);//float and float
		
		//m1(452.256,785.0f);
		
		
		
		
		
	}

}
