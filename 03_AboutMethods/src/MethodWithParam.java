// Method with parameter

public class MethodWithParam{
	
		
	int a,b;
	void m1(int a){
		 System.out.println(a);
	 }
	 int m2(int a,int b){
		 
		 return a+b;
	 }
	 
	 public static void main(String...abc){
		 
		 MethodWithParam obj=new MethodWithParam();
		 obj.m1(101);
		 
		  MethodWithParam obj1=new MethodWithParam();
		  obj1.m1(102);
		  
		  
		  // When ever having return type it is a better practorice store the object value in to same data type
		 int add= obj.m2(1,2);
		 System.out.println(add);
	 }
}

// Non method with retuen and without retuen
// parameter method with param and return type