// Non parameterized method with out retuen type



public class NonParm_WithOutReturnType{
	    String name="Ram";    
		int id=101;
		
		int a=100,b=200;
		int c;
		
	   void withOutReturn(){
		   System.out.println("My Name is "+name+" My Id is "+id);
	   }
	   
	   int withReturnType(){
		   
	    c=a+b;
		System.out.println(c);
		return c ; 
		   
	   }
	   
	
	public static void main(String...abc){
		NonParm_WithOutReturnType obj=new NonParm_WithOutReturnType();
		//obj.withOutReturn();
		obj.withReturnType();
	}
}