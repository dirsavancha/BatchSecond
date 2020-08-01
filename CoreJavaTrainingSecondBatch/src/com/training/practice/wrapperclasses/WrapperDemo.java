package com.training.practice.wrapperclasses;

public class WrapperDemo {

	static void autoBoxing() {
		
		Integer i1 = new Integer(100);
		Integer i2=new Integer("100");
		//System.out.println(i1);
		System.out.println(i1==i2); //false
		
		Integer i3=Integer.valueOf(100);
		Integer i4=Integer.valueOf(100);
		System.out.println(i3==i4);//

	}
	
	static void unBoxing() {
		
		Integer i1=new Integer(100);
		Integer i2=new Integer("100");
		Integer i3=new Integer("Hello");
		System.out.println(i3);
		
		Character c=new Character('j');
		
		//int i3=i2.intValue();
		i1.toString();
		// i2=i1.intValue();
		float g=Float.parseFloat("250.025f");
		double d=Double.parseDouble("52564.025");
		
		
	}
	
	

	public static void main(String[] args) {
		//autoBoxing();
		unBoxing();
	}

}
