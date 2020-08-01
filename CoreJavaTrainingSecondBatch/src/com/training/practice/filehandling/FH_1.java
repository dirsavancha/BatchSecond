package com.training.practice.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FH_1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=null;
		try {
			 fos=new FileOutputStream("File.xls");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String s="Hello how are you";
		byte[] b= s.getBytes();
		  try {
			fos.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		  fos.close();
	}

}
