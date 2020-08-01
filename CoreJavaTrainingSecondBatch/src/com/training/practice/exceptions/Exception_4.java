package com.training.practice.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_4 {  
	 
	void fileOperation() {
		try {
		FileInputStream io=new FileInputStream("E:\\Java.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
	}

}
