//
package com.java.training.practice;


public class FirstProg{
	public static void main(String...abc){
		StringBuffer sb1=new StringBuffer("chennai");
		StringBuffer sb2=new StringBuffer("chennai");
		
		String s1="chennai";
		String s2=new String("chennai");
		String s3=new String("hyderabad");
		String s4="hyderabad";
		String s5="chennai";
		String s6="Hyderabad";
		String s7=new String("hyderabad");
		
		/*System.out.println(s1==s2);//false
		System.out.println(s1==s5);//true
		System.out.println(s1==s3);//false
		System.out.println(s3==s4);//false
		System.out.println(s4==s6);//true*/



 // .equals() in  string calss will checks the content of two objects
		System.out.println(s1.equals(s2));   
		System.out.println(sb1.equals(sb2));  

		
	}
}