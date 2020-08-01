// Another way passing parm

package com.java.training.practice;

class Prog_8{
	 static void passingParm(int[] marks){
		 for(int ele:marks){
			 System.out.println(ele);
		 }
	 }
}

public class Prog_8Test{
	public static void main(String[]args){
		
		
		Prog_8.passingParm(new int[]{10,20,30,40});
	}
}