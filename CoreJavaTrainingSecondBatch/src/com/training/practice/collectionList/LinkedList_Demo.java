package com.training.practice.collectionList;

import java.util.LinkedList;

public class LinkedList_Demo {
	
	public static void main(String[] args) {
		
		
		LinkedList<String > place=new LinkedList<>();
		place.add("hyderbad");
		place.add("bangalore");
		place.add(null);
		place.add("hyderbad");
		place.add(null);
		place.add("chennai");
		place.add("Hyderbad");
		System.out.println(place);
		
		LinkedList<String> li2=new LinkedList<>();
		li2.add("");
		li2.add("Andhra");
		li2.add("Mumbai");
		
		System.out.println("Before adding collection "+li2);
		li2.addAll(place);
		System.out.println("After Adding collection "+li2);
		System.out.println("element"+li2.element());
		System.out.println("getFirst"+li2.getFirst());
		
		
				
	}

}
