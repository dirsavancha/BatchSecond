// Demo on methods

// A method should declare inside a class
// A method which is used to perform actions by using the properties(variables).

//How many ways can we declare method.
1.Non-parameterized method
 -- with return type
 --without returntype
2.parameterized method
   -- with return type
 --without returntype
 
public class Method_Demo{
	
	int i=10,j=20;
	
	
	void addition(){
		int a=i+j;
		System.out.println(a);
	}
	public static void main(String...abc){
		Method_Demo obj=new Method_Demo();
		obj.addition();
	}
}