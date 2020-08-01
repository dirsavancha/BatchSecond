// classes are written in java file
// how many class can we write?
// A file can contain n number of classes 
// A file  can contain only one public class  and should be created with the file name

class A{
	public static void main(String...abc){
		System.out.println("I am  from A class");
	}
}

class B{
	public static void main(String...abc){
		System.out.println("I am  from B class");
		
	}
}

class C{
	void method(){
		System.out.println("I am  from C method");
	}
	
}

public class JavaFiles{
	public static void main(String...abc){
		System.out.println("I am  from JavaFiles class");
		C obj=new C();
		obj.method();
	}
}






