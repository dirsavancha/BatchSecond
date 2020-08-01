// Demo on Copy constructor
package com.java.training.practice;

public class CopyConstructor{
	String emp_Name;
	
	CopyConstructor(String name){
		this.emp_Name=name;
		
		
	}
	/*void display(){
		System.out.println("Name :"+emp_Name);
	}*/
	public String toString(){
		return "Name :"+emp_Name;
	}
	public static void main(String...abc){
		CopyConstructor obj1=new CopyConstructor("Hyderabad");
		//obj1.display();// o/p:Hyderbad
		System.out.println(obj1.toString());
		CopyConstructor obj2=new CopyConstructor(obj1.toString());
		//obj2.display();
		System.out.println(obj2.toString());
		
	}
	
}