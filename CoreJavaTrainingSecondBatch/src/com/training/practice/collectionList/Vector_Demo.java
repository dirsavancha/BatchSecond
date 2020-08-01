package com.training.practice.collectionList;

import java.util.Vector;

public class Vector_Demo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(100);
		v.add(200);
		v.add(null);
		v.add(200);
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
	}

}
