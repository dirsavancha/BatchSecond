package com.java.training.practice;

class InternMethod{
	public static void main(String...abc){
		
		String s1=new String("chennai");
		String s2="chennai";
		System.out.println(s1==s2);// false
		s1=s1.intern();
		System.out.println(s1==s2);// true
	}
	
}