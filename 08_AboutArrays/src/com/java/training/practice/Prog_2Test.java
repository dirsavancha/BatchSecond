// 

package com.java.training.practice;

class Prog_2{
	
	void arrayMethod(){
	int [] arr={10,20,30,40,50};
	int [] arr2={};
	System.out.println("Array length is:"+arr.length);
	System.out.println("Array length is:"+arr2.length);
	//System.out.println("Array length is:"+arr2[0]);
	
	/*for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		
	}
	for(int ele:arr){ // enhanced forloop--for each advanced
		System.out.println(ele);
	}*/
	
	}
}

public class Prog_2Test{
	public static void main(String...abc){
		Prog_2 obj=new Prog_2();
		obj.arrayMethod();
	}
}