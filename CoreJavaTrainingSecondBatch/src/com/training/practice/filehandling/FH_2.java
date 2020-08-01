package com.training.practice.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FH_2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("File.txt");
		
		byte [] b=new byte[fis.read()];
		
		int i=0;
		while((i=fis.read())!= -1) {
			System.out.print((char)i);
		}
	}

}
