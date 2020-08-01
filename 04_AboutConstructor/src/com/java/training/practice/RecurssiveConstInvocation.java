// Demo on Recurssive Constructor
package com.java.training.practice;

public class RecurssiveConstInvocation{
	int emp_Id;
	String emp_Name;
	float emp_Sal;
	
	RecurssiveConstInvocation(int id){
		this("Hari"); // compilation error
		this.emp_Id=id;
	}
	RecurssiveConstInvocation(String name){
		this(1000.0f);
		this.emp_Name=name;
	}
	RecurssiveConstInvocation(float sal){
		this(101);
		this.emp_Sal=sal;
	}
	void display(){
		System.out.println("Name :"+emp_Name+"\t"+"Id "+emp_Id+"\t"+"Salary "+emp_Sal);
	}
	public static void main(String...abc){
		RecurssiveConstInvocation obj=new RecurssiveConstInvocation("Ram");
		obj.display();
		
	}
}