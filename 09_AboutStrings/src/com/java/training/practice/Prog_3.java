//

package com.java.training.practice;

public class Prog_3{
	
	public static void main(String...abc){
		
		String s1="Welcome to chennai";
		String s2=new String("Welcome to chennai");
		String s3="bangalore";
		String s4=new String("bangalore");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
	/*	String s4="Welcome to "+"chennai";//Welcome tochennai
		System.out.println(s1==s4);
		
		String s5="Welcome to";
		String s6=" chennai";
		String s8=s5+s6;
		System.out.println(s1==s8);// false
		System.out.println(s1.equals(s8));*/
		
		String s5=s4.toLowerCase();
		System.out.println(s4==s5);// true
		System.out.println(s4.equals(s5));
		
		
		
		
		
		
		
	
		
		
		
		
	}
	
}