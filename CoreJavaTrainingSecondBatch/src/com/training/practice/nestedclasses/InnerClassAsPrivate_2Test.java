package com.training.practice.nestedclasses;

class Outer2 {

	private class Inner2 {
		void display() {
			System.out.println("I am private inner class display method");
		}
	}
	void outerm1() {
		Inner2 i2=new Inner2();
		i2.display();
	}
}

public class InnerClassAsPrivate_2Test {
	public static void main(String[] args) {
        new Outer2().outerm1();
	}
}
