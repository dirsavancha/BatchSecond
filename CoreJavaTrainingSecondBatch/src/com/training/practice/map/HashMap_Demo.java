package com.training.practice.map;

import java.util.HashMap;

public class HashMap_Demo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(101, "John");
		hm.put(102, "Smith");
		hm.put(103, "Allen");
		hm.put(101, "Robert");//
		hm.put(104, "Allen");
		hm.put(null,"peter");
		hm.put(null,"James");
		hm.put(105,null);
		hm.put(106,null);
		System.out.println(hm);
		System.out.println("Iam get ():"+hm.get(101));
		System.out.println("I am entryset():"+hm.entrySet());
		
		System.out.println("Total size ():"+hm.size());
		System.out.println("Key set():"+hm.keySet());
		System.out.println("Values():"+hm.values());
	}

}
