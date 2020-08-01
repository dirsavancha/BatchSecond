
package com.java.training.practice.pack1;
public class A{
	
	private void m1(){
		System.out.println("I am private method from A class");
	}
	 void m2(){
		System.out.println("I am default method from A class");
	}
	protected void m3(){
		System.out.println("I am protected method from A class");
	}
	public void m4(){
		System.out.println("I am public method from A class");
	}
	
	public static void main(String...abc){
		A a=new A();
		a.m1();//op private
		a.m2();  // op def
		a.m3();// prote
		a.m4();//public
	}
}