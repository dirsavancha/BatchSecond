package com.training.practice.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_5 {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;//--ar
			
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmtic exception"+e);
		}
		catch (Exception e) {
			System.out.println("Exception catch block"+e);
		}
		
		
	}

}
