// IF else

package com.java.training.practice;

public class IfElse{
	  int marks;
	  
	  void studentGrade(int marks){
		  if(marks>=70 && marks<=100){
			  System.out.println("Got distiction");
		 
		}
		else if(marks<70 && marks>=60){
		  System.out.println("Got First Class");
		}
		
		else if(marks<60 && marks>=50){
			System.out.println("Got Second Class");
		}
		
		else if(marks<50 && marks>=40){
		  System.out.println("Got Third Class");
		}
		
		else if(marks<40 && marks>=0){
		  System.out.println("Failure");
		}else{ 
		System.out.println("Invalid marks");
		}
}
	  
	  public static void main(String...abc){
		  IfElse obj=new IfElse();
		  obj.studentGrade(50);
		  }
}