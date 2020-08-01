package com.training.practice.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FH_3 {
	public static void main(String[] args) throws Exception {
		
		try(FileWriter fW=new FileWriter("src.csv")){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter values");
			String s=sc.nextLine();
			fW.write(s);
			
		}
		try(FileReader fr=new FileReader("src.csv")){
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}
		
		
	}

}
