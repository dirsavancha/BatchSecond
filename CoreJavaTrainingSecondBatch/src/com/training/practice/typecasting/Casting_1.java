package com.training.practice.typecasting;

public class Casting_1 {
	public static void main(String[] args) {
		short s = 100;
		int i = s;
		System.out.println(s);
       
		
		float f=200.025f;
		double d=f;
		System.out.println(d);
		
		//byte--short--char--int--long--float--double
		
		char ch='A';
		int i3=ch;
		System.out.println(ch);
		
		// narrowing--Explicity
		
		int i5=500;
		short s2=(short)i5;
		System.out.println(s2);
		
		float f2=25000.558f;// data loss
		int i6=(int)f2;
		System.out.println(i6);
		
		int a=66;
		char c=(char)a;
		System.out.println(c);
		
	}

}
