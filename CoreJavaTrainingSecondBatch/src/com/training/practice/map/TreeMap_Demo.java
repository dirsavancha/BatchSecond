package com.training.practice.map;

import java.util.TreeMap;

public class TreeMap_Demo {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(108,"Tom");
		tm.put(101,"John");
		tm.put(105,"Shetal");
		tm.put(102,"Allen");
		tm.put(101,"Tom");
		tm.put(109,null);
		
		System.out.println(tm);
		System.out.println(tm.firstEntry());
		
	}

}
