package com.training.practice.collectionList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ArrayList_1 {
	
	public static void main(String[] args) {
		
		
		String s1="hello";
		String s2="abc";
		String s3="xyz";
		System.out.println(s1.compareTo(s2));
		ArrayList<String> alArrayList=new ArrayList<>();
		alArrayList.add(s2);
		alArrayList.add(s1);
		
		alArrayList.add(s3);
		
		System.out.println();
		//Collection<String> cl=new ArrayList<>();
		
		//List<String> mpList=new ArrayList<>();
		
		
		ArrayList<String> fruits=new ArrayList<>();
		  fruits.add("Mango");
		  fruits.add(null);
		  fruits.add("Mango");
		  fruits.add("Chikkoo");
		  fruits.add(null);
		  
		  
		/*  System.out.println(fruits);
		  
		  System.out.println("2nd index value is:"+fruits.get(2));
		  System.out.println("Chikkoo is present or not :"+fruits.contains("Chikkoo"));
		  System.out.println(fruits.isEmpty());
		  System.out.println("ArrayList Size is :"+fruits.size());
		  System.out.println("Seting the value in middle :"+fruits.set(2, "Bannana"));
		  System.out.println(fruits);*/
		  
		  
		  //for loop
		  for(int i=0;i<fruits.size();i++) {
			  System.out.println(fruits.get(i));
			  
		  }
		  System.out.println("=====Enhanced forloop====");
		  // enhanced 
		  for(String ele:fruits) {
			  System.out.println(ele);
		  }
		  
		  System.out.println("=====Iterator====");
		  Iterator<String> itr=fruits.iterator(); // one directions forward
		  
		  while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		  System.out.println("=====List Iterator forward====");
		  ListIterator <String> litr= fruits.listIterator();  //Bi directional forward backward
		  while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		  System.out.println("=====ListIterator backward====");
		  
			  while (litr.hasPrevious()) {
				System.out.println(litr.previous());
			
		}
		System.out.println("Lambda Expression");
		  fruits.forEach(value->System.out.println(value));
		 int[] arr= {};
		Arrays.sort(arr);
		
	}

	  

}
