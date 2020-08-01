package com.training.practice.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Exception_9 {
	public static void main(String[] args) throws FileNotFoundException,IOException {
      
		try(FileInputStream fis= new FileInputStream("C:\\abc.txt")) {
			PrintWriter pWriter=new PrintWriter("");
			pWriter.print("abc");
			
		} 
		
	}
	
	
	

}
