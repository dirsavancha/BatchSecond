// Intro to Local Variables
// Local variables should be declare and initilize inside a block only


public class LocalVariables{
	 int i;
	
	 void local(){
		 

		 i=100; //reinitilized instance variable
		 System.out.println(i);
		int i=10;//local variable
		i=20; //reintilized loacal variable
		System.out.println(i);
		
	}
	public static void main(String...abc){
		LocalVariables lv=new LocalVariables();
		lv.local();
		
		
	}
}