package com.training.practice.interfaces;

public interface Demo {

	
	int i=100;
	public abstract void m1();
}
class A implements Demo{
	@Override
	public void m1() {
		System.out.println("");
	}
}
