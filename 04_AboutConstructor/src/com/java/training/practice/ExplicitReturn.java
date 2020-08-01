// Explicitly return will not have
// implicitly return-- should conatin same class name and it should return newobject class


public class ExplicitReturn{
	
	ExplicitReturn ExplicitReturn(){   // default
		System.out.println("I am default constructor with return type implicitly");
		return new ExplicitReturn();
	}
	
	
	public static void main(String...abc){
		ExplicitReturn obj=new ExplicitReturn();
	}
}