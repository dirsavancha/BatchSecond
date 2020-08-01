package com.training.practice.collectionset;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo {
	public static void main(String[] args) {
		
		Queue<String> qu=new PriorityQueue<>();
		
		
		//qu.add("");
		
		//qu.add("apple");
		//qu.add("orange");
		
		//System.out.println(qu.remove());
		System.out.println(qu.poll());
		System.out.println(""+qu.peek());
		//System.out.println(qu);
		
		
		
		
		
	}

}
