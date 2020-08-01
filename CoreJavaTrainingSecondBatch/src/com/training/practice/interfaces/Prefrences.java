package com.training.practice.interfaces;

interface I1{
	
	default void Show() {
		System.out.println("I am I1");
	}
	
}
interface I2 extends I1{
	default void Show(){
		
	System.out.println("I am I2");
		
	}
}

public class Prefrences implements I1,I2 {

	
	public static void main(String[] args) {
		Prefrences pf=new Prefrences();
		pf.Show();
	}
}
