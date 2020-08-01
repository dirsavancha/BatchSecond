package com.training.practice.usecase.tea;

public class LemonTea extends Tea {

	public LemonTea(String teaType) {
		super(teaType);
	}
	@Override
	public void teaPrice() {
		System.out.println("Lemon Tea price is : 40/-");
	}
}
