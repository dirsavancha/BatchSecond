package com.training.practice.generics;

public class Generic2 {
	
	static <T> void m1(T [] arr) {
		for(T ele:arr) {
			System.out.println(ele);
		}
		
	}
	public static void main(String[] args) {
		Integer [] arr1= {100,200,300};
		Generic2.m1(arr1);
		String [] arr2= {"Ram","Hari","abc"};
		Generic2.m1(arr2);
		Float [ ] arr3= {100.1f,500.5f};
		Generic2.m1(arr3);
	}

}
