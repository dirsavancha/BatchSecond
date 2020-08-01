
package com.java.training.practice;

public class Example{
	
	String name;
	int id;
	float sal;
	// constructor can overloading
	// Constructors cant Override
	//Constructors cant inherite
	
	
	Example(String person,int number){
		
		System.out.println("I am 2 arg const");
		this.name=person;
		this.id=number;
		
	}
	Example(String name,int id,float sal){
		System.out.println("I am 3 arg const");
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	Example(int id,String name,float sal){
		System.out.println("I am 3 arg const");
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	
	
	void display(){
		System.out.println("Name is "+name+"id is "+id+"slaray is "+sal);
	}
	
	public static void main(String...abc){
		
		Example ex=new Example("ram",100);
		ex.display();
		
		Example ex1=new Example("Yeswanth",101,10000.0f);// String,int float
		//ex1.display();
		
		Example ex2=new Example(101,"Ram",444.0f);// int,string,float
		//ex2.display();
	}
	

	
}