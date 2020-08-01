package com.training.practice.collectionset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("mango");
		lhs.add("apple");
		lhs.add("chikoo");
		lhs.add(null);
		lhs.add("mango");
		lhs.add(null);
		lhs.forEach(fruits->System.out.println(fruits));
		
		
		
		
	}

}
