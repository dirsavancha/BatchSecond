

package com.java.training.practice;

class Prog_3{

    void method(){
		int [] arr=new int[4];//--- we can four values 
System.out.println("My array Length is: "+arr.length);		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		
		for(int ele:arr){
			System.out.println(ele);
		}
	
	}
	

}

public class Prog_3Test{
	
	public static void main(String...abc){
		Prog_3 obj=new Prog_3();
		obj.method();
		
	}
}