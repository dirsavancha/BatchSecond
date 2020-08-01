package com.training.practice.generics;

import java.util.ArrayList;
import java.util.List;

class Test{
public static void add(List <? super Float> li) {
		
		System.out.println(li);
		
	}
}

public class LowerBound {
	public static void main(String[] args) {
		List<Number> obj=new ArrayList<>();
		//obj.add("Hello");
		obj.add(100);
		List<Integer> obj2=new ArrayList<>();
		//obj2.add(101.0f);
		
		
	}

}

