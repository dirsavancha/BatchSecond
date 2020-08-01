package com.training.practice.nestedclasses;

class Outer{
	void display() {
		System.out.println("I am Outer class display method");
	}
	class Inner{
		void display() {
			System.out.println("I am inner class display method");
		}
	}
}
 

public class InnerClass_1Test {
  public static void main(String[] args) {
	
	  Outer u=new Outer();
	     Outer.Inner oi=u.new Inner();
	     oi.display();// 1 St way
	     
	     Outer.Inner oi1=new Outer().new Inner();
	     oi1.display();// 2nd way
	     
	      new Outer().new Inner().display();// 3rd way
	      
	      new Outer().display();
			  
	  
}
}



