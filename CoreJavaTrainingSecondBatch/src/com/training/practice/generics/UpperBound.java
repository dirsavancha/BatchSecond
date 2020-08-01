package com.training.practice.generics;

public class UpperBound<T extends Number> {
	
	private T t;
	
	public T getT() {
		return this.t;
	}
	
	
	
	public static void main(String[] args) {
		UpperBound<Float> f1=new UpperBound<>();
		f1.t=100.0f; 
	
		
	}

}



