package com.training.practice.exceptions;


public class Exception_2 {  
	static void grandfather() {
		father();
	}
	static void father() {
		son();
	}
	static void son() { // exception
		System.out.println(1500/0);
	}
	
	

	public static void main(String[] args) {
         grandfather();
	}

}
