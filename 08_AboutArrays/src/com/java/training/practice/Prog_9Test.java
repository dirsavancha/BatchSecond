// pass multiple array as parameters


package com.java.training.practice;

class Prog_9{
	/*static void arrayMethod(String[] name,int[] marks){
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]+" "+marks[i]);
		}
		
	}*/
	static void arrayMethod(String name,int... marks){
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]+" "+marks[i]);
		}
		
	}
}

public class Prog_9Test{
	
	public static void main(String...abc){
		//String [] arr={"Ram","Hari"};
		//int[] arr2={100,101};
		//Prog_9.arrayMethod(arr +""+arr2);
		Prog_9.arrayMethod(new String[] {"Ram","Hari"},new int[] {100,101});
	}
}