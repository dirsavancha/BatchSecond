package com.training.practice.exceptions;

public class Exception_8 {
	public static void main(String[] args) {
//(  operation started)
		try {
			int i=4/0;
			
			
		}catch (ArithmeticException e) {
			e.printStackTrace();
			int x=10/0;
		}
		 
		
		finally {
			System.out.println("close oper");
		}
		
	}

}
