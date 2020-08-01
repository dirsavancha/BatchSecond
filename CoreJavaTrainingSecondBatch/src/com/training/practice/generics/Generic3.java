package com.training.practice.generics;

interface Animal <T> {

	void categoryOfAnimal(T animal);
}

class AnyAnimal<T> implements Animal<T>{
	@Override
	public void categoryOfAnimal(T animal) {
       
		String str=animal.getClass().getName();
		System.out.println(str);
		if(str.endsWith("Cat")) {
			System.out.println("Cat is a pet animal");
		}else if (str.endsWith("Lion")) {
			System.out.println("Lion is a Wild animal");
		}
		
	}
}
class Cat{
	
}
class Lion{
	
}

public class Generic3<T>   {
	public static void main(String[] args) {
		Cat c=new Cat();
		AnyAnimal<Cat> obj=new AnyAnimal<>();
		obj.categoryOfAnimal(c);
		
		Lion l=new Lion();
		AnyAnimal<Lion> obj1=new AnyAnimal<>();
		obj1.categoryOfAnimal(l);
	}

}

