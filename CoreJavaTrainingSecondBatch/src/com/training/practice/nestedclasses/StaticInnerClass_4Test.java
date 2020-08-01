package com.training.practice.nestedclasses;

class Outer4 {

	static class Inner4 {
		int i = 100;
		static int j = 200;
		final int k = 300;
		private int l = 400;

		static void m1() {
			System.out.println(j);
		}

		void m2() {
			System.out.println(i + " " + j + " " + k + " " + l);
		}
	}
}

class StaticInnerClass_4Test {
	public static void main(String[] args) {
		Outer4.Inner4 oi4 = new Outer4.Inner4();
		oi4.m1();
		oi4.m2();
	}
	
	

}
