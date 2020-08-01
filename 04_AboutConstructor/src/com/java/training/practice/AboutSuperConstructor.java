// About Super Constructor

package com.java.training.practice;


class Parent{
	Parent(){
		System.out.println("I am Parent class Constructor");
	}
}
public class AboutSuperConstructor extends Parent {
	
	AboutSuperConstructor(){
		
		System.out.println("I am child class Constructor");
	}
	public static void main(String...abc){
		
		AboutSuperConstructor obj=new AboutSuperConstructor();
	}
}




