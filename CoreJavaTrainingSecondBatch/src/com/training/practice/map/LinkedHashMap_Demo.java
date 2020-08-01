package com.training.practice.map;

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {
	public static void main(String[] args) {
		LinkedHashMap<String,Float>	 lhm=new LinkedHashMap<>();
		lhm.put("Tom",500.25f);
		lhm.put("Shettal",800.00f);
		lhm.put("John",10000.250f);
		lhm.put("Tom",25000.250f);
		System.out.println(lhm);
		System.out.println(lhm.entrySet());
		System.out.println(lhm.size());
		
	
	}

}
