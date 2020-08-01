package com.training.practice.nestedclasses;

class FiveStarHotel{
	void eating() {
		System.out.println("I am having lunch");
		
	}
}
class ThreeStarHotel extends FiveStarHotel{
	void billing() {
		System.out.println("Paying bill at three star hotel");
		
	}
}
public class AnonymousClass_1Test {
	public static void main(String[] args) {
		FiveStarHotel fh=new FiveStarHotel() {
			@Override
			void eating() {
				super.eating();
				System.out.println("I am Annonymous fivestar eating ");
			}
		};// Anonyomus class
		fh.eating();
	
		
	}

}
