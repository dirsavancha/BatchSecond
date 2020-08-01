package com.training.practice.collectionList;

import java.util.Stack;

public class Stack_Demo {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.add(100);
		st.add(20);
		st.add(10);
		st.add(1);
		st.add(500);
		System.out.println(st.peek());
		
		System.out.println(st.push(5));
		System.out.println(st.peek());
		
	}

}
