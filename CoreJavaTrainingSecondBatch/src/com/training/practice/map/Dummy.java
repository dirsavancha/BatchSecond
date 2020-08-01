package com.training.practice.map;

public class Dummy {

	static void m1() {
		System.out.println("m1 method");
          int i=10/0;
	}

	static void m2() {
		System.out.println("m2 method");

	}

	public static void main(String[] args) throws InterruptedException {
    
		  m1();
		  Thread.sleep(5000);
		  m2();
		  
		
	}

}
