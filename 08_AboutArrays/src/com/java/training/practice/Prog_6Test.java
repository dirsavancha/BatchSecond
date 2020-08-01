// passing array as parameter

package com.java.training.practice;

class PassingParameterAsAnArray{
	 static void passingParm(int[] marks){
		 for(int ele:marks){
			 System.out.println(ele);
		 }
	 }
}

public class Prog_6Test{
	public static void main(String...args){
		int[] arr={10,20,30,40};
		PassingParameterAsAnArray.passingParm(arr);
	}
}
