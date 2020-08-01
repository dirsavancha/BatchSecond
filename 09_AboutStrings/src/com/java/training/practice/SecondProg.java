// Diffrence between String class equals method and customized class equals method

package com.java.training.practice;

class Customer{
	int id;
	Customer(int id){
		this.id=id;
	}
	void show(){
		System.out.println("ID is:"+id);
	}
	
	public boolean equals(Customer c){
	  if(this.id!=c.id){
		  return false;
	  }
	  return true;
	}
}


public class SecondProg{
	static void m1(){
		String s1="chennai";
		String s2=new String("chennai");
		System.out.println(s1.equals(s2));// true
	}
	public static void main(String...abc){
		m1();
		Customer c1=new Customer(10);
		Customer c2=new Customer(10);
		
		System.out.println("Comparing Customized class"+" "+c1.equals(c2));// false
	}
   
   
}