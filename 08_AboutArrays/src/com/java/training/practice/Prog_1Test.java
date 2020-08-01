// Arrays Basics

package com.java.training.practice;

class Prog_1{
	
	void createAnArray(){
		int [] arr={1,2,3,4,5};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}

public class Prog_1Test{
	public static void main(String...abc){
		Prog_1 obj=new Prog_1();
		obj.createAnArray();
	}
	
}
