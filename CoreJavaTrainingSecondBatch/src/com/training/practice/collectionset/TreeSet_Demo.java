package com.training.practice.collectionset;

import java.util.TreeSet;

public class TreeSet_Demo {
	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<>();
		t.add("mango");
		//t.add(null);
		t.add("mango");
		
		t.add("apple");
		t.add("bananana");
		t.add("apricot");
		t.forEach(fruitName->System.out.println(fruitName));
		//System.out.println(t.pollLast());
		System.out.println("=========");
		//t.forEach(fruitName->System.out.println(fruitName));
		
		
		
		
		
	}

}
