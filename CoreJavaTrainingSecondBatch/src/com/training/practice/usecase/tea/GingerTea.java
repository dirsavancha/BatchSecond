package com.training.practice.usecase.tea;

public class GingerTea extends Tea {
	public GingerTea(String teaType) {
		super(teaType);
	}
	@Override
	public void teaPrice() {
       System.out.println("Ginger Tea price is : 60/-");		
	}
}