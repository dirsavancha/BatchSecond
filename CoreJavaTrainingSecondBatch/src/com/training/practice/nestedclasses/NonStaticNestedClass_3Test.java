package com.training.practice.nestedclasses;

class Outer3 {
	int i = 100;
	static int j = 200;
	final int k = 300;
	private int l = 400;

	class Inner3 {
		int i = 10;
		// static int j=20;
		final int k = 30;
		private int l = 40;

		void display() {
			int i = 1;
			//static int j = 2;
			final int k = 3;
			//private int l = 4;
			System.out.println("Outer class Variables" + new Outer3().i + " " + new Outer3().j + " " + " "
					+ new Outer3().k + " " + new Outer3().l);
			System.out.println("Inner class Variables" + i + " " + j + " " + " " + k + " " + l);
			System.out.println("Inner class MethodLocalVariables" + i + " " + j + " " + " " + k + " " + l);
		}

	}
}

public class NonStaticNestedClass_3Test {
	public static void main(String[] args) {
		new Outer3().new Inner3().display();
	}
}
