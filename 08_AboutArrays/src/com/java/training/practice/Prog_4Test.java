

package com.java.training.practice;
import java.util.*;
class Prog_4{

    void method(){
		int [] arr=new int[3];//--- we can four values 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter values");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("=====");
		for(int ele:arr){
			System.out.println(ele);
		}
	
	}
	

}

public class Prog_4Test{
	
	public static void main(String...abc){
		Prog_4 obj=new Prog_4();
		obj.method();
		
	}
}