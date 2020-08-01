// Local Variables Demo
// Should declare and initilized inside a block
// Scope of Variable is up to inside that particular block or method_1
// Local variables will not have default values



public class LocalVariables_Demo{
	
	void method_1(){
		//int b; // declartion
		int a=100;   //----> declared and initilized
		System.out.println(b);
	}
	
	void method_2(){
		System.out.println(a);
	}
	
	
	public static void main(String...abc){
		LocalVariables_Demo lv=new LocalVariables_Demo();
		 lv.method_1();
		
	}
}


