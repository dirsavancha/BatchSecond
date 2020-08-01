// String Methods

package com.java.training.practice;


class Prog_4{
	
	static void show(){
		String s1="I am from hyderabad";
		
		String s2="null";
		String s3="Rose";
		//char [] s4=s3.toCharArray();
		System.out.println(s1.length());
		char ch=s1.charAt(2);
		System.out.println(ch);
		System.out.println(s2.isEmpty());// false  
//String str=s3.replace('o','a');	
System.out.println(s3.replace('o','a'));	
		
	}
}
public class Prog_4Test{
	public static void main(String...abc){
		
		Prog_4.show();
	}
}


