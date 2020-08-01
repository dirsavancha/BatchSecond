package com.training.practice.usecase.tea;

abstract public class Tea {

	String typeOfTea;
	
	public Tea(String typeOfTea) {
		this.typeOfTea=typeOfTea;
	}
	
	public abstract void teaPrice();
	
}
