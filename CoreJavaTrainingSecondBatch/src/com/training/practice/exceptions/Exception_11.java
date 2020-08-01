// User Defined Exceptions

package com.training.practice.exceptions;

public class Exception_11 {
	
	
  public static void main(String[] args) {
	int a=10;
	
	try {
		int b=a/0;
	}catch (ArithmeticException e) {
		e.printStackTrace();
		throw e;// terminate 
	}catch (Exception e) {
		e.printStackTrace();
	}
}

}
