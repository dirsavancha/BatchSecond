package com.training.practice.exceptions;

public class Exception_3 {
	static void calculation() {
		  System.out.println("start");
		 try {
			 int i=10/0; 
		 }catch(ArithmeticException e) {
			 System.out.println(e);
		 }
		  
		  
		  System.out.println("End");
	}
	static void m1() {
		try {
		System.out.println("Start");
		int i=10/0;
		System.out.println("Ended");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		//calculation();
		m1();
	}

}
