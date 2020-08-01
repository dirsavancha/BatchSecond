// Sorting Techiniqu

package com.java.training.practice;
import java.util.*;


class Sorting{
	
	static void method_1(int[] arr){
		/*for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<=arr.length-1;j++){
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}*/
		Arrays.sort(arr);
		for(int ele:arr){
			System.out.println(ele);
		}
		
	}
}

public class SortingTest{
	public static void main(String...abc){
		Sorting.method_1(new int[]{10,5,4,8,3,6});// 345610
	}
}



