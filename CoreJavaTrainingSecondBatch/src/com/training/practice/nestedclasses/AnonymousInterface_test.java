package com.training.practice.nestedclasses;

import sun.applet.Main;

interface Animal {
	void dog();
}

public class AnonymousInterface_test {
	public static void main(String[] args) {
		Animal an = new Animal() {
        public void dog() {
        	System.out.println("I am bark");
        }
		};
		an.dog();
		Animal an1=new Animal() {
			
			@Override
			public void dog() {
				System.out.println("I can walk");
			}
		};
		an1.dog();
		System.out.println(an.getClass().getName());
		System.out.println(an1.getClass().getName());
		
	}
}
