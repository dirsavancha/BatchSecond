package com.training.practice.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FH_4 {
	public static void main(String[] args) throws IOException {

		 try(FileWriter fw=new FileWriter("D:\\FileWriter.txt");
				 BufferedWriter bw=new BufferedWriter(fw)){
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Eneter the values");
			 String s=sc.nextLine();
			   bw.write(s);
			 
		 }
		 try(FileReader fr=new FileReader("D:\\FileWriter.txt");BufferedReader br=new BufferedReader(fr)){
			 System.out.println(br.readLine());
		 }
		  
	}

}
