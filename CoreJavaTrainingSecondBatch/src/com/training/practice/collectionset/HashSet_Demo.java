package com.training.practice.collectionset;

import java.util.HashSet;

public class HashSet_Demo {
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("hyderabad");
		hs.add("chennai");
		hs.add(null);
		hs.add("hyderabad");
		hs.add(null);
		System.out.println(hs);
		
	}

}
