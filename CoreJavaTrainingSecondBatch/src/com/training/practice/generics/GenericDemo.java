package com.training.practice.generics;

public class GenericDemo< T, E> {
	
	T name;
	E id;
	@Override
	public String toString() {
		return "GenericDemo [name=" + name + ", id=" + id + "]";
	}


	public GenericDemo( T name,E id) {
		this.name=name;
		this.id=id;
	}
	
	public static void main(String[] args) {
		GenericDemo<String,Integer> objDemo=new GenericDemo<>("Ram", 101);
		System.out.println(objDemo.toString());
		
		GenericDemo<Float,String> obj2=new GenericDemo<>(10.02f, "Ram");
		System.out.println(obj2.toString());
	}

}
