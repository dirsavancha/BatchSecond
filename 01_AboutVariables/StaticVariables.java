//static variables

public class StaticVariables{
	
	static int x=123;
	       int y=456;
		   void staticMethod(){
			   
			   System.out.println(StaticVariables.x);// op  123
			   System.out.println(y);// op  456
			   x=789;
			   System.out.println(x);
		   }
	public static void main(String...abc){
		StaticVariables obj=new StaticVariables();
		obj.staticMethod();
	}
}