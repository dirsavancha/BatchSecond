package com.training.practice.typecasting;

import java.util.PrimitiveIterator;

class First{
	void m1() {
		System.out.println("I am First class M1 method");
	}
	void m3() {
		System.out.println("I am First class m3 Method");
	}
}
class Second extends First{
	void m1() {
		System.out.println("I am Second class M1 Method");
	}
	void m2() {
		System.out.println("I am Second class M2 Method");
	}
}

public class NonPrimitiveDatatype {
  public static void main(String[] args) {
	First f1=new First();
	f1.m1();
	f1.m3();
	
	
	
	Second sc=new Second();
	sc.m1();
	sc.m2();
	sc.m3();
	
	First f2=new Second();//--->IMPLICIT_cat-->child pointing to parent
	f2.m1();
	f2.m3();
	
	/*Second obj=(Second) new First();// Explicit casting as well narrowing--->Parent is pointing to child
	
	obj.m1();
	obj.m2();
	obj.m3();*/
	  
	  Second s3=(Second)f2;
	  s3.m1();
	  s3.m2();
	  s3.m3();
	
	 
	  
	  
	  
			
}
}
