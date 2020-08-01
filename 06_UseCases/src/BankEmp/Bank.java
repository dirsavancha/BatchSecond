
package BankEmp;

public class Bank{
	
	String name;
	Bank(String name){
		this.name=name;
	}
	public Bank(){
		
	}
   
   
   public void savingsAccountDetails(){
     System.out.println("I am Saving Acount details from Bank class");
   }
   protected void corporateCurrentAccount(){
     System.out.println("I am corporate Current Account ");
   }
     void hrmsApp(){  // performing banking works
	  System.out.println("I am Hrms");
	 }
	 private void empInformation(){
	   System.out.println("I am Bank Employee Information");
	 }
	 public static void main(String...abc){
		/* Bank obj=new Bank("Srilakshmi");
		 obj.empInformation();
		 Bank obj1=new Bank("Prasanna");
		  obj1.empInformation();
		   Bank obj2=new Bank();*/
	 }

}