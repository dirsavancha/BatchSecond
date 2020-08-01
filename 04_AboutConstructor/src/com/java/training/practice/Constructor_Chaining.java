// Demo on Constuctor chaining


// A constructor  calling multiple constructor is know as constructor Chaining
package com.java.training.practice;
import java.util.*

public class Constructor_Chaining{
	String emp_Name;
	int emp_Id;
	float emp_Sal;
	parent(){
		kjnkjdnjkfkjdb;
	}
	Constructor_Chaining(String name){
		this(1000.0f);
		this.emp_Name=name;
		
	}
	Constructor_Chaining(int id){
		
		//this("Ram");
		
		this.emp_Id;
	}
	Constructor_Chaining(float sal){
		
		this.emp_Sal=sal;
	}
	void display(){
		System.out.println("Name :"+emp_Name+"\t"+"Id "+emp_Id+"\t"+"Salary "+emp_Sal);
	}
	
	public static void main(String...abc){
		
		Constructor_Chaining obj1=new Constructor_Chaining(1);
		obj1.display();
		
		
		
	}
}

