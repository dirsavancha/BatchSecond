// Intro for Instance Variable

public class InstanceVariable{
	//int a=1000;
	int b;
	void instanceVariableMethod(){
		//System.out.println(a);//o/p  1000
		System.out.println(b); //o/p 0 default value becuase we not initilize
		b=2000;
		System.out.println(b);// o/p 2000 inintilized instance variable
		b=3000;
		System.out.println(b);// o/p 3000 reinintilized instance variable
		//a=5000;
		//System.out.println(a);// o/p 5000 reinintilized instance variable
		int a=-5000;
		System.out.println(a); // it is treated as local variable
		a=8000;
		System.out.println(a);
	}
	public static void main(String...abc){
		
		InstanceVariable obj=new InstanceVariable();
		obj.instanceVariableMethod();
	}
}